package practice;

import java.util.Scanner;

public class evenorOdd {

	public static void main(String[] args) {
		// Even Or Odd

		System.out.print("Enter value:");

		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();

		if (val1 % 2 == 0) {
			System.out.println("The given number " + val1  + " is Even");
		} else {
			System.out.println("The given number " + val1 + " is Odd");
		}

	}

}
