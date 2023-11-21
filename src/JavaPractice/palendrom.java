package JavaPractice;

public class palendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int temp=num;
		int x=0;
		
		

		for(int i=0; i<num;i++)
		{
			x=(x*10)+temp/10;
			temp=temp%10;
		}
		
		if(x==temp)
		{
			System.out.println("The numnber " + x + " is palendrom");
		}

		else
		{
			System.out.println("The numnber " + x + " is not palendrom");
		}
	}

}
