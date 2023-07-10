package selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//edit box
		driver.findElement(By.id("email")).sendKeys("Rajib@123");
		
		//link
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.get("https://www.facebook.com/");
		
		//button
		driver.findElement(By.name("login")).click();
		driver.get("https://www.facebook.com/");
				
		//checkbox and radio button
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.id("yes")).click();
		
		driver.findElement(By.id("two")).click();
		
		//dropdown list
		driver.get("https://letcode.in/dropdowns");
		
		WebElement language =  driver.findElement(By.id("lang"));
		
		Select select = new Select(language);
		
		select.selectByVisibleText("Java");
		
		//webtable
		driver.get("https://letcode.in/table");
		
		WebElement firsttable =  driver.findElement(By.id("shopping"));
		
		List<WebElement> rows = firsttable.findElements(By.tagName("tr"));
		
		int sum = 0;
		for(int i=1;i<rows.size();i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			int price = Integer.parseInt(columns.get(1).getText());
			sum = sum+price;
		}
		
		int Expected = 858;
		if(Expected == sum)
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case failed");
		}
		
		//frame
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("DEPRECATED")).click();
		
		//switch between tabs
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Instagram")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		

	}

}
