package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import readExcelpgms.ReadExcel;
import base.ProjectMethods;

public class week5TC extends ProjectMethods{

	@Test
	public void CreateAccounts() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickSales()
		.clickAccounts()
		.clickNew()
		.enterAccountName()
		.selectOwnership()
		.clickSave()
		.verifyToastMessage();
		
	}
	@Test
	public void VerifythemandatoryfieldalertmessageforWorkType() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickWorkTypes()
		.clickNew()
		.enterWorkTypeName()
		.clickSave()
		.verifyMandatoryFieldsErrorMessage();

}
@Test
	public void EditWorkType() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickWorkTypes()
		.clickEdit(1)
		.clickDelete()
		.verifyToastMessage();
		
}
@Test
	public void EditWorkTypeNegative() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickWorkTypes()
		.clickEdit(1)
		.enterTimeFrameStart()
		.enterTimeFrameEnd()
		.clickSaveWorkType()
		.verifyErrorMessage();
}
	@Test
	public void CreateNewCase() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickSVGIcon()
		.clickNewCase()
		.clickContactName()
		.clickContactText()
		.clickStatus()
		.selectStatus("Escalated")
		.enterSubject("CreateNewCase", 1, 0)
		.enterDescription("CreateNewCase", 2, 0)
		.clickSave()
		.verifyToastMessage();
	}
	@Test
	public void DeleteCase() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickSales()
		.clickCases()
		.clickdropdown(1)
		.clickDelete()
		.verifyToastMessage();
	}
	@Test
	public void CreateServiceTerritories() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickServiceTerritories()
		.clickNew()
		.enterName()
		.clickOperatingHoursandChooseFirst()
		.clickActive()
		.enterCity()
		.enterState()
		.enterCountry()
		.enterPincode()
		.clickSave()
		.verifyToastMessage();
	}
	@Test
	public void DeleteServiceTerritories() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickServiceTerritories()
		.clickDropdown()
		.clickDelete()
		.verifyDeleteToastMessage();
	}
	
	
	
	
	
	
}
