public class A1_Q2
{
	public static void main(String[] args)
	{
		int RPS = Integer.parseInt(args[0]);
		int ComputedRPS = (int)(Math.random() * 3);

		if(RPS == 0 || RPS == 1 || RPS == 2)
		{
			
			if( RPS == 0 && ComputedRPS == 0)
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			if( RPS == 0 && ComputedRPS == 1)
				System.out.println("The computer is paper. You are rock. You lose.");
			if( RPS == 0 && ComputedRPS == 2)
				System.out.println("The computer is scissor. You are rock. You win.");

		
			if( RPS == 1 && ComputedRPS == 0)
				System.out.println("The computer is rock. You are paper. You win.");
			if( RPS == 1 && ComputedRPS == 1)
				System.out.println("The computer is paper. You are paper too. It is a draw.");
			if( RPS == 1 && ComputedRPS == 2)
				System.out.println("The computer is scissor. You are paper. You lose.");

		
			if( RPS == 2 && ComputedRPS == 0)
				System.out.println("The computer is rock. You are scissor. You lose.");
			if( RPS == 2 && ComputedRPS == 1)
				System.out.println("The computer is paper. You are scissor. You win.");
			if( RPS == 2 && ComputedRPS == 2)
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");

		}
	
		else
			System.out.println("Please enter 0,1 or 2.");

		

		
		




	}





}