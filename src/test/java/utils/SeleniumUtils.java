package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectMethods;

public class SeleniumUtils extends ProjectMethods{
	static WebDriverWait wait=new WebDriverWait(d, 60);
	
	public static void clickButton(WebElement Element){
		Element.click();
	}
	public static void enterText(WebElement Element,String Message){
		Element.sendKeys(Message);
	}
	public static void clearText(WebElement Element){
		Element.clear();
	}
	public static void elementToBeClickable(WebElement Element){
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	public static void visibilityofElement(WebElement Element){
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	public static void numberOfElementsToBe(By Locator,int Number){
		wait.until(ExpectedConditions.numberOfElementsToBe(Locator, Number));
	}
	public static void assertTrue(Boolean Condition){
		Assert.assertTrue(Condition);
	}
	public static void assertFail(){
		Assert.fail();
	}
	public static void assertText(String actual, String expected){
		Assert.assertEquals(actual, expected);
	}
	public static void getText(WebElement Element){
		Element.getText();
	}
	public static void getAttribute(WebElement Element,String attributeValue){
		Element.getAttribute(attributeValue);
	}
	public static void switchFramesWithIndex(int FrameNumber){
		d.switchTo().frame(FrameNumber);
	}
	public static void switchFramesWithWebElement(WebElement Element){
		d.switchTo().frame(Element);
	}	
	public static void switchFramesWithString(String FrameName){
		d.switchTo().frame(FrameName);
	}
	public static void acceptAlerts(){
		Alert a=d.switchTo().alert();
		a.accept();
	}
	public static void dismissAlerts(){
		Alert a=d.switchTo().alert();
		a.dismiss();
	}
	public static void getTextAlerts(){
		Alert a=d.switchTo().alert();
		a.getText();
	}

}
