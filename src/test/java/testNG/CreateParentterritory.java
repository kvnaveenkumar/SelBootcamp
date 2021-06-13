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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class CreateParentterritory extends BaseClass{

@Test
	public void tc_CreateParrentterritory() {
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
		
		WebElement city=d.findElement(By.xpath("//input[@class='city compoundBorderBottom compoundBorderRight input']"));
		JavascriptExecutor j1=(JavascriptExecutor)d;
		j1.executeScript("arguments[0].scrollIntoView();",city);
		WebElement parentTerritory=d.findElement(By.xpath("//input[@title='Search Service Territories']"));
		parentTerritory.click();
		WebElement newServiceTerritory=d.findElement(By.xpath("//span[@title='New Service Territory']"));
		w.until(ExpectedConditions.elementToBeClickable(newServiceTerritory));
		newServiceTerritory.click();
		d.switchTo().activeElement();
		WebElement name_NewServiceTerritory=d.findElement(By.xpath("(//input[@class=' input'])[2]"));
		name_NewServiceTerritory.sendKeys("Mukesh Ambani");
		WebElement cityNewServiceTerritory=d.findElement(By.xpath("(//input[@class='city compoundBorderBottom compoundBorderRight input'])[2]"));
		j1.executeScript("arguments[0].scrollIntoView();",cityNewServiceTerritory);
		WebElement operatingHours=d.findElement(By.xpath("(//input[@title='Search Operating Hours'])[2]"));
		operatingHours.click();
		WebElement newOperatingHours=d.findElement(By.xpath("//span[@title='New Operating Hours']"));
		w.until(ExpectedConditions.elementToBeClickable(newOperatingHours));
		newOperatingHours.click();
		d.switchTo().activeElement();
		WebElement name_OperatingHours=d.findElement(By.xpath("(//input[@class=' input'])[3]"));
		name_OperatingHours.sendKeys("Mukesh Ambani");
		WebElement timeZone=d.findElement(By.xpath("//a[text()='(GMT-07:00) Pacific Daylight Time (America/Los_Angeles)']"));
		timeZone.click();
		WebElement selectIndiaTime=d.findElement(By.xpath("//a[@title='(GMT+05:30) India Standard Time (Asia/Kolkata)']"));
		w.until(ExpectedConditions.elementToBeClickable(selectIndiaTime));
		selectIndiaTime.click();
		WebElement save=d.findElement(By.xpath("(//button[@title='Save'])[3]"));
		save.click();
		WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		System.out.println(toastMessage.getText());
		WebElement operatingHours_final=d.findElement(By.xpath("//span[@class='pillText']"));
		System.out.println(operatingHours_final.getText());
		WebElement saveNewServiceTerritory=d.findElement(By.xpath("(//button[@title='Save'])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(saveNewServiceTerritory));
		saveNewServiceTerritory.click();
		WebElement toastMessageFinal=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		System.out.println(toastMessageFinal.getText());

	}


}
