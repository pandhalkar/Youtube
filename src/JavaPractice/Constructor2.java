package JavaPractice;

class myconstructor
{
	private int height;
	private int radious;
	
	public myconstructor()
	{
		height=6;
		radious=1;
	}
	
	
	public myconstructor(int radious , int height)
	{
		this.radious=radious;
		this.height=height;
	}
	
	
	public int getheight()
	{
		return height;
	}
	
	public void  setheight(int new_height)
	{
		this.height=new_height;
	}
	
	public int getradious()
	
	{
		return radious;
	}
	
	public void setradious(int new_radious)
	{
		this.radious=new_radious;
	}
	
}


public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myconstructor myc=new myconstructor(5,5);
		//myc.setheight(12);
		System.out.println("Printed height: "+myc.getheight());
		
		//myc.setradious(19);
		System.out.println("Printed radious: " + myc.getradious());
		
		
		
		

	}

}
