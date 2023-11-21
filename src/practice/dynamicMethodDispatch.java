package practice;

class phone{
	public void game()
	{
		System.out.println("Playing game");
	}
	
	public void showTime()
	{
		System.out.println("Showing Time");
	}
}

class smartPhone extends phone{
	public void music()
	{
		System.out.println("Playing Music");
	}
	public void showTime()
	{
		System.out.println("time goes on");
	}
}

public class dynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p=new smartPhone();
		p.game();
		p.showTime();
		
	
	
		

	}

}
