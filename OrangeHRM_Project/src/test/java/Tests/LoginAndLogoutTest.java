package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommonClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class LoginAndLogoutTest extends BaseOrCommonClass{
	
	LoginPage lp;
	
	HomePage hp;
	
	SignOutPage sp;
	
	@BeforeSuite
	public void launchBrowser() {

		browserlaunching("chrome");
		
		lp = new LoginPage(driver);
		
		// Syntax: classname objectname = pagefactory.initElements(driver, classname.class);
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		sp = PageFactory.initElements(driver, SignOutPage.class);
		
		maximizeBrowser();

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		launchingTheURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @BeforeClass method");

	}
	
	@BeforeMethod
	public void wait1() {
		
		waitBrowser();
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername() {
		
		lp.enterUserName();
		
		System.out.println("i am in enterUsername method");
	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		lp.enterPassword();
		
		System.out.println("i am in enterPassword method");
	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println("i am in clickLogin method");
	}
	
	@Test(priority = 4)
	public void click_PaulCoolings() {
		
		hp.clickPaulCoolings();
		
		System.out.println("i am in click_PaulCoolings method");
	}
	
	@Test(priority = 5)
	public void click_Logout() {
		
		sp.clickLogout();
		
		System.out.println("i am in click_Logout method");
	}
	
	
	@AfterMethod
	public void wait2() {
		
		waitBrowser();
		
		System.out.println("i am in @AfterMethod method");
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		browserClosing();
		
		System.out.println("i am in @AfterSuite method");

	}


}
