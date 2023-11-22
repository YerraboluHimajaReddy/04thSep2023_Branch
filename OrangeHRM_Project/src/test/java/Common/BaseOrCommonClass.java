package Common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseOrCommonClass {
	
	public WebDriver driver;
	
	public void browserlaunching(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
		}
		
	}
	
	public void launchingTheURL(String url) {
		
		driver.get(url);		
	}
	
	public void browserClosing() {
		
		driver.quit();
	}
	
	public void waitBrowser() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();
	}
	
	public void takeScreenshot(String screenshotName) throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\Users\\himaj\\eclipse-workspace\\04thSep2023Batch\\OrangeHRM_Project\\src\\test\\java\\Screenshots\\"+screenshotName+".png"));
		
	}

}
