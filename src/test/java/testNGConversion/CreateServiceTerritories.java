package testNGConversion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class CreateServiceTerritories extends BaseClass{
	


@Test	
	public void tc_CreateServiceTerritories() {
	    d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		appLauncher.click();
		WebDriverWait w=new WebDriverWait(d, 60);
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		w.until(ExpectedConditions.elementToBeClickable(viewAll));
		viewAll.click();
		WebElement serviceTerritories=d.findElement(By.xpath("//p[text()='Service Territories']"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView();",serviceTerritories);
		serviceTerritories.click();
		WebElement New=d.findElement(By.xpath("//a[@class='forceActionLink']"));
		New.click();
		WebElement name=d.findElement(By.xpath("//input[@class=' input']"));
		name.sendKeys("K V Naveen Kumar");
		WebElement operatingHours=d.findElement(By.xpath("//input[@title='Search Operating Hours']"));
		operatingHours.click();
		WebElement UKShift=d.findElement(By.xpath("//div[@title='UK Shift']"));
		UKShift.click();
		WebElement active=d.findElement(By.xpath("//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input[@type='checkbox']"));
		active.click();
		WebElement city=d.findElement(By.xpath("//input[@class='city compoundBorderBottom compoundBorderRight input']"));
		city.sendKeys("Chennai");
		WebElement state=d.findElement(By.xpath("//input[@class='state compoundBorderBottom input']"));
		state.sendKeys("TamilNadu");
		WebElement country=d.findElement(By.xpath("//input[@class='country compoundBRRadius input']"));
		country.sendKeys("India");
		WebElement zipcode=d.findElement(By.xpath("//input[@class='postalCode compoundBLRadius compoundBorderRight input']"));
		zipcode.sendKeys("600100");
		WebElement save=d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']"));
		save.click();
		WebElement verifyName=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		System.out.println(verifyName.getText());
		if(verifyName.getText().contains("Naveen")){
			System.out.println("TC PASS");
		}
		else{
			System.out.println("TC FAIL");
		}
		}



}
