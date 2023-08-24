package sporty.shoes.sportyshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderComplete {

	@FindBy(xpath = "/html/body/div[3]/div/p")
	private WebElement OrderComp;
	
	public OrderComplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String OrderDone() {
		return OrderComp.getText();
	}
}
