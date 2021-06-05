package vennilaScript;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFunction {

	public static void main(String[] args) {
		
/*		 What is Alerts
		 An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. It notifies the user with some specific information or error, 
		 asks for permission to perform certain tasks and it also provides warning messages as well
		  
		 Difference between Alerts and Popup
		 Alerts- Cant able to inspect and get webElement
		 popup-can able to inspect and get webElement
		  
		  
		 Ref Site:https://www.guru99.com/alert-popup-handling-selenium.html
		 Types of Alert:
		 Simple Alert-->only OK button (can able to accept or reject alert)
		 Prompt Alert-->ok and cancel button and text box (can able to pass values, able to accept or reject alert)
		 Confirmation Alert-->only ok and cancel button (can able to accept and reject)
		 Sweet Alert->We can able to inspect this alert (Example: Locator can be identified)
		
		
		Methods available in Alerts
		accept();
		dismiss();
		sendKeys();
		getText();
		
		
		Handle Alerts
		accept(); ------> To approve the alert
		dismiss();------> To reject the alert
		sendKeys();-----> To pass values in alert 
		getText();------> To get text present in alert
		
		Exception in Alert
		NoAlertPresent-> If no alert is present we will get this exception
		UnHandledAlertException-> trying to interact with webElement when alert is in open.
		*/

		
		Alert a=null;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		a.accept();
		
		

	}

}
