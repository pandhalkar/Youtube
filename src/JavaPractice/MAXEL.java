package JavaPractice;

public class MAXEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num= {19,2,37,41,55};
		int max=num[1];
		for(int element:num)
		{
			if(element<max)
			{
				max=element;
			}
		}
		System.out.println("Maximum value in an array is: " + max );

	}

}
