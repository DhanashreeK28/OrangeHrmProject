package com.selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeDriver {

	public static WebDriver driver=null;
	
	public static WebDriver initialize(String url){
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}
}
