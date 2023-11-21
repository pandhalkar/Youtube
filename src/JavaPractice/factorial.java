package JavaPractice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.print("Enter any interger number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+ num  + " is: " + fact);

	}

}
