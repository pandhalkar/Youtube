package JavaPractice;

public class changeValue {

	//case1:
	public static void val(int x)
	{
		x=30;
		
	}
	
	//case2:
	public int val2(int q)
	{
		q=40;
		return q;
	}
	
	public static void val3(int [] arr) 
	{
		arr[1]=90;
	}
	
	static void foo()
	{
		System.out.println("Hi");
	}
	static void foo(int a)
	{
		System.out.println("hello" + (a));
		
	}
	static void  foo(String name, int age)
	{
		System.out.println("Name: " + name + ", age: " + age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case1:
		int a=6;
		val(a);
		System.out.println(a);
		
		//case2:
		int w=9;
		changeValue value2=new changeValue();
		int r=value2.val2(w);
		System.out.println(r);
		
		//case 3:
		
		int [] marks= {20,30,40,50};
		val3(marks);
		System.out.println(marks[1]);
		
		
		foo();
		foo(300);
		foo("lolly", 25);
		
		
		
		
		
	}

}
