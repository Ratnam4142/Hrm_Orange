package com.HRM.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.HRM.Baseclass.baseclass;
import com.HRM.utils.waits;

public class Jobpage extends baseclass{
	static By headerText = By.className("oxd-topbar-body-nav"); 
	static By jobclick = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span");
	static By JobText = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul");
	static By jobtitle = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a");
	static By paygrades = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a");
	static By Estatus = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a");
	static By jobCategories = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a");
	static By workshipts = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a");


	public static String Validate_headerText() throws InterruptedException {
		waits.waitForVisiblityofallelements(headerText);
		WebElement element = driver.findElement(headerText);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_JobClick_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(jobclick);
		WebElement element = driver.findElement(jobclick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_jobtitle_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(jobtitle);
		WebElement element = driver.findElement(jobtitle);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_paygrades_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(paygrades);
		WebElement element = driver.findElement(paygrades);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_Estatus_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(Estatus);
		WebElement element = driver.findElement(Estatus);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_jobCategories_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(jobCategories);
		WebElement element = driver.findElement(jobCategories);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
	public static String Validate_workshipts_Text() throws InterruptedException {
		waits.waitForVisiblityofallelements(workshipts);
		WebElement element = driver.findElement(workshipts);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(4000);
		return text;
	}
}
