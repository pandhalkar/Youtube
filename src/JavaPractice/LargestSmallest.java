package JavaPractice;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {2,5,1,7,4,99};
		int min=num[0];
		for(int i=0;i<15;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Min value="+ min);
		
		
	}

}
