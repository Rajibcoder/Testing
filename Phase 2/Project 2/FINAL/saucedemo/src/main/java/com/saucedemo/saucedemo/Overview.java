package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview {
	
	@FindBy(id = "finish")
	private WebElement finish;
	
	public Overview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Finish() {
		finish.click();
	}

}
