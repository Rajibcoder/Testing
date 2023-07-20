package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Verifytitle {
	ChromeDriver driver;
	
	@BeforeTest
	public void lunchapp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void TitleVerify() {
		String expectedTitle = "Facebook – log in or sign upp";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
