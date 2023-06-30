package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

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
		catch(ArithmeticException e) {
			System.out.println("Do not enter 0!!");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter only Integer Values!!");
		}
	}

}
