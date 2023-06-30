package project;

public class Rectangle extends Parent{
	
	private double width;
	private double length;
	
	public Rectangle(double width,double length) 
	{
		width = width;
		length = length;
	}
	
	public void AreaOf()
	{
		double area = width * length;
		System.out.println("Area of Rectangle = "+area);
	}


}
