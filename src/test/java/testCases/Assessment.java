package testCases;

import org.testng.annotations.Test;

import base.ProjectMethods;
import pages.LoginPage;

public class Assessment extends ProjectMethods {
	@Test
	public void CreateAccounts() throws InterruptedException{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickButton()
		.clickAppLauncher()
		.clickViewAll()
		.clickServiceConsole()
		.clickFilesdropdown()
		.clickFiles()
		.clickLatestModifiedLinkDropdown()
		.clickPublicLink()
		.verifyPublicLink()
		.closePublicLinkpopup()
		.clickLatestModifiedLinkDropdown()
		.clickDownload()
		.clickLatestModifiedLinkDropdown()
		.clickShare()
		.searchUser()
		.selectUser("Derrick")
		.verifyErrorMessage()
		.closeUser()
		.selectUser("Others")
		.addMessage()
		.clickSharepopup()
		.verifyToastMessage()
		.clickUploadFile()
		.UploadFile()
		.clickDone()
		.clickLatestModifiedLinkDropdown()
		.clickviewFileDetails()
		.verifyFileNameandExtension()
		.closeTab()
		.clickFilesdropdown()
		.clickFiles()
		.clickLatestModifiedLinkDropdown()
		.clickDelete()
		.verifyDelete();
		
	}

}
