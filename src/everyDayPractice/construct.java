package everyDayPractice;

class myclass{
	
	private int id;
	private String name;
	
	
	public int getterid()
	{
		return id;
	}
	
	public  void setterid(int i)
	{
		this.id=i;
	}
	
	public String gettername()
	{
		return name;
	}
	
	public void Settername(String n)
	{
		this.name=n;			
	}
	
	myclass()
	{
		id=10;
		name="Can Divit";
	}

	myclass(int a, String b)
	{
		this.id=a;
		this.name=b;
	}
	
	}


public class construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//myclass m=new myclass();
		myclass m1=new myclass(8, "San");
		//m.setterid(5);
		System.out.println(m1.getterid());
		
		//m.Settername("lolly");
		System.out.println(m1.gettername());
	
		
		
		

	}

}
