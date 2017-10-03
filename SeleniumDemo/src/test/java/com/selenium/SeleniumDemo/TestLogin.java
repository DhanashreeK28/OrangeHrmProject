package com.selenium.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.utility.AppConstant;
import com.selenium.utility.InitializeDriver;

public class TestLogin {

	@Test
	public void initializeLogin(){
		
		WebDriver driver = InitializeDriver.initialize(AppConstant.url);
		LoginPO login = PageFactory.initElements(driver, LoginPO.class);
		login.enterCredentials("Admin", "admin");
	}
	
	
	
}
