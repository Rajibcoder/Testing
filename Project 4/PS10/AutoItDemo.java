package Autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.remove.bg/");
		
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[3]")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("resourses//save1.exe");

	}

}
