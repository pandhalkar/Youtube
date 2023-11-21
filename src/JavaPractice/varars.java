package JavaPractice;

public class varars {
	
	public static int calc(int ...arr)
	{
		int result=0;
		for(int element:arr)
		{
			result=result+element;
		}
		return result;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("calculation of values: "+ calc(1,5,6));
		

	}

}
