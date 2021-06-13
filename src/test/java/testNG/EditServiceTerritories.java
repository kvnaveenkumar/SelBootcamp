package testNG;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class EditServiceTerritories extends BaseClass {
@Test
	public  void tc_EditServiceTerrtorories() throws InterruptedException {
	    d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		WebDriverWait wait=new WebDriverWait(d, 60);
		wait.until(ExpectedConditions.elementToBeClickable(appLauncher));
		appLauncher.click();
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		viewAll.click();
		WebElement serviceTerritories=d.findElement(By.xpath("//p[text()='Service Territories']"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView();",serviceTerritories);
		serviceTerritories.click();
		WebElement dropdown=d.findElement(By.xpath("(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
		dropdown.click();
		WebElement edit=d.findElement(By.xpath("//a[@title='Edit']"));
		edit.click();
		String createdBy=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[2]")).getText();
		createdBy=createdBy.split("\\,")[0];
		String modifiedBy=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[3]")).getText();
		modifiedBy=modifiedBy.split("\\,")[0];
		WebElement owner=d.findElement(By.xpath("//div[@class='slds-form-element slds-form-element_readonly slds-grow slds-hint-parent override--slds-form-element']//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only']/span[@class='uiOutputText forceOutputLookup']"));	
		String ownertxt=owner.getText();
		if(createdBy.contains(modifiedBy)){
			System.out.println("TC PASS");
		}
		if(modifiedBy.contains(createdBy)){
			System.out.println("TC PASS");
		}
		if(modifiedBy.contains(ownertxt)){
			System.out.println("TC PASS");
		}
		if(createdBy.contains(ownertxt)){
			System.out.println("TC PASS");
		}
		else{
			System.out.println("TC FAIL");
		}
		WebElement country=d.findElementByXPath("//input[@class='country compoundBRRadius input']");
		j.executeScript("arguments[0].scrollIntoView();",country);
		country.clear();
		country.sendKeys("North America");
		WebElement save=d.findElementByXPath("//button[@title='Save']//span[text()='Save']");
		save.click();
		Thread.sleep(5000);
		WebElement dropdown1=d.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown1));
		dropdown1.click();
		WebElement edit1=d.findElement(By.xpath("//a[@title='Edit']"));
		edit1.click();
		String modifiedByAfter=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[3]")).getText();
		modifiedByAfter=modifiedByAfter.split("\\,")[1];
		if(modifiedBy!=modifiedByAfter){
			System.out.println("TC PASS");
		}
		
		
		
	}}
