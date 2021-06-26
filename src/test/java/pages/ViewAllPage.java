package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectMethods;

public class ViewAllPage extends ProjectMethods{
	
	public static WebDriverWait w;
	public Salespage clickSales() throws InterruptedException{
		try {
			WebElement sales=d.findElement(By.xpath("//p[text()='Sales']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(sales));
			sales.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Salespage();
	}
	public WorkTypesPage clickWorkTypes() throws InterruptedException{
		try {
			WebElement searchBox=d.findElementByXPath("//input[@placeholder='Search apps or items...']");
			searchBox.sendKeys("Work Types");
			JavascriptExecutor executor = (JavascriptExecutor)d;
			WebElement worktype=d.findElement(By.xpath("//a[@data-label='Work Types']"));
			executor.executeScript("arguments[0].click();", worktype);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new WorkTypesPage();
	}
	public ServiceConsole clickServiceConsole() throws InterruptedException{
		try {
			JavascriptExecutor executor = (JavascriptExecutor)d;
			WebElement serviceConsole=d.findElement(By.xpath("//a[@class='slds-text-heading_small']//p[text()='Service Console']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(serviceConsole));
			executor.executeScript("arguments[0].click();", serviceConsole);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ServiceConsole();
	}
	

}
