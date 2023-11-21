package JavaPractice;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,5,7,9,23,43,12,45,34,87,90};
		int search=100;
		boolean isfound=false;
		
		for(int i=0; i<arr.length;i++)
		{
			if(search==arr[i])
			{
				System.out.println("Number found: " + arr[i]);
				isfound=true;
				break;
			}
		}

		if(!isfound)
		{
			System.out.println(search + " Not found");
		}
	}

}
