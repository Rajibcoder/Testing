package com.simplilearn.simplilearnMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	Actions actions;
	WebDriverWait wait;
	
	@FindBy(id = "menu-button")
	private WebElement allcourse;
	
	@FindBy(xpath = "//a[contains(@title,'Software Development')]")
	private WebElement softwaredev;
	
	@FindBy(xpath = "(//div[contains(@class,'menu-master-prg')])[2]")
	private WebElement automation;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void Allcourse() {
		actions.moveToElement(allcourse).build().perform();
		
	}
	
	public void SoftwareDev() {
		wait.until(ExpectedConditions.visibilityOf(softwaredev));
		actions.moveToElement(softwaredev).build().perform();
	}
	
	public void Automation() {
		wait.until(ExpectedConditions.visibilityOf(automation));
		automation.click();
	}

}
