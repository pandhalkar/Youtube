package JavaPractice;

import java.util.Scanner;

public class If_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner age= new Scanner(System.in);
		System.out.print("Enter your age: ");
		int c=age.nextInt();
		
		if (c >=18)
		{
			System.out.println("pass!");
		}
		
		else
		{
			System.out.println("Better Luck Next Time !");
		}
				

	}

}
