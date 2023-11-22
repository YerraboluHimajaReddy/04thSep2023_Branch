package TestNG_Assertions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNG.BaseOrCommonClass;

public class Soft_Assertion extends BaseOrCommonClass{


	@BeforeSuite
	public void launchBrowser() {

		browserlaunching("chrome");
		
		maximizeBrowser();

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		launchingTheURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		takeScreenshot("after launching the url");

		System.out.println("i am in @BeforeClass method");

	}
	
	@BeforeMethod
	public void wait1() {
		
		waitBrowser();
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername() throws IOException {
		
		SoftAssert test = new SoftAssert();
		
		String expected = "Bharathi";

		String actual = driver.getTitle();
		
		test.assertEquals(actual, expected);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		takeScreenshot("after entering the username");
		
		System.out.println("i am in enterUsername method");
	}
	
	@Test(priority = 2)
	public void enterPassword() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		takeScreenshot("after entering the password");		
		
		System.out.println("i am in enterPassword method");
	}
	
	@Test(priority = 3)
	public void clickLogin() throws IOException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
						
		System.out.println("i am in clickLogin method");
	}
	
	@AfterMethod
	public void wait2() {
		
		waitBrowser();
		
		System.out.println("i am in @AfterMethod method");
	}
	
	@AfterSuite
	public void closeBrowser() throws IOException {
		
		takeScreenshot("after clicking on the login button");
		
		browserClosing();
		
		System.out.println("i am in @AfterSuite method");

	}

}
