package sporty.shoes.sportyshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id = "name")
	private WebElement enterName;
	
	@FindBy(id = "email")
	private WebElement enterEmail;
	
	@FindBy(id = "password")
	private WebElement enterPass;
	
	@FindBy(xpath = "//button[contains(@type,\"submit\")]")
	private WebElement submit;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typeName() {
		enterName.sendKeys("Rajib Kumar Maity");
	}
	
	public void typeEmail() {
		enterEmail.sendKeys("rajib1@gmail.com");
	}
	
	public void typePass() {
		enterPass.sendKeys("12345");
	}
	
	public void submitbtn() {
		submit.click();
	}
}
