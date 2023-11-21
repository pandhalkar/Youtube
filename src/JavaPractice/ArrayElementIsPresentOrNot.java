package JavaPractice;

public class ArrayElementIsPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num= {3,6,8,34,56,12,67,99};
		int single=67;
		boolean isnotound=false;
		
		for(int element:num)
		{
			if (single==element)
			{
				isnotound=true;
				break;
				
			}
		}
		
		if(isnotound)
		{
			System.out.println("number found: " + single);
		}
		
		else
		
			{
				System.out.println("number not found: " + single);
			}
		
	}

}
