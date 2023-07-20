package demo;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test(groups = "Luxury Cars")
	public void car1() {
		System.out.println("Mercedes");
	}
	
	@Test(groups = "Luxury Cars")
	public void car2() {
		System.out.println("BMW");
	}
	
	@Test(groups = {"Luxury Cars","Car"})
	public void car3() {
		System.out.println("Toyota");
	}
	
	@Test(groups = "Car")
	public void car4() {
		System.out.println("Hyundai");
	}
	
	@Test(groups = "Car",enabled = false)
	public void car5() {
		System.out.println("Honda");
	}
	

}
