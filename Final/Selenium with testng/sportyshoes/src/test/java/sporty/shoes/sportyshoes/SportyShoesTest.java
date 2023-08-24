package sporty.shoes.sportyshoes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SportyShoesTest extends BaseTest{

	@Test
	public void testSportyShoes() throws InterruptedException {
		LandingPage landingpage = new LandingPage(driver);
		landingpage.registerUser();
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.typeName();
		registerpage.typeEmail();
		registerpage.typePass();
		registerpage.submitbtn();
		
		LogOut logoutt = new LogOut(driver);
		logoutt.clickLogout();
		
		LogIn login = new LogIn(driver);
		login.typeEmail();
		login.typePass();
		login.submitbtn();
		
		ProductsPage product = new ProductsPage(driver);
		product.addToCartone();
		
		CartComplete cartcom = new CartComplete(driver);
		String expected1 = "Message:Shoe BlueWave Running Shoes Added Successfully to Cart";
		String actual1 = cartcom.checkmsg();
		Assert.assertEquals(expected1, actual1);
		
		cartcom.goHome();
		
		product.addToCarttwo();
		
		String expected2 = "Message:Shoe Elegant Leather Loafers Added Successfully to Cart";
		String actual2 = cartcom.checkmsg();
		Assert.assertEquals(expected2, actual2);
		
		cartcom.goHome();
		
		product.goCart();
		
		PlaceOrder placeorder = new PlaceOrder(driver);
		placeorder.placeOrder();
		
		OrderComplete ordercomplete = new OrderComplete(driver);
		String expected3 = "Message:Order Placed Successfully with ID: 1";
		String actual3 = ordercomplete.OrderDone();
		Assert.assertEquals(expected3, actual3);
	}
	
}
