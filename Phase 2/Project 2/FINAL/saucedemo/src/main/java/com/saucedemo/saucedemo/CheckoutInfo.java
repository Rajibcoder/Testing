package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfo {
	
	@FindBy(id = "first-name")
	private WebElement fname;
	
	@FindBy(id = "last-name")
	private WebElement lname;
	
	@FindBy(id = "postal-code")
	private WebElement pcode;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	public CheckoutInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Fname() {
		fname.sendKeys("Rajib");
	}
	
	public void Lname() {
		lname.sendKeys("Maity");
	}
	
	public void Pcode() {
		pcode.sendKeys("700003");
	}

	public void clickContinue() {
		Continue.click();
	}
}
