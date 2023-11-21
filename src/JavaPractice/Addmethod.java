package JavaPractice;

public class Addmethod {
	
	
	Addmethod	()
	{
		return ;
	}
	
	public  int addation(int a, int b)
	{
		int c= a+b;
		return c;
	}

	public static void showMSG()
	{
		System.out.println("Not forget!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=6;
		int y=9;
		Addmethod add=new Addmethod();
		int z=add.addation(4, 6);
		
		System.out.println("Sum:" + z);
		showMSG();
		
	}

}
