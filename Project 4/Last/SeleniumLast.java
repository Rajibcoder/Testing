package demo;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumLast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.xpath("(//footer[contains(@class,'card-footer')])[1]")).click();
		
		driver.findElement(By.id("fullName")).sendKeys("Rajib Kumar Maity");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//footer[contains(@class,'card-footer')])[4]")).click();
		
		driver.findElement(By.id("confirm")).click();
		
		driver.switchTo().alert().accept();
		
		driver.navigate().back();

		driver.findElement(By.xpath("(//footer[contains(@class,'card-footer')])[7]")).click();
		
		driver.findElement(By.id("multi")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(0));
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//footer[contains(@class,'card-footer')])[3]")).click();
		
		WebElement superhero = driver.findElement(By.id("superheros"));
		
		Select select = new Select(superhero);
		
		select.selectByVisibleText("The Avengers");
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//footer[contains(@class,'card-footer')])[8]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Rajibcoder");
		
		driver.findElement(By.id("search")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("test")));
		
		driver.findElement(By.partialLinkText("test")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
