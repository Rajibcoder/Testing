package in.redbus.redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(xpath = "(//div[contains(@role,'button')])[1]")
	private WebElement fromcity;
	
	@FindBy(xpath = "//li[contains(@class,'cursorPointing')]")
	private WebElement selectcity;
	
	@FindBy(xpath = "(//div[contains(@role,'button')])[2]")
	private WebElement tocity;
	
	@FindBy(id = "search_button")
	private WebElement date;
	
	@FindBy(xpath = "(//div[contains(@class,'isgDNj')])[33]")
	private WebElement selectdate;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void FromCity(String city) throws InterruptedException {
		fromcity.sendKeys(city);
		Thread.sleep(3000);
		selectcity.click();
	}
	
	public void ToCity(String city) throws InterruptedException {
		tocity.sendKeys(city);
		Thread.sleep(3000);
		selectcity.click();
	}
	
	public void Date() {
		date.click();
		selectdate.click();
		date.click();
	}

}
