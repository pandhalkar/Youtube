package ObjectandClass;

public class Prog1 {
	
	static int a; static int b;
	
	public  static void meth1()
	{
		int z=a+b;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog1 p=new Prog1();
		p.meth1();
		
		meth1();
// non static variable can not access in the main method. User have to create an object for it
// if the method is static, no need to create an object.
	}

}
