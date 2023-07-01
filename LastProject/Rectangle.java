package test;

public class Rectangle extends First{
	
	private double b;
	private double w;
	
	public Rectangle(double b,double w)
	{
		this.b=b;
		this.w=w;
	}
	
	public void Area()
	{
		double cal = b * w;
		System.out.println("Area of rectangle : "+cal);
	}

}
