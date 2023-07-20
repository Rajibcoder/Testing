package collectionframework;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day : ");
		String day = sc.nextLine();
		
		if(day.toLowerCase().equals("sunday"))
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println("Duty Time");
		}

	}

}
