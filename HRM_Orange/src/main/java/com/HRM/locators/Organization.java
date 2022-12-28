package com.HRM.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.HRM.Baseclass.baseclass;
import com.HRM.utils.waits;

public class Organization extends baseclass{
	static By orgclick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
	static By loction = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a");
	static By locatext = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]");
	static By name = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	static By city = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
	static By cuntry = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
	static By canada  = By.xpath("//*[text()='Canada']");


	public static boolean Validate_organizationClick() throws InterruptedException {
		waits.waitForVisiblityofallelements(orgclick);

		WebElement element = driver.findElement(orgclick);
		boolean b = element.isDisplayed();
		if(b) {
			System.out.println("yes is displayed");
		}else {
			System.out.println("yes is not displayed");
		}
		String text = element.getText();
		System.out.println(text);
		element.click();	
		Thread.sleep(1000);
		return b;
	}
	public static boolean Validate_LocationClick() throws InterruptedException {
		waits.waitForVisiblityofallelements(loction);

		WebElement element = driver.findElement(loction);
		boolean b = element.isDisplayed();
		if(b) {
			System.out.println("yes location is displayed");
		}else {
			System.out.println("yes location is not displayed");
		}
		String text = element.getText();
		System.out.println(text);
		element.click();	
		Thread.sleep(1000);
		return b;
	}
	public static String Validate_Location_text() throws InterruptedException {
		waits.waitForVisiblityofallelements(locatext);
		WebElement element = driver.findElement(locatext);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
	public static void Validate_name(String ua) throws InterruptedException {
		waits.waitForVisiblityofallelements(name);
		WebElement element = driver.findElement(name);
		boolean b = element.isSelected();
		if (b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		element.click();
		element.clear();
		element.sendKeys(ua);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(1000);
	}
	public static void Validate_cityname(String ul) throws InterruptedException {
		waits.waitForVisiblityofallelements(city);
		WebElement element = driver.findElement(city);
		boolean b = element.isSelected();
		if (b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		element.click();
		element.clear();
		element.sendKeys(ul);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(1000);
	}
	public static String Validate_cuntry_click() throws InterruptedException {
		waits.waitForVisiblityofallelements(cuntry);
//		pageScrooling.Scrolling_four();
		WebElement element = driver.findElement(cuntry);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
	}
	public static String Validate_canada_click() throws InterruptedException {
		waits.waitForVisiblityofallelements(canada);
//		pageScrooling.Scrolling_four();
		WebElement element = driver.findElement(canada);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
	}
}
