package vennilaScript;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class deleteCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://login.salesforce.com/");
		WebElement username=d.findElement(By.id("username"));
		username.sendKeys("cypress@testleaf.com");
		WebElement password=d.findElement(By.id("password"));
		password.sendKeys("Selbootcamp@123");
		WebElement login=d.findElement(By.id("Login"));
		login.click();
		WebDriverWait w= new WebDriverWait(d, 60);
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		w.until(ExpectedConditions.elementToBeClickable(appLauncher));
		Thread.sleep(3000);
		appLauncher.click();
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		viewAll.click();
		WebElement sales=d.findElement(By.xpath("//a[@class='slds-text-heading_small']//span/p[text()='Sales']"));
		sales.click();
		WebElement cases=d.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']//span[text()='Cases']"));
		w.until(ExpectedConditions.elementToBeClickable(cases));
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)d;
		executor.executeScript("arguments[0].click();", cases);
		WebElement dropdown=d.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])[1]"));
		w.until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		WebElement delete=d.findElement(By.xpath("//a[@title='Delete']"));
		delete.click();
		WebElement deletebtn=d.findElement(By.xpath("//button[@title='Delete']"));
		deletebtn.click();
		WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		w.until(ExpectedConditions.visibilityOf(toastMessage));
		if(toastMessage.getText().contains("deleted")){
			System.out.println("TC PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
}
}