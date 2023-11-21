package everyDayPractice;


abstract class parent{
	parent()
	{
		System.out.println("I am constructor");
	}
	
	abstract void meth1();
	abstract void meth2();
	}

class child1 extends parent
{
	void meth1()
	{
		System.out.println("Hello meth1 from child1");
	}
	
	void meth2()
	{
		System.out.println("Hello meth2 from child 1");
	}
}

class child2 extends parent{
	@Override
	void meth1()
	{
		System.out.println("Hello meth1 from child 2");
		
	}
	@Override
	void meth2()
	{
		System.out.println("Hello meth2 from child 2");
		
	}
}
public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 ch1=new child1();
		ch1.meth2();
	}

}
