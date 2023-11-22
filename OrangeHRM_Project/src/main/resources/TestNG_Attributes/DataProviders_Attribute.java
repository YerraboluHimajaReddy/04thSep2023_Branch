package TestNG_Attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG.BaseOrCommonClass;

public class DataProviders_Attribute extends BaseOrCommonClass {

	@BeforeSuite
	public void launchBrowser() {

		browserlaunching("Chrome");

		maximizeBrowser();

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @BeforeClass method");

	}

	@BeforeMethod
	public void wait1() {

		waitBrowser();

		System.out.println("i am in @BeforeMethod method");
	}

	/*
	 * Syntax: public Object[][] methodname(){ Return variablename; }
	 * 
	 */
	@DataProvider(name = "TestData")
	public Object[][] livetech() {

		Object[][] values = new Object[6][2];

		values[0][0] = "amar@gmail.com";

		values[0][1] = "amar";

		values[1][0] = "chandu@gmail.com";

		values[1][1] = "chandu";

		values[2][0] = "bharathi@gmail.com";

		values[2][1] = "bharathi";

		values[3][0] = "subha@gmail.com";

		values[3][1] = "subha";

		values[4][0] = "mouni@gmail.com";

		values[4][1] = "mouni";

		values[5][0] = "sarvani@gmail.com";

		values[5][1] = "sarvani";

		return values;

	}

	@Test(priority = 1, dataProvider = "TestData")
	public void enterCredentais(String username, String password) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

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
