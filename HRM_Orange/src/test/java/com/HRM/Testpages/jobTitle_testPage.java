package com.HRM.Testpages;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HRM.Baseclass.baseclass;
import com.HRM.locators.AdminFunctionality;
import com.HRM.locators.Jobpage;
import com.HRM.locators.loginpage;
import com.HRM.utils.pageScrooling;
import com.HRM.utils.screenshots;

public class jobTitle_testPage extends baseclass{
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
	public void Validate_headerText() throws InterruptedException {
		String actual = Jobpage.Validate_headerText();
		String expected = "User Management\n"+"Job\n"+"Organization\n"+"Qualifications\n"
				+"Nationalities\n"+"Corporate Branding\n"+"Configuration";
		Assert.assertEquals(actual, expected);
		String actual1 = Jobpage.Validate_JobClick_Text();
		String expected1 = "Job";
		Assert.assertEquals(actual1, expected1);

	}
	@Test(priority = 3)
	public void Validate_JobTitleText() throws InterruptedException {
		String actual = Jobpage.Validate_jobtitle_Text();
		String expected = "Job Titles";
		Assert.assertEquals(actual, expected);
		String actual1 = Jobpage.Validate_JobClick_Text();
		String expected1 = "Job";
		Assert.assertEquals(actual1, expected1);

	}
	@Test(priority = 4)
	public void Validate_PayGradesText() throws InterruptedException {
		String actual = Jobpage.Validate_paygrades_Text();
		String expected = "Pay Grades";
		Assert.assertEquals(actual, expected);
		String actual1 = Jobpage.Validate_JobClick_Text();
		String expected1 = "Job";
		Assert.assertEquals(actual1, expected1);

	}
	@Test(priority = 5)
	public void Validate_Employment_StatusText() throws InterruptedException {
		String actual = Jobpage.Validate_Estatus_Text();
		String expected = "Employment Status";
		Assert.assertEquals(actual, expected);
		String actual1 = Jobpage.Validate_JobClick_Text();
		String expected1 = "Job";
		Assert.assertEquals(actual1, expected1);

	}
	@Test(priority = 6)
	public void Validate_Job_CategoriesText() throws InterruptedException {
		String actual = Jobpage.Validate_jobCategories_Text();
		String expected = "Job Categories";
		Assert.assertEquals(actual, expected);
		String actual1 = Jobpage.Validate_JobClick_Text();
		String expected1 = "Job";
		Assert.assertEquals(actual1, expected1);

	}
	@Test(priority = 7)
	public void Validate_Work_ShiftsText() throws InterruptedException {
		String actual = Jobpage.Validate_workshipts_Text();
		String expected = "Work Shifts";
		Assert.assertEquals(actual, expected);
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
