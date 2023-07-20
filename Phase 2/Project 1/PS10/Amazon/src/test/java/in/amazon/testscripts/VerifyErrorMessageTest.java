package in.amazon.testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class VerifyErrorMessageTest extends BaseTest{
	
	
	@Test
	public void VerifyError() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.ClickSignIn();
		
		SignIn signin = new SignIn(driver);
		signin.EnterEmail("abc@mp.com");
		signin.ClickContinue();
		
		String Expected = "We cannot find an account with that email address";
		String Actual = signin.checkmsg();
		Assert.assertEquals(Expected, Actual);
	}
}
