package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> student = new HashMap<>();
		
		student.put(101, "Rajib");
		student.put(102, "Rana");
		student.put(103, "Biki");
		student.put(104, "Krish");
		student.put(105, "Raja");
		
		for(Map.Entry i : student.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
	}

}
