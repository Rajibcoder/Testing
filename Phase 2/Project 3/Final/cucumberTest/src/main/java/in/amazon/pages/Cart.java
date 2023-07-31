package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	@FindBy(xpath = "//span[contains(@class,'a-size-medium-plus a-color-base sw-atc-text a-text-bold')]")
	private WebElement cartText;
	
	@FindBy(id = "sw-ptc-form")
	private WebElement proceedToBuy;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String CartText() {
		return cartText.getText();
	}
	
	public void Buy() {
		proceedToBuy.click();
	}
}
