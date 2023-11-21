package JavaPractice;

import java.util.Scanner;

public class websiteSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter website name:");
		Scanner sc=new Scanner(System.in);
		String website=sc.next();
		
		
		if (website.endsWith(".org"))
		{
			System.out.println("Organizational website");
			
		} else if (website.endsWith(".com"))
		{
			System.out.println("Commercial website");
		}
		else if(website.endsWith(".in"))
		{
			System.out.println("Indian Website");
		}

	}

}
