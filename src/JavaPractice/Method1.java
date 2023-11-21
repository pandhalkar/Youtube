package JavaPractice;

import java.util.Scanner;

public class Method1 {

	 static int logic(int a, int b) {
		if(a>b)
		{
			System.out.println("Hello");;
		}
		
		else {
			System.out.println("Hi");
			}
		return a+b;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Value: ");
		int x=sc.nextInt();
		System.out.print("Enter Second Value: ");
		int y=sc.nextInt();
		int z;
		z=logic(x,y);
	}

}
