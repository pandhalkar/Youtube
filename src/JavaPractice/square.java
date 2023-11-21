package JavaPractice;


class s1
{
	int side;
	
	public int area()
	{
		return side*side;
	}
	
	public int perimeter()
	{
		return 4*side;
	}
	
}


public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 f=new s1();
		f.side=3;
		System.out.println(f.area());
		System.out.println(f.perimeter());

	}

}
