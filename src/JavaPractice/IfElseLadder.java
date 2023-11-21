package JavaPractice;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value: ");
		int val=sc.nextInt();


//		if(val>=10&&val<=20) {
//			System.out.println("Good");
//		} else if (val>=21&&val<=30) {
//			System.out.println("Better");
//		}else if (val>=31&&val<=40) {
//			System.out.println("Best");
//		}else
//		{
//			System.out.println("All the best");
//		}
		
		
		switch(val)
		{
		case 18:
			System.out.println("good");
			break;
		
		case 20:
			System.out.println("better");
			break;
		case 33:
			System.out.println("Best");
			break;
			default:
				System.out.println("Enjoy!");
			
		}

	}

}
