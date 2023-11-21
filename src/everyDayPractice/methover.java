package everyDayPractice;


class A
{
	int x=5;
//	int meth1()
//	{
//		return 4;
//	}
//	
	public void meth1()
	{
		System.out.println("I am method meth1 of class A: " + x);
	}
	public void meth2()
	{
		System.out.println("I am method meth2 of class A: " + x);
	}
}

class B extends A
{
	int y=10;
	@Override
	public void meth2()
	{
		System.out.println("I am method meth2 of class B: " + x);
	}
	public void meth3()
	{
		System.out.println("I am method meth3 of class B: " + y);
	}
}
public class methover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.meth2();
		
		B b=new B();
		b.meth2();

	}

}
