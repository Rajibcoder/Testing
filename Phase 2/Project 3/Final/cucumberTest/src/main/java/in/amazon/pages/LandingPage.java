package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions; 
	private WebDriverWait wait;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(xpath = "//div[contains(@class,'autocomplete-results-container')]")
	private WebElement searchboxcontainer;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void selectsearchitem(String item) {
		searchbox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(searchboxcontainer));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
