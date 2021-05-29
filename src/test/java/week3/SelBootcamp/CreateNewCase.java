package week3.SelBootcamp;

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


public class CreateNewCase {

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
		WebElement globalActionslink=d.findElement(By.xpath("//a[@class='globalCreateTrigger slds-button slds-button_icon slds-button_icon slds-button_icon-container slds-button_icon-small slds-global-actions__task slds-global-actions__item-action']"));
		globalActionslink.click();
		WebElement newCase=d.findElement(By.xpath("//a[@title='New Case']"));
		newCase.click();
		WebElement contactName=d.findElement(By.xpath("//input[@title='Search Contacts']"));
		contactName.click();
		WebElement contactText=d.findElement(By.xpath("//div[@title='V2']"));
		WebDriverWait w=new WebDriverWait(d, 60);
		w.until(ExpectedConditions.elementToBeClickable(contactText));
		contactText.click();
		WebElement statusclick=d.findElement(By.xpath("(//a[text()='New'])[1]"));
		statusclick.click();
		WebElement escalatedStatus=d.findElement(By.xpath("//a[@title='Escalated']"));
		w.until(ExpectedConditions.elementToBeClickable(escalatedStatus));
		escalatedStatus.click();
		WebElement subject=d.findElement(By.xpath("//input[@class=' input']"));
		subject.sendKeys("Testing");
		WebElement desciption=d.findElement(By.xpath("// textarea[@class=' textarea']"));
		desciption.sendKeys("dummy");
		WebElement save=d.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']"));
		save.click();
		WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		w.until(ExpectedConditions.visibilityOf(toastMessage));
		if(toastMessage.getText().contains("Case Created")){
			System.out.println("TC PASS");
		}
		else{
			System.out.println("TC FAIL");
		}
	}

}
