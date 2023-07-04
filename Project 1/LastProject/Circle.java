package test;

public class Circle extends First{
	
private double r;
	
	public Circle(double r)
	{
		super();
		this.r=r;
	}
	
	public void Area()
	{
		double cal = Math.PI * r * r;
		System.out.println("Area of circle : "+cal);
	}

}
