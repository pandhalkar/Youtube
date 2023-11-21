package JavaPractice;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Printing numbers:");
		
		Scanner sc=new Scanner (System.in);
		
		int ent=sc.nextInt();
		
		for( int i=0; i<=ent; i++)
		{
			System.out.println(i);
			
			if (i==3) {
				System.out.println("Hogaya 3");
				break;
			}
			
		}
		
		
		
	}

}
