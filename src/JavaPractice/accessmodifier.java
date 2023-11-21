package JavaPractice;


class myEmployee{
	private int id;
	private String name;
	
	
	
	public void setname(String n)
	{
		name=n;
	}
	
	public String  getname()
	{
		return  name;
	}
	
	
	public void setid(int i)
	{
		this.id=i;
		
	}
	
	public int getid()
	{
		return id;
	}
}



public class accessmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myEmployee n=new myEmployee();
		n.setid(20);
		n.setname("Helloooo");
		System.out.println(n.getid());
		System.out.println(n.getname());
		

	}

}
