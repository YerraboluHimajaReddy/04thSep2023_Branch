package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

	public WebDriver driver;

	public SignOutPage(WebDriver driver) {

		this.driver = driver;
	}

	//2nd way
	@CacheLookup
	@FindBy(xpath ="//a[text()='About']")
	public WebElement about_Button;
	
	@FindBy(xpath ="//a[text()='Support']")
	public WebElement support_Button;
	
	@FindBy(xpath ="//a[text()='Change Password']")
	public WebElement changePassword_Button;

	@FindBy(xpath ="//a[text()='Logout']")
	public WebElement logout_Button;


	public void clickLogout() {

		logout_Button.click();
	}
	public void clickChangePassword() {

		changePassword_Button.click();
	}

	public void clickSupport() {

		support_Button.click();
	}

	public void clickAbout() {

		about_Button.click();
	}
}
