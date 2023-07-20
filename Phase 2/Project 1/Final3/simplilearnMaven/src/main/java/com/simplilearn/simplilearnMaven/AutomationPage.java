package com.simplilearn.simplilearnMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[4]/div/div[1]/div[1]/div/div[2]/h1")
	private WebElement autodiv;
	
	public AutomationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String AutoDiv() {
		return autodiv.getText();
	}

}
