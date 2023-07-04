package test;

public class Triangle extends First{
	
	private double b;
	private double h;
	
	public Triangle(double b,double h)
	{
		this.b=b;
		this.h=h;
	}
	
	public void Area()
	{
		double cal = 0.5 * b * h;
		System.out.println("Area of Triangle : "+cal);
	}

}
