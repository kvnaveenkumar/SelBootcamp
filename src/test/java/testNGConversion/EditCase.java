package testNGConversion;

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


public class EditCase extends BaseClass{

	public void tc_EditCase() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(d, 60);
		WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		w.until(ExpectedConditions.elementToBeClickable(appLauncher));
		appLauncher.click();
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		viewAll.click();
		WebElement sales=d.findElement(By.xpath("//a[@class='slds-text-heading_small']//span/p[text()='Sales']"));
		sales.click();
		WebElement caseLink=d.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[3]"));
		w.until(ExpectedConditions.elementToBeClickable(caseLink));
		caseLink.click();
		JavascriptExecutor executor = (JavascriptExecutor)d;
		WebElement caseNumber=d.findElement(By.xpath("(//a[@role='menuitemcheckbox'])[2]"));
		executor.executeScript("arguments[0].click();", caseNumber);
		WebElement edit=d.findElement(By.xpath("(//button[@class='test-id__inline-edit-trigger slds-shrink-none inline-edit-trigger slds-button slds-button_icon-bare'])[1]"));
		w.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		Thread.sleep(2000);
		WebElement statusClick=d.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(statusClick));
		statusClick.click();
		WebElement working=d.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Working']"));
		w.until(ExpectedConditions.elementToBeClickable(working));
		working.click();
		WebElement priorityClick=d.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[3]"));
		w.until(ExpectedConditions.elementToBeClickable(priorityClick));
		priorityClick.click();
		WebElement low=d.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Low']"));
		w.until(ExpectedConditions.elementToBeClickable(low));
		low.click();
		WebElement caseOrginClick=d.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[6]"));
		executor.executeScript("window.scrollBy(0,300)");
		w.until(ExpectedConditions.elementToBeClickable(caseOrginClick));
		caseOrginClick.click();
		WebElement phone=d.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Phone']"));
		w.until(ExpectedConditions.elementToBeClickable(phone));
		phone.click();
		
		WebElement slaViolation=d.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[10]"));
		executor.executeScript("window.scrollBy(0,300)");
		w.until(ExpectedConditions.elementToBeClickable(slaViolation));
		slaViolation.click();
		WebElement no=d.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='No']"));
		w.until(ExpectedConditions.elementToBeClickable(no));
		no.click();
		WebElement save=d.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		WebElement verifyText=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']/slot/slot/lightning-formatted-text)[1]"));
		w.until(ExpectedConditions.elementToBeClickable(verifyText));
		if(verifyText.getText().contains("Working")){
		System.out.println("TC PASS");	
		}
		else{
			System.out.println("TC FAIL");
		}

}
}