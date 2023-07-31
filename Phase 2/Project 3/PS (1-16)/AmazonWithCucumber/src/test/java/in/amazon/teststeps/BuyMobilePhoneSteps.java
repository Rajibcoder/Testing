package in.amazon.teststeps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver{
	
	@Given("a user is in the LandingPage on amazon")
	public void a_user_is_in_the_landing_page_on_amazon() {
	    assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he clicks on Mobiles in the navigatiom bar")
	public void he_clicks_on_mobiles_in_the_navigatiom_bar() {
	    
	    landingpage.clickMobile();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
	    
	    mobilebrand.hoverOverMobileAndAccessories();
	}

	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
		mobilebrand.clickApple();
	}

	@When("he clicks on the second abailable phone")
	public void he_clicks_on_the_second_abailable_phone() {
		
		applephone.clickSecondMobile();
	}
	
	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on buy now button")
	public void he_clicks_on_buy_now_button() {
		
		buynow.BuyNowBtnClick();
	}

	@Then("he must be able to purchase the mobile phone successfully.")
	public void he_must_be_able_to_purchase_the_mobile_phone_successfully() {
		
		String Actual =  signin.SignInCheck();
		String Expected = "Sign in";
		assertEquals(Actual, Expected);
	}

}
