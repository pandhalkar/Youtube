package everyDayPractice;

class base{
	int x; int y;
	
	public void setx(int x)
	{
		this.x=x;
	}
	
	public int getx() {
		return x;
	}
	
	public void sety(int y)
	{
		this.y=y;
	}
	
	public int gety()
	{
		return y;
	}
}

class sub extends base{
	int a;
	
	public int  calculation(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
}


public class inheritanceprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub s1=new sub();
		int r=s1.calculation(6, 8);
		System.out.println("Addation: " + r);
		
		s1.setx(1);
		System.out.println(s1.getx());
		
		s1.sety(7);		
		System.out.println(s1.gety());
		
		
	

	}

}
