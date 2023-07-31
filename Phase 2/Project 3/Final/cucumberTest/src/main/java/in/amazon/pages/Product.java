package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {

	@FindBy(id = "add-to-cart-button")
	private WebElement addtocart;
	
	public Product (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddCart() {
		addtocart.click();
	}
}
