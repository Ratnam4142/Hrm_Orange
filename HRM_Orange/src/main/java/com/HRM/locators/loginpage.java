package com.HRM.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HRM.Baseclass.baseclass;

public class loginpage extends baseclass {
	static By logintext = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot");
	static By Loginclick = By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");
	static By error = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
	static By uname = By.name("username");
	static By pass = By.name("password");
	static By errorValidation = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	
	public static void validate_title() {
		String element = "OrangeHRM";
		if(driver.getTitle().equals(element)) {
			System.out.println("Title is ok");
		}else {
			System.out.println("Title is not ok");
		}
		System.out.println(driver.getTitle());
	}
	public static String Validate_Logintext() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(logintext));
		WebElement element = driver.findElement(logintext);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
		
	}
	public static String Validate_LoginButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Loginclick));
		WebElement element = driver.findElement(Loginclick);
		String text = element.getText();
		System.out.println(text);
		element.click();
		Thread.sleep(5000);
		return text;
		
	}
	public static String Validate_Error_Message() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(error));
		WebElement element = driver.findElement(error);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
	}
	public static boolean Validate_EnterUsername(String name) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(uname));
		WebElement element = driver.findElement(uname);
		boolean b = element.isDisplayed();
		element.sendKeys(name);
		Thread.sleep(5000);
		return b;
	}
	public static boolean Validate_EnterPassword(String password) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pass));
		WebElement element = driver.findElement(pass);
		boolean b = element.isDisplayed();
		element.sendKeys(password);
		Thread.sleep(5000);
		return b;
	}
	
	public static String Validate_Errormessage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(errorValidation));
		WebElement element = driver.findElement(errorValidation);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		return text;
		
	}
}
