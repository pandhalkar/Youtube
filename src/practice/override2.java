package practice;

class A1{
	public int a;
	public int harry()
	{
		return 4;
	}
	
	public void meth2()
	{
		System.out.println("I am method 2 of class A");
	}
}

class B1 extends A1{
	
	public void meth2()
	{
		System.out.println("I am method 2 of class B");
	}
	
	public void meth3()
	{
		System.out.println("I am method 3 of class B");
	}
	
}


public class override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 sam=new A1();
		sam.meth2();
		
		
		B1 can=new B1();
		can.meth2();
	

	}

}
