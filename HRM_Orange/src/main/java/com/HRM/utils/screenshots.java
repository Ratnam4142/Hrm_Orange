package com.HRM.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.HRM.Baseclass.baseclass;

public class screenshots extends baseclass {

	public static void ScreenShotTSC(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("Screenshots/Screenshot"+result.getClass()+"_OF_"+result.getName()+".png");
				FileUtils.copyFile(source, dest);
				System.out.println("the screenshot taken as......"+result.getName());
			} catch (Exception e) {
				System.out.println("The exception taken as......."+ e.getMessage());
			}
		}

	}
}
