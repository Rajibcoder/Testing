package demo;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles & Accessories"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mobile).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple")));
		
		driver.findElement(By.linkText("Apple")).click();
		
		driver.findElement(By.xpath("(//img[contains(@class,'s-image')])[1]")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.id("buy-now-button")).click();
		
		String Actual = driver.findElement(By.xpath("//h1[contains(@class,'a')]")).getText();
		String Expected = "Sign in";
		
		if(Actual.equals(Expected))
		{
			System.out.println("Test Case pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		driver.quit();

	}

}
