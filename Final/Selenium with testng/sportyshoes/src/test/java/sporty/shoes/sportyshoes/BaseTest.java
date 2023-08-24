package sporty.shoes.sportyshoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	@BeforeTest
	public void lunchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:9010/");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
