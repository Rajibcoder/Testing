package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	@FindBy(id = "checkout")
	private WebElement checkOut;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Chkout() {
		checkOut.click();
	}
}
