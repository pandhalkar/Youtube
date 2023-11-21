package JavaPractice;

import java.util.Scanner;

public class AndOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Logical AND operator: ");
		
		System.out.println("Enter value for a into boolean criteria: ");
		Scanner sc=new Scanner(System.in);
		boolean a=sc.nextBoolean();
		
		System.out.println("Enter value for B into boolean criteria:  ");
		boolean b=sc.nextBoolean();
		
//		System.out.println("Enter value for C into boolean criteria:  ");
//		boolean c=sc.nextBoolean();
		
		System.out.println("Value of A:"+ !a);
		
		System.out.println("Value of B: "+ !b);
		
		
//		if (a&&b)
//		{
//			System.out.println("Yes");
//		}
//		
//		else
//		{
//			System.out.println("No");
//		}
//		
				
		
		
	}

}
