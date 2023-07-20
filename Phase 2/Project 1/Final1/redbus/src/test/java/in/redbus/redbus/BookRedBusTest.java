package in.redbus.redbus;

import org.testng.annotations.Test;

public class BookRedBusTest extends BaseTest{
	
	@Test
	public void bookBus() throws InterruptedException {
		
		LandingPage landingpage = new LandingPage(driver);
		
		landingpage.FromCity("Mumbai");
		
		landingpage.ToCity("Pune");
		
		landingpage.Date();
		
		SelectBus selectbus = new SelectBus(driver);
		
		selectbus.ViewBus();
		
		selectbus.ViewSeat();
		
		selectbus.BoardingPoint();
		
		selectbus.DroppingPoint();
		
		selectbus.ChooseSeat();
	}
}
