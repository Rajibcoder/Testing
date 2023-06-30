package exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("Enter first no - ");
		int n1 = sc.nextInt();
		System.out.println("Enter second no - ");
		int n2 = sc.nextInt();
		
		System.out.println("Result = "+(n1/n2));
		}
		catch (Exception e) {
			System.out.println("You entered a invalid input!!");
		}
		finally {
			System.out.println("Done");
		}
	}

}
