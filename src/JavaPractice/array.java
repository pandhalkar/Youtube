package JavaPractice;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {19,2,37,41,55};
		float sum=0;
		float avg=0;

		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
			sum=sum+num[i];
		}
		
		System.out.println(sum);
		avg=sum/num.length;
		System.out.println("Average: "+ avg);
		
		
		//Array by using for each loop
		System.out.println("Easy way");
		for( int element: num)
		{
			System.out.println(element);
		}
	}

}
