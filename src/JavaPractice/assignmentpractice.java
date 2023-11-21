package JavaPractice;

class employee {
	int salary;
	String name;

	public int getsalary() {
		return salary;
	}

	public String getname() {

		return name;
	}

	public void SetName(String n)

	{
		name = n;
	}
}


class cellphone
{
	public void callfriend()
	{
		System.out.println("Calling");
	}
	
	public void ring()
	{
		System.out.println("Ring");
	}
	public void Vibrate()
	{
		System.out.println("Vibrate");
	}

}

public class assignmentpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee x=new employee();
		x.salary=12;
		x.name="Can";
		x.getname();
		x.SetName("Sanem");
		
		cellphone model=new cellphone();
		model.callfriend();
		model.ring();
		model.Vibrate();
		
	
		
		System.out.println("Salary:  " + x.getsalary());
		System.out.println("getName" + x.getname());
		
	}

}
