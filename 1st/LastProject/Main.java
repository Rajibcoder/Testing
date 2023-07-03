package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(1.2);
		Rectangle rect = new Rectangle(2, 5);
		Triangle trian = new Triangle(4, 4);
		
		ArrayList <First> list = new ArrayList<>();
		
		list.add(circle);
		list.add(rect);
		list.add(trian);
		
		try {
			
			for(First i : list)
			{
				i.Area();
			}
			
		}
		catch (Exception e) {
			System.out.println("error");
			
		}
		finally {
			System.out.println("complete");
		}

	}

}
