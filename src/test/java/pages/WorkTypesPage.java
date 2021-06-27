package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import readExcelpgms.ReadExcel;
import base.ProjectMethods;

public class WorkTypesPage extends ProjectMethods{
	public static WebDriverWait w;
	public WorkTypesPage clickNew(){
		try {
			WebElement newbtn=d.findElement(By.xpath("//a[@role='button']/div[@title='New']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(newbtn));
			newbtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage enterWorkTypeName(){
		try {
			WebElement workType=d.findElement(By.xpath("//input[@class=' input']"));
			workType.sendKeys(ReadExcel.excelValue("Verifythemandatoryfieldaler", 1, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage clickSave(){
		try {
			d.findElement(By.xpath("//button[@title='Save']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage verifyMandatoryFieldsErrorMessage(){
		try {
			WebElement duration=d.findElement(By.xpath("//input[@class='input  uiInputSmartNumber']"));
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("arguments[0].scrollIntoView();", duration);
			WebElement errorMessage=d.findElement(By.xpath("//input[@class='input  uiInputSmartNumber']//following::ul//li"));
			SoftAssert s=new SoftAssert();
			s.assertEquals(errorMessage.getText(), "Complete this field.");
			s.assertAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage clickEdit(int rowNumber){
		try {
			WebElement arrow=d.findElement(By.xpath("(//table[@role='grid'])//tr["+rowNumber+"]//td[5]//span//a"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(arrow));
			arrow.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage enterTimeFrameStart(){
		try {
			WebElement timeFrameStart=d.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[4]"));
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("arguments[0].scrollIntoView();", timeFrameStart);
			timeFrameStart.sendKeys(ReadExcel.excelValue("EditWorkTypeNegative", 1, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage enterTimeFrameEnd(){
		try {
			WebElement timeFrameEnd=d.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[5]"));
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("arguments[0].scrollIntoView();", timeFrameEnd);
			timeFrameEnd.sendKeys(ReadExcel.excelValue("EditWorkTypeNegative", 2, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage clickSaveWorkType(){
		try {
			d.findElement(By.xpath("(//span[text()='Save'])[3]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage verifyErrorMessage(){
		try {
			WebElement errorMessage=d.findElement(By.xpath("//span[@class='genericError uiOutputText']"));
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("arguments[0].scrollIntoView();", errorMessage);
			if(errorMessage.getText().contains("error")){
				Assert.assertTrue(true);
			}
			else{
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage clickDelete(){
		try {
			w=new WebDriverWait(d, 60);
			WebElement deletebtn=d.findElement(By.xpath("//a[@title='Delete']"));
			w.until(ExpectedConditions.elementToBeClickable(deletebtn));
			deletebtn.click();
			WebElement delete=d.findElement(By.xpath("//button[@title='Delete']"));
			w.until(ExpectedConditions.elementToBeClickable(delete));
			delete.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public WorkTypesPage verifyToastMessage(){
		try {
			WebElement taostMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(taostMessage));
			String deleteMsg=taostMessage.getText();
			if(deleteMsg.contains("delete")){
				Assert.assertTrue(true);
			}
			else{
				Assert.fail();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
