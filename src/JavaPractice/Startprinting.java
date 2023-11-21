package JavaPractice;

import java.util.Scanner;

public class Startprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Star printing program");
		System.out.print("Enter Number:");
		
		Scanner sc=new Scanner(System.in);
		 int val=sc.nextInt();
		 
		 for(int i=val; i>=0; i--)
		 {	 
			 for(int j=0; j<=i;j++) {
		 
			 System.out.print("*");
		 }
		 System.out.print("\n");
		
		 }
	}

}
