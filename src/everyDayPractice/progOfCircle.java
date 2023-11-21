package everyDayPractice;


class circle{
	private int radious;
	private int area;
	private int perimeter;
	
	 int getradious()
	{
		if(radious>=10)
		{
			System.out.println("Correct radious");
		}
		else
		{
			System.out.println("Invalid input radious");
		}
		
		return radious;
	}
	
	void  set_radious(int r1)
	{
		this.radious=r1;
	}
	
	
	int getarea()
	{
		if(area>5)
		{
			System.out.println("Correct area");
		}
		else
		{
			System.out.println("Invalid area");
		}
		 return area;
	}
	
	void setarea(int a1)
	{
		this.area=a1;
	}
	
	
	
	int getperimeter()
	{
		if (perimeter>5)
		{
			System.out.println("Correct perimeter");
		}
		else
		{
			System.out.println("Invalid Perimeter");
		}
		
		return perimeter;
	}
	
	void setperimeter(int p1)
	{
		this.perimeter=p1;
	}
	
	
}
public class progOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle();
		c1.set_radious(2);
		System.out.println(c1.getradious());
		
		c1.setarea(6);
		System.out.println(c1.getarea());
		
		c1.setperimeter(4);
		System.out.println(c1.getperimeter());
		
		
		

	}

}
