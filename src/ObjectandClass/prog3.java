package ObjectandClass;

public class prog3 {
	int a;
	int b;
	
	public static int add(int p, int q)
	{
	int r=p+q;
	return r;
	
	}

	
	public static int multi(int x, int y)
	
	{
		int z;
		z=x*y;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog3 p=new prog3();
		System.out.println("Add: "+p.add(7, 8));
		System.out.println("multi: "+p.multi(2,2));

	}

}
