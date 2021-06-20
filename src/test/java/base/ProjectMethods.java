package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class ProjectMethods {
	public static ChromeDriver d;
	
	@BeforeMethod
	public void launchBrowser(){
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("window-size=1366,768");
		System.setProperty("webdriver.chrome.driver", "./Driver/new/chromedriver.exe");
		d=new ChromeDriver(options);
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://login.salesforce.com/");
	}
	@AfterMethod
	public void closeBrowser(){
		//d.close();
	}
 
}
