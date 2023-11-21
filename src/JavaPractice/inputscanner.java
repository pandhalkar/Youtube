package JavaPractice;

import java.util.Scanner;

public class inputscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
////		System.out.println("Enter values1");
//		
//		int a=sc.nextInt();
//		
//		System.out.println("Enter value 2");
//		int b=sc.nextInt();
//		
//		int sum=a+b;
//		System.out.println("Totalis :" + sum);
//		
//		System.out.println("Enter float value");
//		float f1=sc.nextFloat();
		
//		System.out.println("Enter string");
//		String st=sc.nextLine();
//		System.out.println(st);
		
//		System.out.println("enter value:");
//System.out.println(sc.hasNextInt());		
		
		System.out.println("CBSC Examination");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks of subject 1:");
		float m1=sc.nextFloat();
		System.out.print("Enter Makrs of Subject 2:");
		float m2=sc.nextFloat();
		System.out.print("Enter Marks of Subject 3:");
		float m3=sc.nextFloat();
		System.out.print("Enter marks of Subject 4:");
		float m4=sc.nextFloat();
		System.out.print("Enter Marks of Subject 5:");
		float m5=sc.nextFloat();
		float total =m1+m2+m3+m4+m5;
		System.out.println(total);
		float per=total*100/500;
		System.out.println(per);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
