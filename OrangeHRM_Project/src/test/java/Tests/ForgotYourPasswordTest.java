package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommonClass;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class ForgotYourPasswordTest extends BaseOrCommonClass{
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
	
	@BeforeSuite
	public void launchBrowser() {

		browserlaunching("chrome");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);
		
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
	public void clickForgotYourPassword_Link() {
		
	    lp.clickForgotPassword();
		
		System.out.println("i am in clickForgotYourPassword_Link method");
	}
	
	@Test(priority = 2)
	public void enterUsername() {
		
		fpm.enterUserName();
		
		System.out.println("i am in enterUsername method");
	}
	
	@Test(priority = 3)
	public void clickCancel() {
		
		fpm.clickCancel();
		
		System.out.println("i am in clickCancel method");
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
