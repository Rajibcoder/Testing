package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import utils.ReadExcel;

public class DDF extends BaseTest{
	//Data Driven frameWork when the same application tested against different set of data
	@Test
	public void VerifyError() throws IOException {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.ClickSignIn();
		String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		
		for(int i=0;i<data.length;i++)
		{
			String username = data[i][1];
			SignIn signin = new SignIn(driver);
			signin.EnterEmail(username);
			signin.ClickContinue();
			
			String Expected = "We cannot find an account with that email address";
			String Actual = signin.checkmsg();
			Assert.assertEquals(Expected, Actual);
		}
	}

}
