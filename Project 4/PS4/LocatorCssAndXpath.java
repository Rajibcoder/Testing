package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCssAndXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("login")).click();		
		
		String text = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
		System.out.println(text);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
		
		driver.quit();

	}

}
