package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int passWord = 456;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password - ");
		int enteredPassword = sc.nextInt();
		while(enteredPassword !=passWord)
		{
			System.out.println("You Entered Wrong Password!! Try again!!");
			enteredPassword = sc.nextInt();
		}
		System.out.println("Welcome");
		sc.close();

	}

}
