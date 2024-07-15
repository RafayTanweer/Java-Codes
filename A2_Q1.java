public class A2_Q1
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int count = 0;
		boolean NotAPrime = true;

		for(int i = 2; i <= n; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j != 0)
					NotAPrime = false;

				else
				{
					NotAPrime = true;
					break;
				}

				
			}

			if(NotAPrime == false)
			{
				System.out.println(i);
				count++;
				NotAPrime = true;
			}
			
		}

		System.out.println("The no. of prime numbers are: " + count);

	}

}