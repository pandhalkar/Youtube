package JavaPractice;

public class moverloading {
	
	public static void calculation(int [] arr)
	{
		arr[0]=99;
	}
	
	public static void foo()
	{
		System.out.println("Hello bro");
	}
	
	public static void foo(int a)
	{
		System.out.println("Hi " + a);
	}

	public static void main(String[] args) {
		int [] marks= {22,33,44,55,66};
		calculation(marks);
		System.out.println(marks[0]);
		foo();
		foo(300);
		
		

	}

}
