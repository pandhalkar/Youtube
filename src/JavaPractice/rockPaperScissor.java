package JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 0=rock
		 * 1=paper
		 * 2=Scissor
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Rock, Paper, Scissor Game");
		int userinput =sc.nextInt();
		
		Random random=new Random();
		int inputRandom=random.nextInt(3);
		
		if (userinput==inputRandom)
		{
			System.out.println("Match Draw!");
		}
		
		else if 
		(userinput==0 && inputRandom==2||
		userinput==1 && inputRandom==0||
		userinput==2 && inputRandom==1)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Computer win!");
		}
		
		//System.out.println("Computer choise was: " + inputRandom);
		
		if (inputRandom==0)
		{
			System.out.println("Computer choise was:  Rock");
		}
		else if(inputRandom==1)
		{
			System.out.println("Computer coise was : Paper");
		}
		else if(inputRandom==2)
		{
		System.out.println("Computer choise was Scisser");
		}
		

		}

		}