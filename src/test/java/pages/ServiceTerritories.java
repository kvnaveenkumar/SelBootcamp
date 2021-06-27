package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectMethods;

public class ServiceTerritories extends ProjectMethods {
	
	public ServiceTerritories clickNew() throws InterruptedException{
		try {
			WebElement New=d.findElement(By.xpath("//a[@class='forceActionLink']"));
			New.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories enterName() throws InterruptedException{
		try {
			WebElement name=d.findElement(By.xpath("//input[@class=' input']"));
			name.sendKeys("K V Naveen Kumar");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickOperatingHoursandChooseFirst() throws InterruptedException{
		try {
			WebElement operatingHours=d.findElement(By.xpath("//input[@title='Search Operating Hours']"));
			operatingHours.click();
			WebElement UKShift=d.findElement(By.xpath("//div[@title='UK Shift']"));
			UKShift.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickActive() throws InterruptedException{
		try {
			WebElement active=d.findElement(By.xpath("//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input[@type='checkbox']"));
			active.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories enterCity() throws InterruptedException{
		try {
			WebElement city=d.findElement(By.xpath("//input[@class='city compoundBorderBottom compoundBorderRight input']"));
			city.sendKeys("Chennai");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories enterState() throws InterruptedException{
		try {
			WebElement state=d.findElement(By.xpath("//input[@class='state compoundBorderBottom input']"));
			state.sendKeys("TamilNadu");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories enterCountry() throws InterruptedException{
		try {
			WebElement country=d.findElement(By.xpath("//input[@class='country compoundBRRadius input']"));
			country.sendKeys("India");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories enterPincode() throws InterruptedException{
		try {
			WebElement zipcode=d.findElement(By.xpath("//input[@class='postalCode compoundBLRadius compoundBorderRight input']"));
			zipcode.sendKeys("600100");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickSave() throws InterruptedException{
		try {
			WebElement save=d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']"));
			save.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories verifyToastMessage() throws InterruptedException{
		try {
			WebElement verifyName=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			System.out.println(verifyName.getText());
			if(verifyName.getText().contains("Naveen")){
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
	public ServiceTerritories clickDropdown() throws InterruptedException{
		try {
			WebElement dropdown=d.findElement(By.xpath("(//a[@class='rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger'])[1]"));
			JavascriptExecutor j=(JavascriptExecutor)d;
			j.executeScript("arguments[0].scrollIntoView();",dropdown);
			dropdown.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickEdit() throws InterruptedException{
		try {
			WebElement edit=d.findElement(By.xpath("//a[@title='Edit']"));
			edit.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories selectCountry() throws InterruptedException{
		try {
			WebElement country=d.findElementByXPath("//input[@class='country compoundBRRadius input']");
			JavascriptExecutor j=(JavascriptExecutor)d;
			j.executeScript("arguments[0].scrollIntoView();",country);
			country.clear();
			country.sendKeys("North America");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickSaveAfterEdit() throws InterruptedException{
		try {
			WebElement save=d.findElementByXPath("//button[@title='Save']//span[text()='Save']");
			save.click();
			Thread.sleep(5000);
			WebElement dropdown1=d.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])[1]"));
			WebDriverWait wait=new WebDriverWait(d, 60);
			wait.until(ExpectedConditions.elementToBeClickable(dropdown1));
			dropdown1.click();
			WebElement edit1=d.findElement(By.xpath("//a[@title='Edit']"));
			edit1.click();
			String modifiedByAfter=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[3]")).getText();
			modifiedByAfter=modifiedByAfter.split("\\,")[1];
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories verifyOwnertext() throws InterruptedException{
		try {
			String createdBy=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[2]")).getText();
			createdBy=createdBy.split("\\,")[0];
			String modifiedBy=d.findElement(By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only'])[3]")).getText();
			modifiedBy=modifiedBy.split("\\,")[0];
			WebElement owner=d.findElement(By.xpath("//div[@class='slds-form-element slds-form-element_readonly slds-grow slds-hint-parent override--slds-form-element']//span[@class='test-id__field-value slds-form-element__static slds-grow  is-read-only']/span[@class='uiOutputText forceOutputLookup']"));	
			String ownertxt=owner.getText();
			if(createdBy.contains(modifiedBy)){
				System.out.println("TC PASS");
			}
			if(modifiedBy.contains(createdBy)){
				System.out.println("TC PASS");
			}
			if(modifiedBy.contains(ownertxt)){
				System.out.println("TC PASS");
			}
			if(createdBy.contains(ownertxt)){
				System.out.println("TC PASS");
			}
			else{
				System.out.println("TC FAIL");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories clickDelete() throws InterruptedException{
		try {
			WebElement edit=d.findElement(By.xpath("//a[@title='Delete']"));
			edit.click();
			WebElement delete=d.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']"));
			delete.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	public ServiceTerritories verifyDeleteToastMessage() throws InterruptedException{
		try {
			WebElement toastMessage=d.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			WebDriverWait w=new WebDriverWait(d, 60);
			w.until(ExpectedConditions.visibilityOf(toastMessage));
			System.out.println(toastMessage.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
