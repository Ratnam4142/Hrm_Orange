package com.HRM.Testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HRM.Baseclass.baseclass;
import com.HRM.locators.loginpage;
import com.HRM.utils.screenshots;

public class LoginFunctinalityTest extends baseclass{
	
	@Test(priority = 0)
	public void Validate_PrinterSettings() {
		System.out.println("R-Testing Tools – Manual & Automation Testing");
	}
	@Test(priority = 1)
	public void Validate_LiginFunctionality() throws InterruptedException {
		loginpage.validate_title();
		String actual = loginpage.Validate_Logintext();
		String expe = "Login\n"+"Username : Admin\n"+"Password : admin123\n"+"Username\n"+
		"Password\n"+"Login\n"+"Forgot your password?\n"+"\n"+"OrangeHRM OS 5.2\n"+
				"© 2005 - 2022 OrangeHRM, Inc. All rights reserved.";
		Assert.assertEquals(actual, expe);
	}
	@Test(priority = 2)
	public void Validate_Sendkeys() throws InterruptedException {
		
	String actual= loginpage.Validate_LoginButton();
	String expec = "Login";
	Assert.assertEquals(actual, expec);
	loginpage.Validate_Error_Message();
	}
	@Test(priority = 3)
	public void Validate_InvalidSendkeys() throws InterruptedException {
		loginpage.Validate_EnterUsername(prop.getProperty("number"));
		loginpage.Validate_EnterPassword(prop.getProperty("pnumbers"));
		String actual= loginpage.Validate_LoginButton();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}
	@Test(priority = 4)
	public void Validate_SpecialCharSendkeys() throws InterruptedException {
		loginpage.Validate_Errormessage();
		loginpage.Validate_EnterUsername(prop.getProperty("special"));
		loginpage.Validate_EnterPassword(prop.getProperty("pspeci"));
		String actual= loginpage.Validate_LoginButton();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
		loginpage.Validate_Errormessage();
	}
	@Test(priority = 5)
	public void Validate_ValidSendkeys() throws InterruptedException {
		loginpage.Validate_EnterUsername(prop.getProperty("username"));
		loginpage.Validate_EnterPassword(prop.getProperty("Password"));
		String actual= loginpage.Validate_LoginButton();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}
	@AfterMethod
	public void takeScreenshot(ITestResult result) {
		screenshots.ScreenShotTSC(result);
	}
	@BeforeClass
	public void openbrowser() {
		inslization();
		System.out.println("The window is open");
	}
	@AfterClass
	public void Closewindw() {
		TearDown();
		System.out.println("The window closed");
	}
	
	
	
	

}
