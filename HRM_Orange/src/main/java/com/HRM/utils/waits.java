package com.HRM.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HRM.Baseclass.baseclass;

public class waits extends baseclass{
	public static int waits = 40;
	public static void waitForVisiblityofallelements(By element) {
		WebDriverWait wait = new WebDriverWait(driver, waits);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	public static void waitForelementVisible(By element) {
		WebDriverWait wait = new WebDriverWait(driver, waits);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public static void waitForElement_Clickable(By element) {
		WebDriverWait wait = new WebDriverWait(driver, waits);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void waitForElementLocator(By element) {
		WebDriverWait wait = new WebDriverWait(driver, waits);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	public static void waitForPresenceLocator(By element) {
		WebDriverWait wait = new WebDriverWait(driver, waits);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
	

}
