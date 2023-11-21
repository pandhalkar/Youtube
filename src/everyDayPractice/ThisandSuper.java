package everyDayPractice;

class old{
	int x;
	
	old(int x)
	{
		this.x=x;
	}
	
	public int getx()
	{
		return x;
	}
	
	public void setx(int x)
	{
		this.x=x;
	}
}

class new1 extends old{
	
	
	new1(int c)
	
	{
		super(c);
		System.out.println("I am new constructor" );
	}
}


public class ThisandSuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		old p=new old(3);
		//p.setx(8);
		System.out.println(p.getx());
		new1 n=new new1(2);
		
		System.out.println(n.getx());
		
	}

}
