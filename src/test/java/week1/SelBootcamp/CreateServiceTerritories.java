package week1.SelBootcamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateServiceTerritories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.get("https://login.salesforce.com/");
		WebElement username=d.findElement(By.id("username"));
		username.sendKeys("cypress@testleaf.com");
		WebElement password=d.findElement(By.id("password"));
		password.sendKeys("Selbootcamp@123");
		WebElement login=d.findElement(By.id("Login"));
		login.click();
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		appLauncher.click();
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
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
		verifyName.getText().contains("Naveen");
		
		
		}

}
