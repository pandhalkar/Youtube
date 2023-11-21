package JavaPractice;

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarray= {5,89,1,56,448,234};
		int large=myarray[2];
		
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i]>large)
			{
				large=myarray[i];
			}
		}
		System.out.println("Larget element in the array is : "+ large);

	}

}
