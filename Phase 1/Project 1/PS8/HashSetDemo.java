package collectionframework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> student = new HashSet<>();
		
		student.add("Rajib");
		student.add("Rana");
		student.add("Biki");
		student.add("Raja");
		student.add("Krish");
		student.add("Krish");
		
		for(String i : student)
		{
			System.out.println(i);
		}
		
		System.out.println("Total size of students = "+student.size());
		
		//System.out.println("Item at index 4 = "+student.get(4));
		
		//System.out.println("Index of Krish = "+student.indexOf("Krish"));
		
		System.out.println("Is Biki is on the list = "+student.contains("Biki"));

	}

}
