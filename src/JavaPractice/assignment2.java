package JavaPractice;

public class assignment2 {

	public static void main(String[] args) {
		/* Write a java program to compute the average value of an array 
		of integers except the largest and smallest value*/
		int [] arr = {1, 2, 3, 4, 5, 6};
		int min = arr[0];
		int max = arr[0];
		int sum = 0; 

		float avg;

		System.out.print("Elements of an array are: ");
		for (int element : arr) {
		    System.out.print(element + " ");
		}

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] < min) {
		        min = arr[i];
		    }

		    if (arr[i] > max) {
		        max = arr[i];
		    }

		    sum =sum+ arr[i]; // Calculating the sum of all elements
		    
		}

		sum =sum- (min + max); // Subtract min and max from the sum

		System.out.println("\nMin value: " + min);
		System.out.println("Max value: " + max);
		System.out.println("Sum of the remaining elements: " + sum);

		avg = (float) sum / (arr.length - 2); // Calculate the average of the remaining elements
		System.out.println("Average is: " + avg);

	}
}
