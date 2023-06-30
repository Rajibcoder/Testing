package run;

import java.util.ArrayList;

import project.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Parent> areaStore = new ArrayList<>();
		
		try {
			Circle area1 = new Circle(7.8);
			areaStore.add(area1);
			
			Rectangle area2 = new Rectangle(5, 3);
			areaStore.add(area2);
			
			for(Parent i : areaStore) {
				
			}
			
		}
		
	}

}
