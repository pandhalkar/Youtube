package JavaPractice;



class adhoc{
	int age;
	String name;
	int sal;
	
	public void showdetails()
	{
		System.out.println("my age is :" + age);
		  System.out.println("my name is: " + name);
		  //System.out.println("my sal is : " + sal);
	}
	public int getsalary()
	{
		return sal;
		
	}
	

	
}


public class customclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  adhoc a=new adhoc();
  a.age=15;
  a.name="san";
  a.sal=12000;
  System.out.println("salary is: " + a.getsalary());

a.showdetails();
a.getsalary();
  
  
  
  
	}

}
