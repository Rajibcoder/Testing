package com.saucedemo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addtocart;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cart;
	
	public AllProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCart() {
		addtocart.click();
	}
	
	public void Cart() {
		cart.click();
	}
}
