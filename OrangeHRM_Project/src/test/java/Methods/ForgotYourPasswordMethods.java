package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;

public class ForgotYourPasswordMethods {

	public WebDriver driver;

	public ForgotYourPasswordMethods(WebDriver driver) {

		this.driver = driver;
	}
	
	ForgotPasswordPage fp = new ForgotPasswordPage(driver);
	
	public void enterUserName() {

		driver.findElement(fp.username_Textboox).sendKeys("Admin");
	}
	
	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}
	
	public void clickResetPassword() {

		driver.findElement(fp.resetPassword_Button).click();
	}
}
