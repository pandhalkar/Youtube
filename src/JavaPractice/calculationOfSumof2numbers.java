package JavaPractice;

public class calculationOfSumof2numbers {
	
	public  int meth1 (int x, int y)
	{
		int result=x+y;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculationOfSumof2numbers c=new calculationOfSumof2numbers();
		int sum=c.meth1(3, 4);
		System.out.println("Sum:" + sum);
		
		

	}

}
