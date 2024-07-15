public class Check
{
	public static void main(String[] args)
	{
		int[] c = new int[args.length];

		for (int i = 0; i < args.length; i++)
			c[i] = Integer.parseInt(args[i]);
			

		int smallest = 0;
		int temp = 0;
	
		for (int i = 0; i < c.length; i++)
		{
			smallest = i;
			for (int j = i + 1; j < c.length; j++)
			{
				if ( c[smallest] > c[j] )
					smallest = j; 

			}

			temp = c[i];
			c[i] = c[smallest];
			c[smallest] = temp;

			
		}

		for (int i = 0; i < c.length; i++)
			StdOut.print(c[i] + " ");

		StdOut.println();


		int count = 0;
		String Recurring = "", NonRecurring = "";

		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				if ( c[i] == c[j] )
					count++;
			}

			if (count > 1)
			{
				Recurring = Recurring + c[i];
				i = i + (count-1);
			}
			else
				NonRecurring = NonRecurring + c[i];

			count = 0;



		}

		StdOut.println(Recurring);
		StdOut.println(NonRecurring);

		int[] d = new int[(Recurring.length()) + (NonRecurring.length())];

		for (int i = 0; i < Recurring.length(); i++)
			d[i] = Character.getNumericValue(Recurring.charAt(i));

		int count2 = 0;

		for (int i = Recurring.length(); i < NonRecurring.length(); i++)
		{
			d[i] = Character.getNumericValue(NonRecurring.charAt(count2));
			count2++;
		}

		for (int i = 0; i < d.length; i++)
			StdOut.print(d[i] + " ");

		
	}



}