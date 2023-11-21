package JavaPractice;


class firstClass
{
	int x;
	firstClass(int y)
	{
		this.x=y;
		System.out.println("First class: " + x);
	}
	
}

class secondclass extends firstClass
{
	secondclass(int y)
	{
		super(y);
		System.out.println("This is second class");
	}
}
public class superandthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstClass f=new firstClass(3);
		secondclass c=new secondclass(6);

	}

}
