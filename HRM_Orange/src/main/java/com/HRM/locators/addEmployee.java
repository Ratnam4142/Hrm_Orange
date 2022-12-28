package com.HRM.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.HRM.Baseclass.baseclass;
import com.HRM.utils.pageScrooling;
import com.HRM.utils.waits;

public class addEmployee extends baseclass {
	static By add = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	static By AddpageText = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div");
	static By Userrole = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
	static By employename = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
	static By status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	static By uname = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
	static By pass = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	static By cpass = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	static By save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	static By admin = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input");
	static By enabled = By.cssSelector(".oxd-select-text--focus");
	@FindBy(id = "ssss")WebElement element;
	public static String Validate_Add_click() throws InterruptedException {
		waits.waitForVisiblityofallelements(add);
//		pageScrooling.Scrolling_four();
		WebElement element = driver.findElement(add);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
	}
	public static String Validate_Addpage_text() throws InterruptedException {
		waits.waitForVisiblityofallelements(AddpageText);
		WebElement element = driver.findElement(AddpageText);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
	public static void Validate_UserRole() throws InterruptedException {
		waits.waitForElement_Clickable(Userrole);
		WebElement element = driver.findElement(Userrole);
		element.click();
		WebElement element1 = driver.findElement(admin);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element1).click().perform();	
		Thread.sleep(1000);
		
	}
	public static void Validate_employename(String ua) throws InterruptedException {
		waits.waitForVisiblityofallelements(employename);
		WebElement element = driver.findElement(employename);
		element.click();	
		element.sendKeys(ua);
		Thread.sleep(1000);
	}
	public static void Validate_adminClick() throws InterruptedException {
		waits.waitForVisiblityofallelements(admin);
		WebElement element = driver.findElement(admin);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element).click().perform();	
		Thread.sleep(1000);
	}
	public static void Validate_StatusenabledClick() throws InterruptedException {
		waits.waitForVisiblityofallelements(enabled);
		WebElement element = driver.findElement(enabled);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element).click().perform();	
		Thread.sleep(1000);
	}
	public static void Validate_Username(String uame) throws InterruptedException {
		waits.waitForVisiblityofallelements(uname);
		WebElement element = driver.findElement(uname);
		element.sendKeys(uame);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(3000);
	}
	public static void Validate_password(String Pass) throws InterruptedException {
		waits.waitForVisiblityofallelements(pass);
		WebElement element = driver.findElement(pass);
		element.sendKeys(Pass);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(3000);
	}
	public static void Validate_cpassword(String cPass) throws InterruptedException {
		waits.waitForVisiblityofallelements(cpass);
		WebElement element = driver.findElement(cpass);
		element.sendKeys(cPass);
		System.out.println(element.getAttribute("value"));
		System.out.println(element.getAttribute("type"));
		Thread.sleep(3000);
	}
	public static void Validate_Status() throws InterruptedException {
		waits.waitForVisiblityofallelements(status);
		WebElement element = driver.findElement(status);
		element.click();
		WebElement element1 = driver.findElement(enabled);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element1).click().perform();	
		Thread.sleep(3000);
	}
	public static String Validate_Save_click() throws InterruptedException {
		waits.waitForVisiblityofallelements(save);
		WebElement element = driver.findElement(save);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
	}
}
