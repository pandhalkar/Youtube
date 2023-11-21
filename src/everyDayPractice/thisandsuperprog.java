package everyDayPractice;


class useOfThis{
	
	int x;
	  useOfThis(int y)
	 {
	x=y;
	 }
	 public int getthis()
	 {
		 return x;
 	 }

	 public void setthis(int x) 
	 {
		this.x=x; 
	 }
	 
}

class second extends useOfThis{
	
	
	second(int c)
	{
		super(c);
		System.out.println("I ma a constructor");
		
	}

	}

public class thisandsuperprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useOfThis usethis=new useOfThis(9);
		usethis.setthis(3);
		System.out.println(usethis.getthis());
		second s=new second(7);
		
		
	}

}
