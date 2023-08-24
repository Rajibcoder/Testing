package sporty.shoes.sportyshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement submit;
	
	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail() {
		email.sendKeys("rajib1@gmail.com");
	}
	
	public void typePass() {
		pass.sendKeys("12345");
	}
	
	public void submitbtn() {
		submit.click();
	}
}
