package sporty.shoes.sportyshoes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {

	Actions actions;
	JavascriptExecutor js;
	
	@FindBy(xpath = "(//a[contains(@class,'btn')])[1]")
	private WebElement addCartone;
	
	@FindBy(xpath = "(//a[contains(@class,'btn')])[2]")
	private WebElement addCarttwo;
	
	@FindBy(linkText = "Cart")
	private WebElement CartPage;
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		
	}
	
	public void addToCartone() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", addCartone);
		js.executeScript("arguments[0].click()", addCartone);
	}
	
	public void addToCarttwo() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", addCarttwo);
		js.executeScript("arguments[0].click()", addCarttwo);
	}
	
	public void goCart() {
		CartPage.click();
	}
}
