package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectMethods;

public class CasesPage extends ProjectMethods{
	public static WebDriverWait w;
	
	public CasesPage clickdropdown(int rowNumber){
		try {
			WebElement dropdown=d.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])["+rowNumber+"]"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(dropdown));
			dropdown.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public CasesPage clickDelete(){
		try {
			WebElement delete=d.findElement(By.xpath("//a[@title='Delete']"));
			delete.click();
			WebElement deletebtn=d.findElement(By.xpath("//button[@title='Delete']"));
			deletebtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public CasesPage verifyToastMessage(){
		try {
			WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(toastMessage));
			if(toastMessage.getText().contains("deleted")){
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
