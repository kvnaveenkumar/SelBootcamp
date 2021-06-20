package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import readExcelpgms.ReadExcel;
import base.ProjectMethods;

public class AccountsPage extends ProjectMethods {
	public static WebDriverWait w;
	
	public AccountsPage clickNew(){
		try {
			WebElement newbtn=d.findElement(By.xpath("//a[@title='New']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(newbtn));
			newbtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	public AccountsPage enterAccountName(){
		try {
			w=new WebDriverWait(d, 60);
			WebElement accountName=d.findElement(By.xpath("//input[@name='Name']"));
			w.until(ExpectedConditions.elementToBeClickable(accountName));
			accountName.sendKeys(ReadExcel.excelValue("CreateAccounts", 1, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	public AccountsPage selectOwnership(){
		try {
			WebElement ownerschipdrpdown=d.findElement(By.xpath("(//input[@role='combobox'])[6]"));
			ownerschipdrpdown.click();
			d.findElement(By.xpath("//span[text()='Public']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	public AccountsPage clickSave(){
		try {
			d.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	public AccountsPage verifyToastMessage(){
		try {
			WebElement textName=d.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(textName));
			String actualresult=textName.getText();
			SoftAssert s=new SoftAssert();
			s.assertEquals(actualresult, ReadExcel.excelValue("CreateAccounts", 1, 0));
			s.assertAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AccountsPage();
		
	}

}
