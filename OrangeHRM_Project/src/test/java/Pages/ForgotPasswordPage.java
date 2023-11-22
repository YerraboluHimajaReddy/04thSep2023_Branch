package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

	public WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {

		this.driver = driver;
	}

	public By username_Textboox = By.xpath("//input[@name='username']");

	public By resetPassword_Button      = By.xpath("//button[@type='submit']");

	public By cancel_Button     = By.xpath("//button[@type='button']");
	
}
