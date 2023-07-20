package com.simplilearn.simplilearnMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplilearnTest extends BaseTest{
	
	@Test
	public void bookCourse() {
		LandingPage landingpage = new LandingPage(driver);
		
		landingpage.Allcourse();
		
		landingpage.SoftwareDev();
		
		landingpage.Automation();
		
		AutomationPage automationpage = new AutomationPage(driver);
		
		String Actual = automationpage.AutoDiv();
		
		String Expected = "Automation Test Engineer";
		
		Assert.assertEquals(Expected, Actual);
	}
}
