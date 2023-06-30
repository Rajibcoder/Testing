package project;

public class Circle extends Parent{
	
	private double radius;

	public Circle(double radius)
	{
		radius = radius;
	}
	
	public void AreaOf()
	{
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle = "+area);
	}
}
