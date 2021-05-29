package week1_2.Homework;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteserviceTerritory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		ChromeOptions c=new ChromeOptions();
		c.addArguments("disable-popup-blocking");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://login.salesforce.com/");
		WebElement username=d.findElement(By.id("username"));
		username.sendKeys("cypress@testleaf.com");
		WebElement password=d.findElement(By.id("password"));
		password.sendKeys("Selbootcamp@123");
		WebElement login=d.findElement(By.id("Login"));
		login.click();
		WebDriverWait w=new WebDriverWait(d, 60);
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		w.until(ExpectedConditions.elementToBeClickable(appLauncher));
		appLauncher.click();
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		w.until(ExpectedConditions.elementToBeClickable(viewAll));
		viewAll.click();
		WebElement serviceTerritories=d.findElement(By.xpath("//p[text()='Service Territories']"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView();",serviceTerritories);
		serviceTerritories.click();
		/*WebElement dropdownarrow=d.findElement(By.xpath("(//a[@class='slds-button slds-button_reset']/lightning-icon/lightning-primitive-icon)[15]"));
		w.until(ExpectedConditions.elementToBeClickable(dropdownarrow));
		dropdownarrow.click();*/
		Thread.sleep(5000);
		d.get("https://ap16.lightning.force.com/lightning/o/ServiceTerritory/list?filterName=00B2w00000EpOI6EAN");
		WebElement table1strow=d.findElement(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable']//tr[1]//td[2]//span[@class='slds-grid slds-grid--align-spread']"));
		w.until(ExpectedConditions.elementToBeClickable(table1strow));
		table1strow.click();
		WebElement dropdown=d.findElement(By.xpath("(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
		j.executeScript("arguments[0].scrollIntoView();",dropdown);
		dropdown.click();
		WebElement edit=d.findElement(By.xpath("//a[@title='Delete']"));
		edit.click();
		WebElement delete=d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']"));
		delete.click();
		
		WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		w.until(ExpectedConditions.visibilityOf(toastMessage));
		System.out.println(toastMessage.getText());
		
		}

}
