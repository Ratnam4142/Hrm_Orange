package com.HRM.utils;

import org.openqa.selenium.JavascriptExecutor;

import com.HRM.Baseclass.baseclass;

public class pageScrooling extends baseclass{

	public static void Scrolling_One() {
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scrollBy(0,100)");
	}
	public static void Scrolling_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(,200)");
	}
	public static void Scrolling_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,300)");
	}
	public static void Scrolling_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,400)");
	}
	public static void Scrolling_five() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,500)");
	}
	public void Scrolling_six() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,600)");
	}
	public void Scrolling_seven() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,700)");
	}
	public void Scrolling_eight() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,800)");
	}
	public void Scrolling_nine() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,900)");
	}
	public void Scrolling_Nine() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(900,-200)");
	}

}
