package JavaPractice;

class newcylinder{
	private int redious;
	private int height;
	
	public newcylinder(int rr, int hh)
	{
		redious=9;
		height=8;
	}
	
	
	public int getradious()
	{
		return redious;
	}
	
	public void setradious(int r)
	{
		this.redious=r;
	}
	
	public int getheight()
	{
		return height;
	}
	
	public void setheight(int h)	
	{
		this.height=h;
	}
	
}

	public class cylinder {
	public static void main(String[] args) {
		newcylinder newcy=new newcylinder(44, 55);
//		newcy.setradious(15);
//		newcy.setheight(8);
		System.out.println(newcy.getheight());
		System.out.println(newcy.getradious());

	}

}
