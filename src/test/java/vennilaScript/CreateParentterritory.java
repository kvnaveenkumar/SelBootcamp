package vennilaScript;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateParentterritory {

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
		
		WebElement city=d.findElement(By.xpath("//input[@class='city compoundBorderBottom compoundBorderRight input']"));
		JavascriptExecutor j1=(JavascriptExecutor)d;
		j1.executeScript("arguments[0].scrollIntoView();",city);
		WebElement parentTerritory=d.findElement(By.xpath("//input[@title='Search Service Territories']"));
		parentTerritory.click();
		WebElement newServiceTerritory=d.findElement(By.xpath("//span[@title='New Service Territory']"));
		WebDriverWait w= new WebDriverWait(d, 60);
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement name=d.findElement(By.xpath("//input[@class=' input']"));
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
		WebElement verifyName=d.findElement(By.xpath("(//span[@class='uiOutputText'])[1]"));
		String Output=verifyName.getText();
		if(Output.equals("K V Naveen Kumar")){
			System.out.println("Test case PASS");
		}
		else{
			System.out.println("Test case FAIL");
		}*/
	}

}
