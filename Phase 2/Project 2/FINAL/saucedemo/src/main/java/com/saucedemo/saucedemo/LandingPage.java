package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginbtn;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserName() {
		username.sendKeys("standard_user");
	}
	
	public void Pass() {
		password.sendKeys("secret_sauce");
	}
	
	public void Loginbtn() {
		loginbtn.click();
	}

}
