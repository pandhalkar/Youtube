package JavaPractice;



class circle{
	int area;
	int perimeter;
	
	public void setarea(int x)
	{
		this.area=x;
	}
	
	public int getarea()
	{
		return area;
	}
	
	public void setperimeter(int y)
	{
		this.perimeter=y;
	}
	
	public int getperimeter()
	{
		return perimeter;
	}
	
	
	
}
public class getterSetterassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.setarea(30);
		c.setperimeter(15);
		
		System.out.println(c.getarea());
		System.out.println(c.getperimeter());
		

	}

}
