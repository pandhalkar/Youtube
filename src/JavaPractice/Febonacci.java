package JavaPractice;

public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int first=0;
		int second=1;
		System.out.println("Febonacchi series: ");
		for(int i=0; i<=num; i++)
		{
			System.out.print(first + "  ");
			int next=first+second;
			first=second;
			second=next;
			
		}

	}

}
