package practice;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number 1:");
		Scanner sc=new Scanner(System.in);
		int dayNumber=sc.nextInt();
		
		System.out.println("Enter Number 2:");
		Scanner sc1=new Scanner(System.in);
		int dayNumber1=sc1.nextInt();
		
		int main1;
		
		System.out.println("Enter Number 3:");
		Scanner sc3=new Scanner(System.in);
		int ops=sc3.nextInt();
		
		switch(ops) {
		
		case 1:
		
		main1=dayNumber+dayNumber1;
		System.out.println("Addation" + main1);
		break;
		
		case 2:
			main1= dayNumber-dayNumber1;
			System.out.println("Subtraction" + main1);
			break;
			
			default:
				System.out.println("Hello");
		}
		
		
	}

}
