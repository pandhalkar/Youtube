package JavaPractice;

public class fFloatandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prblm 5 flots and sum:
		
		float [] val=new float[5];
		val[0]=2.23f;
		val[1]=3.234f;
		val[2]=4.34f;
		val[3]=5.34f;
		val[4]=6.34f;
		
		float sum=0;
		
		
		for(float element:val) {	
			
			sum=sum+element;
		}
		System.out.println(sum);
		
		
		//prblm 2 Value is present or not
		
		int marks[]= {50,60,70,80,90};
		
		int val2=72;
		boolean IsInarray=false;
		
			for(int element:marks)
		{
		 if (val2==element)	
		 {
			 IsInarray=true;
			 break;
		 }
		}
			
			if (IsInarray)
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		

			//Average marks of the subject
			
			int smarks[]= {50,40,70,60,68};
			float total=0;
			for(int element:smarks)
			{
				total=total+element;
			}
			
			total=total/smarks.length;
			System.out.println("Average marks:"+ total);
			
			
			//print 2 d array
			
			int [] [] mat1= { {1,2,3}, {4,5,6}};
			int [] [] mat2= {{6,7,8},{3,4,5}};
			
		int [] [] result= {{0,0,0},{0,0,0}};
		
		
		for(int i=0;i<mat1.length; i++)
		{
			for (int j=0;j<mat1[i].length;j++)
			{
				result[i][j]=mat1[i][j]+mat2[i][j];
				
				System.out.println(result[i][j]);
			}
			
		}
		
				
		
		
	}

}
