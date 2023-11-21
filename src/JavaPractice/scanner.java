package JavaPractice;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Value 1: ");
//		int a=sc.nextInt();
//		System.out.println("Enter Value 2: ");
//		int b=sc.nextInt();
//		int c= a+b;
//		System.out.println("Total is:" + c);
		
		//Entered data is true or false
//		System.out.println("Enter the data:");
//		boolean data=sc.hasNextInt();
//		System.out.println(data);
		
		
		//Marks calculation program
		
		System.out.println("Enter the marks of English subject:");
		int eng=sc.nextInt();
		
		System.out.println("Enter the marks pf Math:");
		int math=sc.nextInt();
		
		System.out.println("Enter the marks of Science:");
		int sci=sc.nextInt();
		
		System.out.println("Enter the marks of History:");
		int his=sc.nextInt();
		
		System.out.println("Enter the marks of Physics");
		int phy=sc.nextInt();
		
		int total=eng+math+sci+his+phy;
		double per=(total/500.0)*100;
		
		System.out.println("Total marks:" + total);
		
		System.out.println("Percentage is : "+ per +"%");
		
		System.out.println("Congratulations!");
		
		
		
	}

}
