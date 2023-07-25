package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	static WebDriver driver;
	
	@BeforeAll
	public static void lunchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
	}
	
	@Test
	public void verify() {
		String Expected = "LinkedIn India: Log In or Sign Up";
		String Actual = driver.getTitle();
		assertEquals(Expected,Actual);
	}
	
	@AfterAll
	public static void closeApp() {
		driver.quit();
	}

}
