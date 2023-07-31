package in.amazon.teststeps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPage extends Driver{
	
	@Given("a user is in the LandingPage on amazon")
	public void a_user_is_in_the_landing_page_on_amazon() {
		assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he type search-item in the search box and then select 3rd option from the drop-down")
	public void he_type_search_item_in_the_search_box_and_then_select_3rd_option_from_the_drop_down() {
		landingpage.selectsearchitem("Physics books");
	}

	@When("select rating 4star and above from left side bar")
	public void select_rating_4star_and_above_from_left_side_bar() throws InterruptedException {
		allproduct.selectStar();
	}

	@When("Click on the first search result")
	public void click_on_the_first_search_result() {
	    allproduct.FirstProduct();
	}

	@When("Click Add to Cart button")
	public void click_add_to_cart_button() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	    product.AddCart();
	}

	@When("Verify the text Added to Cart is displayed")
	public void verify_the_text_added_to_cart_is_displayed() {
		String Actual = cart.CartText();
		String Expected = "Added to Cart";
	    assertEquals(Actual,Expected);
	}

	@When("Click on Proceed to Buy button")
	public void click_on_proceed_to_buy_button() {
	    cart.Buy();
	}

	@Then("Verify user is on the Sign in page")
	public void verify_user_is_on_the_sign_in_page() {
		assertTrue(driver.getTitle().equals("Amazon Sign In"));
	}

}
