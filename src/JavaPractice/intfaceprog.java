package JavaPractice;

public class intfaceprog {
	
	interface myinterface{
		void addation();//abstract + public
		void subtraction(); //abstract + public
	}
	
	class myclass implements myinterface{
		
		
		@Override
		public void addation() 
		{
		System.out.println("Program of addation");	
		}
		
		@Override
		public void subtraction()
		{
			System.out.println("Program of subtraction");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intfaceprog obj=new intfaceprog();
		myclass n= obj.new myclass();
		n.addation();
		n.subtraction();

	}

}
