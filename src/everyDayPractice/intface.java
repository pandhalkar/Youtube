package everyDayPractice;
interface c1{
	
	int addation(int a, int b);
	void subtraction();
}

public class intface implements c1{
	
	@Override
	public int addation(int x, int y)
	{
		int z=x+y;
		return z;		
	}
	
	@Override
	public void subtraction()
	{
		System.out.println("Here is the subtraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intface in=new intface();
		System.out.println(in.addation(3,6));
		in.subtraction();	

	}

}
