package practice;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1=20;
		int val2=90;
		int val3=40;
		
		if ((val1 > val2) && (val1 > val3)) 
		{
			System.out.println("Val1 is greater: "+ val1);
		}
		else if((val2>val1)&&(val2>val3))
		{
			System.out.println("Val2 is greater: "+ val2);
		}
		else
		{
			System.out.println("Val3 is greater: "+ val3);
		}
		

	}

}
