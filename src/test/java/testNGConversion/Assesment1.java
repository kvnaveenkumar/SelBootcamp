package testNGConversion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assesment1 extends BaseClass{
@Test	
	public void tc_CreateNewCase() throws InterruptedException, AWTException {
	 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	WebDriverWait w=new WebDriverWait(d, 60);
	 	w.until(ExpectedConditions.titleContains("Home"));
	 	WebElement appLauncher=d.findElement(By.xpath("//button[@class='bare slds-icon-waffle_container slds-context-bar__button slds-button uiButton forceHeaderButton salesforceIdentityAppLauncherHeader']"));
		w.until(ExpectedConditions.elementToBeClickable(appLauncher));
		appLauncher.click();
		
		WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
		w.until(ExpectedConditions.elementToBeClickable(viewAll));
		viewAll.click();
		WebElement serviceConsole=d.findElement(By.xpath("//a[@class='slds-text-heading_small']//p[text()='Service Console']"));
		w.until(ExpectedConditions.elementToBeClickable(serviceConsole));
		serviceConsole.click();
		WebElement dropdown=d.findElement(By.xpath("//button[@title='Show Navigation Menu']"));
		w.until(ExpectedConditions.elementToBeClickable(dropdown));
		JavascriptExecutor j=(JavascriptExecutor)d;
		//j.executeScript("arguments[0].click();", dropdown);
		dropdown.click();
		//To click Home
		Thread.sleep(3000);
		WebElement home=d.findElement(By.xpath("//a[@title='Home']"));
		w.until(ExpectedConditions.elementToBeClickable(home));
		Thread.sleep(3000);
		home.click();
		//j.executeScript("arguments[0].click();", home);
		Thread.sleep(3000);
		String closed=d.findElement(By.xpath("(//span[@class='metricAmount uiOutputText'])[1]")).getText();
		closed=closed.split("\\$")[1];
		int closedValue=Integer.parseInt(closed);
		String open=d.findElement(By.xpath("(//span[@class='metricAmount uiOutputText'])[2]")).getText();
		open=open.split("\\$")[1];
		int openValue=Integer.parseInt(open);
		int goal=closedValue+openValue;
		if(goal<10000){
			WebElement editGoal=d.findElement(By.xpath("//button[@title='Edit Goal']"));
			editGoal.click();
			WebElement Goal=d.findElement(By.xpath("//input[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']"));
			Goal.clear();
			Goal.sendKeys("10000");
			d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton']")).click();;
			System.out.println(goal);
		}
		WebElement dropdown1=d.findElement(By.xpath("//button[@title='Show Navigation Menu']"));
		w.until(ExpectedConditions.elementToBeClickable(dropdown1));
		j.executeScript("arguments[0].click();", dropdown1);
		
		WebElement dashboard=d.findElement(By.xpath("//a[@title='Dashboards']"));
		w.until(ExpectedConditions.elementToBeClickable(dashboard));
		Thread.sleep(3000);
		dashboard.click();
		
		WebElement newDashboard=d.findElement(By.xpath("//li[@class='slds-button slds-button--neutral']//a[@title='New Dashboard']"));
		w.until(ExpectedConditions.elementToBeClickable(newDashboard));
		newDashboard.click();
		Thread.sleep(2000);
		w.until(ExpectedConditions.titleContains("New Dashboard | Salesforce"));
		//w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(d.findElement(By.xpath("//iframe[@title='dashboard']"))));
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@title='dashboard']")));
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		WebElement name=d.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		w.until(ExpectedConditions.visibilityOf(name));
		String userName="K V NAVEEN KUMAR";
		name.sendKeys(userName);
		WebElement description=d.findElement(By.id("dashboardDescriptionInput"));
		description.sendKeys("Testing");
		WebElement submit=d.findElement(By.id("submitBtn"));
		submit.click();
		d.switchTo().defaultContent();
		w.until(ExpectedConditions.titleContains(userName));
		Thread.sleep(3000);
		//w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(d.findElement(By.xpath("//iframe[@title='dashboard']"))));
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@title='dashboard']")));
		Thread.sleep(3000);
		WebElement done=d.findElement(By.xpath("//button[@class='slds-button doneEditing']"));
		//to click on done
		w.until(ExpectedConditions.elementToBeClickable(done));
		done.click();
		Thread.sleep(3000);
		//To save
		//d.findElement(By.id("modalBtn2")).click();
		d.switchTo().defaultContent();
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@title='dashboard']")));
		WebElement dashboardCreated=d.findElement(By.xpath("//span[text()='Dashboard']//following::span[@class='slds-page-header__title slds-truncate']"));
		w.until(ExpectedConditions.visibilityOf(dashboardCreated));
		System.out.println(dashboardCreated.getText());
		Assert.assertEquals(userName, dashboardCreated.getText());
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='Subscribe']")).click();
		
		WebElement daily=d.findElement(By.xpath("//span[text()='Daily']"));
		w.until(ExpectedConditions.elementToBeClickable(daily));
		Select s=new Select(d.findElement(By.xpath("//select[@class=' select']")));
		s.selectByVisibleText("10:00 AM");
		WebElement save=d.findElement(By.xpath("//button[@title='Save']"));
		save.click();
		WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		w.until(ExpectedConditions.visibilityOf(toastMessage));
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("You started a dashboard subscription.", toastMessage.getText());
		WebElement privateDashboard=d.findElement(By.xpath("//div[@id='navSection']//child::a[@title='Private Dashboards']"));
		w.until(ExpectedConditions.elementToBeClickable(privateDashboard));
		privateDashboard.click();
		WebElement searchBox=d.findElement(By.xpath("//input[@placeholder='Search private dashboards...']"));
		w.until(ExpectedConditions.elementToBeClickable(searchBox));
		searchBox.sendKeys(userName);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		List<WebElement> list=d.findElementsByXPath("//table//tbody//tr/th//child::span[@class='highlightSearchText']");
		int countBeforeDelete=list.size();
		for(int i=0;i<=countBeforeDelete;i++){
			if(list.get(i).getText().equals(userName)){
				Assert.assertEquals(userName, "K V NAVEEN KUMAR");
			}
			else{
				Assert.fail();
			}
		}
		
		WebElement arrowLink=d.findElementByXPath("(//table[@role='grid']//tbody//tr//child::span[text()='Show actions'])[1]");
		arrowLink.click();
		d.findElement(By.xpath("//span[text()='Delete']")).click();
		WebElement deleteConfirm = d.findElement(By.xpath("//button[@title='Delete']"));
		w.until(ExpectedConditions.elementToBeClickable(deleteConfirm));
		deleteConfirm.click();
		
		WebElement toastMessageDelete=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		w.until(ExpectedConditions.visibilityOf(toastMessageDelete));
		softAssert.assertEquals("Dashboard was deleted.", toastMessage.getText());
		softAssert.assertAll();
		Thread.sleep(5000);
		List<WebElement> list2=d.findElementsByXPath("//table//tbody//tr/th//child::span[@class='highlightSearchText']");
		int countAfterDelete=list2.size();
		
		if(countBeforeDelete-1==countAfterDelete){
			System.out.println("TC PASS");
		}
		else{
			Assert.fail();
		}
		
	}

}
