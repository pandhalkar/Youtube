package JavaPractice;

public class overriding {
	
	
	static void foo()
	{
		System.out.println("Good Morning Bro!");
	}
	
	static void foo(int a, int b) {
		System.out.println("Good Morning "+ "Have a great Day!"+  a  +  b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo();
		foo(200,300);
	}

}
