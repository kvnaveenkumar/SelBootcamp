package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.JavaUtils;
import base.ProjectMethods;

public class ServiceConsole extends ProjectMethods{
	
	public static WebDriverWait w;
	public ServiceConsole clickFilesdropdown(){
		try {
			WebElement dropdown=d.findElementByXPath("//button[@title='Show Navigation Menu']");
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(dropdown));
			JavascriptExecutor executor = (JavascriptExecutor)d;
			executor.executeScript("arguments[0].click();", dropdown);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickFiles(){
		try {
			WebElement Files=d.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Files']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(Files));
			JavascriptExecutor executor = (JavascriptExecutor)d;
			executor.executeScript("arguments[0].click();", Files);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	public ServiceConsole clickLatestModifiedLinkDropdown(){
		try {
			WebElement dropdown=d.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])[1]"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(dropdown));
			JavascriptExecutor executor = (JavascriptExecutor)d;
			executor.executeScript("arguments[0].click();", dropdown);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickPublicLink(){
		try {
			WebElement publicLink=d.findElement(By.xpath("//a[@title='Public Link']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(publicLink));
			publicLink.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole verifyPublicLink(){
		try {
			WebElement publicLink_textbox=d.findElement(By.xpath("//input[@name='publicLinkURL']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(publicLink_textbox));
			//Assert.assertTrue(publicLink_textbox.isEnabled());
			Assert.assertFalse(publicLink_textbox.isEnabled());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole closePublicLinkpopup(){
		try {
			WebElement close=d.findElement(By.xpath("//button[@title='Close this window']"));
			close.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickDownload(){
		try {
			WebElement Download=d.findElement(By.xpath("//a[@title='Download']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(Download));
			WebElement fileName=d.findElement(By.xpath("(//span[@class='itemTitle desktop outputTextOverride uiOutputText'])[1]"));
			String filename=fileName.getText();
			Download.click();
			Thread.sleep(7000);
			JavaUtils.copyFile(filename,".pdf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickShare(){
		try {
			WebElement share=d.findElement(By.xpath("//a[@title='Share']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(share));
			share.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole searchUser(){
		try {
			WebElement searchUser=d.findElement(By.xpath("//input[@title='Search People']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(searchUser));
			searchUser.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole selectUser(String User){
		try {
			if(User.equalsIgnoreCase("Derrick")){
			WebElement user=d.findElement(By.xpath("//li[@role='presentation']//div[@title='Derrick Dsouza']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(user));
			user.click();
			}
			if(User.equalsIgnoreCase("Others")){
				WebElement user=d.findElement(By.xpath("//li[@role='presentation']//div[@title='Integration User']"));
				w=new WebDriverWait(d, 60);
				w.until(ExpectedConditions.elementToBeClickable(user));
				user.click();
				}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole verifyErrorMessage(){
		try {
			WebElement user=d.findElement(By.xpath("//li[@class='form-element__help']"));
			Assert.assertEquals(user.getText(),"Can't share file with the file owner.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole closeUser(){
		try {
			WebElement user=d.findElement(By.xpath("//span[@class='deleteIcon']"));
			user.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole addMessage(){
		try {
			WebElement message=d.findElement(By.xpath("//textarea[@placeholder='Add a message...']"));
			message.sendKeys("Bootcamp_Nupela_K V Naveen Kumar");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole verifyToastMessage(){
		try {
			WebElement toastMessage=d.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(toastMessage));
			if(toastMessage.getText().contains("You shared")){
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
	public ServiceConsole clickSharepopup(){
		try {
			WebElement share=d.findElement(By.xpath("//span[text()='Share']"));
			share.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickUploadFile(){
		try {
			WebElement uploadFiles=d.findElement(By.xpath("//a[@title='Upload Files']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(uploadFiles));
			uploadFiles.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole UploadFile(){
		try {
			Thread.sleep(5000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_E);
			r.keyRelease(KeyEvent.VK_E);
			r.keyPress(KeyEvent.VK_L);
			r.keyRelease(KeyEvent.VK_L);
			r.keyPress(KeyEvent.VK_B);
			r.keyRelease(KeyEvent.VK_B);
			r.keyPress(KeyEvent.VK_PERIOD);
			r.keyRelease(KeyEvent.VK_PERIOD);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_X);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickDone() throws InterruptedException{
		try {
			WebElement gotIt=d.findElement(By.xpath("//button[@type='button']//span[text()='Done']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(gotIt));
			Thread.sleep(5000);
			gotIt.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(7000);
		return this;
	}
	public ServiceConsole clickviewFileDetails(){
		try {
			WebElement FileDetails=d.findElement(By.xpath("//a[@title='View File Details']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(FileDetails));
			FileDetails.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole verifyFileNameandExtension(){
		try {
			WebElement FileDetails=d.findElement(By.xpath("//h1//span[@class='uiOutputText']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(FileDetails));
			Assert.assertEquals(FileDetails.getText(),"selb");
			WebElement Fileext=d.findElement(By.xpath("//div[@class='slds-form-element__static slds-truncate']//span[@class='uiOutputText']"));
			Assert.assertEquals(Fileext.getText(),"txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole closeTab(){
		try {
			WebElement FileDetails=d.findElement(By.xpath("//button[@title='Close selb']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(FileDetails));
			FileDetails.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole clickDelete(){
		try {
			WebElement delete=d.findElement(By.xpath("//a[@title='Delete']"));
			w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.elementToBeClickable(delete));
			delete.click();
			d.findElement(By.xpath("//button[@title='Delete']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceConsole verifyDelete(){
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
	


