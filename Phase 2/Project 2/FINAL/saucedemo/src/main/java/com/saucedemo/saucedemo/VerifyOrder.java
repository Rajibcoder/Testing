package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VerifyOrder {
	
	@FindBy(xpath = "//h2[contains(@class,'complete-header')]")
	private WebElement ordertxt;
	
	public VerifyOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String Ordertxt() {
		return ordertxt.getText();
	}
}
