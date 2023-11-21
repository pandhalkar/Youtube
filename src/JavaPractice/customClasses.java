package JavaPractice;


	
	class emp
	{
		int id;
		String name;
	
		public void printdetauils()
		{
			System.out.println("my id is id: " + id);
			System.out.println("My name is: " + name);
		}
		
	}
	
public class customClasses
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp x=new emp();
		
	emp y=new emp();
	x.id=12;
	x.name="Can";
	y.id=13;
	y.name="Sanem";
	System.out.println(x.id);
	System.out.println(x.name);
	System.out.println(y.id);
	System.out.println(y.name);
	
	}

	}


