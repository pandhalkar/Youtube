package JavaPractice;

public class varargs {

	public static  int value(int x, int... arr)
	{

		int result=x;
		for(int element:arr)
		{
			result=result+element;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of numbers "+ value(3,5,9));
	}

}
