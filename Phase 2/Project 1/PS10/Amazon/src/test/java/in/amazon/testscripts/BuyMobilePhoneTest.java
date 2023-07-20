package in.amazon.testscripts;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import in.amazon.pages.AllMobileBrand;
import in.amazon.pages.ApplePhone;
import in.amazon.pages.BuyNow;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class BuyMobilePhoneTest extends BaseTest{
	
	@Test
	public void buyMobile() throws InterruptedException {
	LandingPage landingpage = new LandingPage(driver);
	landingpage.clickMobile();
	
	AllMobileBrand allmobilebrand = new AllMobileBrand(driver);
	allmobilebrand.hoverOverMobileAndAccessories();
	
	
	allmobilebrand.clickApple();
	
	ApplePhone applePhone = new ApplePhone(driver);
	applePhone.clickFirstMobile();
	
	ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	
	BuyNow buyMobile = new BuyNow(driver);
	buyMobile.BuyNowBtnClick();
	
	SignIn sign = new SignIn(driver);
	String Expected = "Sign in";
	String Actual = sign.SignInCheck();
	Assert.assertEquals(Expected, Actual);
	
	}
	
	
	
}
