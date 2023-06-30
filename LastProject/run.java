package first;

import java.util.ArrayList;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> shapes = new ArrayList<>();
        
       
            Circle circle = new Circle(7.4);
            shapes.add(circle);
            
            Rectangle rectangle = new Rectangle(5,6);
            shapes.add(rectangle);
            
            for (Shape shape : shapes) {
            try {
                shape.displayArea();
                if(shape instanceof Rectangle) {
                	Rectangle rect = (Rectangle) shape;
                	rect.calculateArea();
                }
                else if (shape instanceof Circle) {
                	Circle cir = (Circle) shape;
                cir.calculateArea();
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("Programme completed.");
        }
    }

	}

}
