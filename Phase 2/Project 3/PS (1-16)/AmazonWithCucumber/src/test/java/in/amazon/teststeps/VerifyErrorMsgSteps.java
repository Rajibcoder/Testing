package in.amazon.teststeps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMsgSteps extends Driver{
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
	    assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he click on sign-in button")
	public void he_click_on_sign_in_button() {
		
	    landingpage.ClickSignIn();
	}

	@When("he enters invalid email address in the email text box")
	public void he_enters_invalid_email_address_in_the_email_text_box() {
	 
	    signin.EnterEmail("rajib@ll");
	}

	@When("he click on the continue button")
	public void he_click_on_the_continue_button() {
	    signin.ClickContinue();
	}

	@Then("he must see the error message - {string}")
	public void he_must_see_the_error_message(String string) {
	    String Actual = signin.checkmsg();
	    String Expected = string;
	    assertEquals(Actual, Expected);
	}
	
	@Given("he enters an invalid email address {string} in the email text-box")
	public void he_enters_an_invalid_email_address_in_the_email_text_box(String string) {
	    signin.EnterEmail(string);
	}

}
