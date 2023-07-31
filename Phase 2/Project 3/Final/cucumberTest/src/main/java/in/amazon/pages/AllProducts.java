package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AllProducts {
	
	@FindBy(xpath = "//section[contains(@aria-label,'4 Stars & Up')]")
	private WebElement stars;
	
	@FindBy(xpath = "(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]")
	private WebElement firstproduct;
	
	public AllProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectStar() throws InterruptedException {
		stars.click();
		Thread.sleep(2000);
	}
	
	public void FirstProduct() {
		firstproduct.click();
	}
}
