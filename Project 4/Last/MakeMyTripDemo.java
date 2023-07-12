package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//span[contains(@class,'chNavIcon appendBottom2 chSprite chFlights active')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'lbl_input appendBottom10')])[1]")));
		driver.findElement(By.xpath("(//span[contains(@class,'lbl_input appendBottom10')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Kolkata");

		driver.findElement(By.xpath("(//p[contains(text(),'Kolkata, India')])[1]")).click();

		driver.findElement(By.xpath("(//span[contains(@class,'lbl_input appendBottom10')])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("Pune");
		driver.findElement(By.xpath("//p[contains(text(),'Pune, India')]")).click();

		
		driver.findElement(By.xpath("(//span[contains(@class,'lbl_input appendBottom10')])[3]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@aria-label,'Tue Jul 18 2023')]")));
		  
		  String flag = "False";
		 

		  while(flag=="False") 
		  {
		   
		   if(driver.findElements(By.xpath("//div[contains(@aria-label,'Tue Jul 18 2023')]")).size()>0) 
		   {
		    
		   driver.findElement(By.xpath("//div[contains(@aria-label,'Tue Jul 18 2023')]")).click(); 
		   flag="True";
		   Thread.sleep(3000);
		   }
		   
		   else 
		   {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")));
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		  
		  
	
		  driver.findElement(By.xpath("(//span[contains(@class,'lbl_input appendBottom10')])[4]")).click();
		  Thread.sleep(3000);
		  
		  String flag1 = "False";
		 

		  while(flag1=="False") 
		  {
		   
		   if(driver.findElements(By.xpath("//div[contains(@aria-label,'Mon Jul 24 2023')]")).size()>0) 
		   {
		    
		   driver.findElement(By.xpath("//div[contains(@aria-label,'Mon Jul 24 2023')]")).click(); 
		   flag1="True";
		   Thread.sleep(5000);
		   }
		   
		   else 
		   {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")));

		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		  		  		 
		  
		  driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn')]")).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'bgProperties icon20 overlayCrossIcon')]")));

		  
		  driver.findElement(By.xpath("//span[contains(@class,'bgProperties icon20 overlayCrossIcon')]")).click();
		  
		  
		  driver.findElement(By.xpath("//button[contains(@class,'splitFooterButton button buttonPrimary buttonBig appendBottom8')]")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'buttonPrimary buttonBig  lato-black button' )]")));
				
		  driver.findElement(By.xpath("//button[contains(@class,'buttonPrimary buttonBig  lato-black button' )]")).click();
		
		  driver.quit();
		  
		  System.out.println("test case passed");

	}

}
