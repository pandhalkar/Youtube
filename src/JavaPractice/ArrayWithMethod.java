package JavaPractice;

public class ArrayWithMethod {

	static void m_array(int []arry1)
	{
		arry1[2]=990;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int []new_array= {90,80,70,60};
	m_array(new_array);
	System.out.println("Array is: "+ new_array[2]);
	
		

	}

}
