package com.selenium.SeleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.utility.InitializeDriver;

public class LoginPO {
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement signin;
	
	private void enterUsername(String uname){
		
		username.sendKeys(uname);
	}
	
	private void enterPassword(String passwd){
		
		password.sendKeys(passwd);
	}
	
	private DashboardPO clickSignin(){
		
		signin.click();
		return PageFactory.initElements(InitializeDriver.driver, DashboardPO.class);
	}
	
	public void enterCredentials(String user, String passwd){
		
		enterUsername(user);
		enterPassword(passwd);
		clickSignin();
	}

}
