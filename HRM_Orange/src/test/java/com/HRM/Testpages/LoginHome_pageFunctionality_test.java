package com.HRM.Testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HRM.Baseclass.baseclass;
import com.HRM.locators.AdminFunctionality;
import com.HRM.locators.loginpage;
import com.HRM.utils.screenshots;

public class LoginHome_pageFunctionality_test extends baseclass {

	@Test(priority = 0)
	public void Validate_PrinterSettings() {
		System.out.println("R-Testing Tools – Manual & Automation Testing");
	}

	@Test(priority = 1)
	public void Validate_ValidSendkeys() throws InterruptedException {
		loginpage.Validate_EnterUsername(prop.getProperty("username"));
		loginpage.Validate_EnterPassword(prop.getProperty("Password"));
		String actual= loginpage.Validate_LoginButton();
		String expec = "Login";
		Assert.assertEquals(actual, expec);
	}

	@Test(priority = 2)
	public void Validate_HomePageText() throws InterruptedException {
		String actual=AdminFunctionality.Validate_LoginHometext();
		String expec = "Admin\n"+"PIM\n"+"Leave\n"+"Time\n"+"Recruitment\n"+"My Info\n"+
				"Performance\n"+"Dashboard\n"+"Directory\n"+"Maintenance\n"+"Buzz";
		Assert.assertEquals(actual, expec);
	}
	@Test(priority = 3)
	public void Validate_adminSlide() throws InterruptedException {
		String actual=AdminFunctionality.Validate_AdminButton();
		String expec = "Admin";
		Assert.assertEquals(actual, expec);
		String actuals=AdminFunctionality.Validate_adminHeader_Text();
		String expeted = "User Management\n"+"Job\n"+"Organization\n"+"Qualifications\n"+
				"Nationalities\n"+"Corporate Branding\n"+"Configuration";
		Assert.assertEquals(actuals, expeted);
		AdminFunctionality.Validate_All_Text();
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
