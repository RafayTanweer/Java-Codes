public class A2_Q3
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int GCD = 0;
		int i = 0;

		if(x < y) //Swapping values if x is lesser than y so that the condition of the algorithm can be met.
		{
			i = x;
			x = y;
			y = i;
		}

		while (GCD == 0)
		{

			if (x % y == 0)
				GCD = y;
			else
			{
				i = y;
				y = x % y;
				x = i;	
			}

		}

		System.out.println("The Greatest Common Divisor is: " + GCD); 
		



	}


}