package everyDayPractice;

public class classObject_Prog1 {

	class Today_First_Prog
	{
		String name;
		int id;
		
		public void showDetails()
		{
			System.out.println("My name is: " + name);
			System.out.println("My id is: "+ id);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classObject_Prog1 p1=new classObject_Prog1();
		Today_First_Prog prog= p1.new Today_First_Prog();
		prog.name="Can Divit";
		prog.id=1;
		prog.showDetails();
		
		
		

	}

}
