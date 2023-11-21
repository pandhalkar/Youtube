package JavaPractice;


class happen{
	 private int id;
	private String name;
	
	
	public happen()
	{
		id=20;
		name="Can";
	}
	
	public happen(int q)
	{
		id=90;
		name="Can";
	}
	
	public happen (String myname)
	{
	
		name=myname;
	}
	
	public happen(int w, String k) 
	{
		id=w;
		name=k;
		
	}
	
	public int gethappen()
	{
		return id;
	}
	

	
	public String getname()
	{
		return name;
	}
	

	
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		happen h=new happen(47, "Can Divit");
		
		System.out.println(h.gethappen());
		System.out.println(h.getname());
		
		

	}

}
