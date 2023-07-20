package in.redbus.redbus;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBus {
	WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class,'button')])[2]")
	private WebElement viewbus;
	
	@FindBy(xpath = "(//div[contains(@class,'button view-seats fr')])[1]")
	private WebElement viewseat;
	
	@FindBy(xpath = "(//div[contains(@class,'radio-unchecked')])[1]")
	private WebElement boardingpoint;
	
	@FindBy(xpath = "(//div[contains(@class,'radio-unchecked')])[1]")
	private WebElement droppingpoint;
	
	@FindBy(id = "gotoseat_btn")
	private WebElement chooseseat;
	
	public SelectBus(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void ViewBus() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(viewbus));
		viewbus.click();
		Thread.sleep(2000);
	}
	
	public void ViewSeat() throws InterruptedException {
		viewseat.click();
		Thread.sleep(1000);
	}
	
	public void BoardingPoint() throws InterruptedException {
		boardingpoint.click();
		Thread.sleep(1000);
	}
	
	public void DroppingPoint() throws InterruptedException {
		droppingpoint.click();
		Thread.sleep(1000);
	}
	
	public void ChooseSeat() {
		chooseseat.click();
	}
}
