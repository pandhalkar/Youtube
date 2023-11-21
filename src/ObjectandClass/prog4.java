package ObjectandClass;

public class prog4 {
	int age;
	String name;
	
	public void showdetails()
	{
		System.out.println(age + "  " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prog4 myprog=new prog4();
		myprog.age=24;
		myprog.name="Can";
		myprog.showdetails();

	}

}
