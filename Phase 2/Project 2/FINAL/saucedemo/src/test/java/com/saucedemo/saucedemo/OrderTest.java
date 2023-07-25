package com.saucedemo.saucedemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class OrderTest extends BaseTest{
	
	@Test
	public void Order() {
		LandingPage landingpage = new LandingPage(driver);
		landingpage.UserName();
		landingpage.Pass();
		landingpage.Loginbtn();
		
		AllProducts allproducts = new AllProducts(driver);
		allproducts.AddToCart();
		allproducts.Cart();
		
		Cart cart = new Cart(driver);
		cart.Chkout();
		
		CheckoutInfo chkinfo = new CheckoutInfo(driver);
		chkinfo.Fname();
		chkinfo.Lname();
		chkinfo.Pcode();
		chkinfo.clickContinue();
		
		Overview overview = new Overview(driver);
		overview.Finish();
		
		VerifyOrder verifyorder = new VerifyOrder(driver);
		String Actual = verifyorder.Ordertxt();
		String Expected = "Thank you for your order!";
		assertEquals(Actual, Expected);
	}
}
