package testNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import readExcelpgms.ReadExcel;
import testNG.BaseClass;

public class Week4Homework extends BaseClass{
	
	
@Test
public void CreateAccounts() throws InterruptedException, IOException{
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait w=new WebDriverWait(d, 60);
	Thread.sleep(5000);
	WebElement appLauncher=d.findElement(By.xpath("//div[@role='navigation']//button[@type='button']"));
	w.until(ExpectedConditions.elementToBeClickable(appLauncher));
	appLauncher.click();
	WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
	w.until(ExpectedConditions.elementToBeClickable(viewAll));
	viewAll.click();
	WebElement sales=d.findElement(By.xpath("//p[text()='Sales']"));
	w.until(ExpectedConditions.elementToBeClickable(sales));
	sales.click();
	Thread.sleep(5000);
	WebElement accounts=d.findElement(By.xpath("//a[@title='Accounts']"));
	w.until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();
	WebElement newbtn=d.findElement(By.xpath("//a[@title='New']"));
	w.until(ExpectedConditions.elementToBeClickable(newbtn));
	newbtn.click();
	WebElement accountName=d.findElement(By.xpath("//a[@title='New']"));
	w.until(ExpectedConditions.elementToBeClickable(accountName));
	accountName.sendKeys(ReadExcel.excelValue("CreateAccounts", 1, 0));
	WebElement ownerschipdrpdown=d.findElement(By.xpath("(//input[@role='combobox'])[6]"));
	ownerschipdrpdown.click();
	d.findElement(By.xpath("//span[text()='Public']")).click();
	d.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	WebElement textName=d.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']"));
	w.until(ExpectedConditions.elementToBeClickable(textName));
	String actualresult=textName.getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualresult, ReadExcel.excelValue("CreateAccounts", 1, 0));
	s.assertAll();
}
@Test
public void VerifythemandatoryfieldalertmessageforWorkType() throws InterruptedException, IOException{
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait w=new WebDriverWait(d, 60);
	Thread.sleep(5000);
	WebElement appLauncher=d.findElement(By.xpath("//div[@role='navigation']//button[@type='button']"));
	w.until(ExpectedConditions.elementToBeClickable(appLauncher));
	appLauncher.click();
	WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
	w.until(ExpectedConditions.elementToBeClickable(viewAll));
	viewAll.click();
	JavascriptExecutor js= (JavascriptExecutor)d;
	WebElement workTypes=d.findElement(By.xpath("//a[@data-label='Work Types']"));
	w.until(ExpectedConditions.elementToBeClickable(workTypes));
	js.executeScript("arguments[0].scrollIntoView();", workTypes);
	workTypes.click();
	WebElement newbtn=d.findElement(By.xpath("(//a[@title='New'])[2]"));
	w.until(ExpectedConditions.elementToBeClickable(newbtn));
	newbtn.click();
	WebElement workType=d.findElement(By.xpath("//input[@class=' input']"));
	workType.sendKeys(ReadExcel.excelValue("Verify the mandatory field alert message for WorkType", 1, 0));
	d.findElement(By.xpath("//button[@title='Save']")).click();
	WebElement duration=d.findElement(By.xpath("//input[@class='input  uiInputSmartNumber']"));
	js.executeScript("arguments[0].scrollIntoView();", duration);
	WebElement errorMessage=d.findElement(By.xpath("//input[@class='input  uiInputSmartNumber']//following::ul//li"));
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(errorMessage.getText(), "Complete this field.");
	s.assertAll();
}
@Test
public void EditWorkType() throws InterruptedException, IOException{
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait w=new WebDriverWait(d, 60);
	Thread.sleep(5000);
	WebElement appLauncher=d.findElement(By.xpath("//div[@role='navigation']//button[@type='button']"));
	w.until(ExpectedConditions.elementToBeClickable(appLauncher));
	appLauncher.click();
	WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
	w.until(ExpectedConditions.elementToBeClickable(viewAll));
	viewAll.click();
	JavascriptExecutor js= (JavascriptExecutor)d;
	WebElement workTypes=d.findElement(By.xpath("//a[@data-label='Work Types']"));
	w.until(ExpectedConditions.elementToBeClickable(workTypes));
	js.executeScript("arguments[0].scrollIntoView();", workTypes);
	workTypes.click();
	WebElement arrow=d.findElement(By.xpath("(//table[@role='grid'])[2]//tr[1]//td[5]//span//a"));
	w.until(ExpectedConditions.elementToBeClickable(arrow));
	arrow.click();
	d.findElement(By.xpath("//a[@title='Delete']")).click();
	WebElement delete=d.findElement(By.xpath("//button[@title='Delete']"));
	w.until(ExpectedConditions.elementToBeClickable(delete));
	delete.click();
	WebElement taostMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
	w.until(ExpectedConditions.visibilityOf(taostMessage));
	String deleteMsg=taostMessage.getText();
	if(deleteMsg.contains("delete")){
		System.out.println("TC PASS");
	}
	else{
		System.out.println("TC FAIL");
	}

}
@Test
public void EditWorkTypeNegative() throws InterruptedException, IOException{
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait w=new WebDriverWait(d, 60);
	Thread.sleep(5000);
	WebElement appLauncher=d.findElement(By.xpath("//div[@role='navigation']//button[@type='button']"));
	w.until(ExpectedConditions.elementToBeClickable(appLauncher));
	appLauncher.click();
	WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
	w.until(ExpectedConditions.elementToBeClickable(viewAll));
	viewAll.click();
	JavascriptExecutor js= (JavascriptExecutor)d;
	WebElement workTypes=d.findElement(By.xpath("//a[@data-label='Work Types']"));
	w.until(ExpectedConditions.elementToBeClickable(workTypes));
	js.executeScript("arguments[0].scrollIntoView();", workTypes);
	workTypes.click();
	WebElement arrow=d.findElement(By.xpath("(//table[@role='grid'])[2]//tr[1]//td[5]//span//a"));
	w.until(ExpectedConditions.elementToBeClickable(arrow));
	arrow.click();
	d.findElement(By.xpath("//a[@title='Edit']")).click();
	WebElement timeFrameStart=d.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[4]"));
	js.executeScript("arguments[0].scrollIntoView();", timeFrameStart);
	timeFrameStart.sendKeys(ReadExcel.excelValue("EditWorkTypeNegative", 1, 0));
	WebElement timeFrameEnd=d.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[5]"));
	js.executeScript("arguments[0].scrollIntoView();", timeFrameEnd);
	timeFrameEnd.sendKeys(ReadExcel.excelValue("EditWorkTypeNegative", 2, 0));
	d.findElement(By.xpath("(//span[text()='Save'])[3]")).click();
	WebElement errorMessage=d.findElement(By.xpath("//span[@class='genericError uiOutputText']"));
	js.executeScript("arguments[0].scrollIntoView();", errorMessage);
	if(errorMessage.getText().contains("error")){
		System.out.println("TC PASS");
	}
	else{
		System.out.println("TC FAIL");
	}
}
}
