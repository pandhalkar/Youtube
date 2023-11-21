package everyDayPractice;

class A1 {

	int a;
	int b;

	public void meth1() 
	{
		System.out.println("Startting meth 1");
	}
	
	public int meth1(int x, int y)
	{
		int c=x+y;
		return c;
	}

}

public class methodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		int z=a.meth1(33, 4);
		System.out.println(z);

	}

}
