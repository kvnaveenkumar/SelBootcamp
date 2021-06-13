package testNG;

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

public class BaseClass {
 public RemoteWebDriver d;
 @BeforeMethod
	public void openBrowserandLogin(){
	 	String browserName="chrome";
		if(browserName.equalsIgnoreCase("chrome")){
	 	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //options.addArguments("headless");
        options.addArguments("window-size=1366,768");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		d=new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
		
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		options.addPreference("app.update.enabled", false);
		options.setHeadless(true);
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		d=new FirefoxDriver(options);
		}
		else if(browserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		d=new InternetExplorerDriver();
		}
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://login.salesforce.com/");
		WebElement username=d.findElement(By.id("username"));
		username.sendKeys("cypress@testleaf.com");
		WebElement password=d.findElement(By.id("password"));
		password.sendKeys("Selbootcamp@123");
		WebElement login=d.findElement(By.id("Login"));
		login.click();
		
	}
 @AfterMethod
 public void closeBrowser(){
	// d.quit();
 }
	

}
