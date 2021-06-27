package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectMethods;

public class Salespage extends ProjectMethods {
	public static WebDriverWait w;
	
	public AccountsPage clickAccounts(){
		try {
			WebElement accounts=d.findElement(By.xpath("//a[@title='Accounts']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(accounts));
			JavascriptExecutor executor = (JavascriptExecutor)d;
		     executor.executeScript("arguments[0].click();", accounts);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AccountsPage();
		
	}
	public CasesPage clickCases(){
		try {
			WebElement cases=d.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']//span[text()='Cases']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(cases));
			JavascriptExecutor executor = (JavascriptExecutor)d;
			executor.executeScript("arguments[0].click();", cases);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CasesPage();
		
	}
	public CasesPage selectCaseNumber(){
		try {
			JavascriptExecutor executor = (JavascriptExecutor)d;
			WebElement caseNumber=d.findElement(By.xpath("(//a[@role='menuitemcheckbox'])[2]"));
			executor.executeScript("arguments[0].click();", caseNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CasesPage();
		
	}

}
