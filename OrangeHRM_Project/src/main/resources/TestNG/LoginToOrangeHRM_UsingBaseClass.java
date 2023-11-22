package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginToOrangeHRM_UsingBaseClass extends BaseOrCommonClass{

	@BeforeSuite
	public void launchBrowser() {

		browserlaunching("chrome");
		
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
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("i am in enterUsername method");
	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("i am in enterPassword method");
	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("i am in clickLogin method");
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
