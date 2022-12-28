package com.HRM.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HRM.Baseclass.baseclass;

public class AdminFunctionality extends baseclass{
	
	static By LoginHome = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul");
	static By adminClick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	static By userm = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav");
	static By alltext = By.xpath("//*[@class=\"oxd-table-card\"]//*[@class=\"oxd-table-row oxd-table-row--with-border\"]");
	public static String Validate_LoginHometext() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LoginHome));
		WebElement element = driver.findElement(LoginHome);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
	public static String Validate_AdminButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(adminClick));
		WebElement element = driver.findElement(adminClick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
	}
	public static String Validate_adminHeader_Text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(userm));
		WebElement element = driver.findElement(userm);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
	public static void Validate_All_Text() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(alltext));
		List<WebElement> element = driver.findElements(alltext);
		int size = element.size();
		System.out.println(size);
		for(int i = 0; i<size; i++) {
			String text = element.get(i).getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
	}
}
