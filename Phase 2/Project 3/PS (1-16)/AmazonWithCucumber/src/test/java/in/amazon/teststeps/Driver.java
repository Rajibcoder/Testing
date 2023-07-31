package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobileBrand;
import in.amazon.pages.ApplePhone;
import in.amazon.pages.BuyNow;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools{
	
	protected static AllMobileBrand mobilebrand;
	protected static LandingPage landingpage;
	protected static ApplePhone applephone;
	protected static BuyNow buynow;
	protected static SignIn signin;
	
	public static void init() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    landingpage = new LandingPage(driver);
	    mobilebrand = new AllMobileBrand(driver);
	    applephone = new ApplePhone(driver);
	    buynow = new BuyNow(driver);
	    signin = new SignIn(driver);
	}
}
