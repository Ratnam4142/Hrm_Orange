package com.HRM.Testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HRM.Baseclass.baseclass;
import com.HRM.locators.AdminFunctionality;
import com.HRM.locators.Organization;
import com.HRM.locators.loginpage;
import com.HRM.utils.pageScrooling;
import com.HRM.utils.screenshots;

public class organizationTestpage extends baseclass {
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
		pageScrooling.Scrolling_One();
		String actual1=AdminFunctionality.Validate_AdminButton();
		String expec1 = "Admin";
		Assert.assertEquals(actual1, expec1);
	}
	
	@Test(priority = 2)
	public void Validate_organizationPage() throws InterruptedException {
		Organization.Validate_organizationClick();
		Organization.Validate_LocationClick();
		Organization.Validate_Location_text();
	}
	@Test(priority = 3)
	public void Validate_sendkeys() throws InterruptedException {
		Organization.Validate_name(prop.getProperty("NAME"));
		Organization.Validate_cityname(prop.getProperty("city"));
		Organization.Validate_cuntry_click();
		Organization.Validate_canada_click();
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
