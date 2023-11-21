package ObjectandClass;

public class prog2 {
	
	int a; int b;
	
	
	
	public int meth1(int x, int y)
	{
		this.a=x;
		this.b=y;
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prog2 p=new prog2();
		System.out.println(p.meth1(4, 7));
		
	}

}
