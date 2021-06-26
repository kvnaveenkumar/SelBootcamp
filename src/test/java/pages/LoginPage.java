package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import readExcelpgms.ReadExcel;
import base.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage enterUsername(){
		try {
			WebElement username=d.findElement(By.id("username"));
			username.sendKeys(ReadExcel.excelValue("Login", 1, 1));
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public LoginPage enterPassword(){
		try {
			WebElement password=d.findElement(By.id("password"));
			password.sendKeys(ReadExcel.excelValue("Login", 2, 1));
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public HomePage clickButton(){
		try {
			WebElement login=d.findElement(By.id("Login"));
			login.click();
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePage();
	}

}
