package in.redbus.redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	ChromeOptions options;
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void lunchApp() throws InterruptedException {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
