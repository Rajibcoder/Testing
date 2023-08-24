package sporty.shoes.sportyshoes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	Actions actions;
	JavascriptExecutor js;

	@FindBy(linkText = "Place Order")
	private WebElement placeOrderbtn;
	
	public PlaceOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
	}
	
	public void placeOrder() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", placeOrderbtn);
		js.executeScript("arguments[0].click()", placeOrderbtn);
	}
}
