package JavaPractice;

public class functionMethods {

	public int logic(int val1, int val2) {
		int total;
		total = val1 + val2;
		return total;

	}

	public static void change(int[] arr) {
		arr[2] = 799;
	}

	public static void name() {
		System.out.println("Hello World!");
	}

	public static void name(int a) {
		System.out.println("new val:" + a);
	}

	public static void name(int x, int y)
	{
		System.out.println("new val:" + x + " " + y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c;
		functionMethods cs = new functionMethods();
		cs.logic(a, b);
		// c=logic(a,b);
		// System.out.println("Total is: " + cs);

		// change element from the array

		int[] myarr = { 50, 60, 70, 80 };
		change(myarr);

		for (int element : myarr) {
			System.out.println(element);
		}

		name();
		name(5000);
		name(2, 3);

	}

}
