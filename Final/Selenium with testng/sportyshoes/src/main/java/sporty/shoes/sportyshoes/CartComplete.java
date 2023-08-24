package sporty.shoes.sportyshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartComplete {

	@FindBy(xpath = "/html/body/div[3]/div/p")
	private WebElement cartMessage;
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	public CartComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String checkmsg() {
		return cartMessage.getText();
	}
	
	public void goHome() {
		home.click();
	}
}
