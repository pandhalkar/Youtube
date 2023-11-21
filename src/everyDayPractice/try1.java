package everyDayPractice;

interface c{
	public int sum(int a, int b );
}

class A2 implements c{
	int m; int n;
	
	A2(int m, int n)
	{
		this.m=m;
		this.n=n;		
	}
	public A2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int sum(int a, int b)
	{
		int q=a+b;
		return q;
	}
	
	public int multi()
	{
		return m*n;
	}
}

class B2{
	int x; int y;
	
	
	B2(int x, int y)
	
	{
	this.x=x;
	this.y=y;
	}
	
	}

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 H1=new A2();
		System.out.println(H1.sum(10, 23));
		
		B2 J1=new B2(9, 9);
		
		System.out.println(H1.multi());
	}

}
