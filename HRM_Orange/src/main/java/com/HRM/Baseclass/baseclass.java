package com.HRM.Baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	public static WebDriver driver;
	public static Properties prop;

	public baseclass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./configs/config.properties");
			prop.load(ip);
			ip.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	public void inslization() {
		String browsername = prop.getProperty("Browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("The browser is matched");
		}else {

			System.out.println("The browser is not matched");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		System.out.println("The browser open is as"+" "+driver.getClass());
	}
	
	public void TearDown() {
		driver.close();
	}

}



