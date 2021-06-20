package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import readExcelpgms.ReadExcel;
import utils.SeleniumUtils;
import base.ProjectMethods;

public class HomePage extends ProjectMethods{
	public static WebDriverWait w;
	
	public HomePage clickAppLauncher(){
		try {
			WebElement appLauncher=d.findElement(By.xpath("//div[@role='navigation']//button[@type='button']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(appLauncher));
			appLauncher.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ViewAllPage clickViewAll(){
		try {
			WebElement viewAll=d.findElement(By.xpath("//button[@class='slds-button']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(viewAll));
			viewAll.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ViewAllPage();
	}
	public HomePage clickSVGIcon(){
		try {
			WebElement globalActionslink=d.findElement(By.xpath("//a[@class='globalCreateTrigger slds-button slds-button_icon slds-button_icon slds-button_icon-container slds-button_icon-small slds-global-actions__task slds-global-actions__item-action']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(globalActionslink));
			globalActionslink.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickNewCase(){
		try {
			WebElement newCase=d.findElement(By.xpath("//a[@title='New Case']"));
			newCase.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickContactName(){
		try {
			WebElement contactName=d.findElement(By.xpath("//input[@title='Search Contacts']"));
			contactName.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickContactText(){
		try {
			WebElement contactText=d.findElement(By.xpath("(//a[@role='option'])[1]"));
			SeleniumUtils.elementToBeClickable(contactText);
			contactText.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickStatus(){
		try {
			WebElement statusclick=d.findElement(By.xpath("(//a[text()='New'])[1]"));
			statusclick.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage selectStatus(String status){
		try {
			WebElement escalatedStatus=d.findElement(By.xpath("//a[@title='"+status+"']"));
			SeleniumUtils.elementToBeClickable(escalatedStatus);
			escalatedStatus.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage enterSubject(String sheetName,int rowNumber, int cellNumber){
		try {
			WebElement subject=d.findElement(By.xpath("//input[@class=' input']"));
			subject.sendKeys(ReadExcel.excelValue(sheetName, rowNumber, cellNumber));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage enterDescription(String sheetName,int rowNumber, int cellNumber){
		try {
			WebElement desciption=d.findElement(By.xpath("// textarea[@class=' textarea']"));
			desciption.sendKeys(ReadExcel.excelValue(sheetName, rowNumber, cellNumber));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickSave(){
		try {
			WebElement save=d.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']"));
			save.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public HomePage verifyToastMessage(){
		try {
			WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			SeleniumUtils.visibilityofElement(toastMessage);
			if(toastMessage.getText().contains("created")){
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
