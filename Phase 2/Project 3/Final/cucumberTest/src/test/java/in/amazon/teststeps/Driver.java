package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllProducts;
import in.amazon.pages.Cart;
import in.amazon.pages.LandingPage;
import in.amazon.pages.Product;

public class Driver extends Tools{
	protected static LandingPage landingpage;
	protected static AllProducts allproduct;
	protected static Product product;
	protected static Cart cart;
	
	public static void init() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    landingpage = new LandingPage(driver);
	    allproduct = new AllProducts(driver);
	    product = new Product(driver);
	    cart = new Cart(driver);
	}

}
