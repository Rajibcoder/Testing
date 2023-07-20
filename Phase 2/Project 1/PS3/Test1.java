package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void car1() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		String expectedTitle = "Facebook – log in or sign up";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.quit();
	}

}
