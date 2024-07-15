public class A2_Q2
{
	public static void main(String[] args)
	{
		int[] Array1 = new int[args.length];
		
		for(int i = 0; i < Array1.length; i++)
		{
			Array1[i] = Integer.parseInt(args[i]);
			System.out.print(Array1[i] + " ");
		}

		System.out.println();

		int smallest = 0;
		int temp = 0;

		for(int i = 0; i < Array1.length; i++)
		{
			smallest = i;

			for(int j = i + 1; j < Array1.length; j++)
			{
				if(Array1[smallest] > Array1[j])
					smallest = j;
			}

			temp = Array1[i];
			Array1[i] = Array1[smallest];
			Array1[smallest] = temp;

		}

		for(int i = 0; i < Array1.length; i++)
			System.out.print(Array1[i] + " ");

		double median = 0;
		int position = 0;

		if(Array1.length % 2 != 0)
		{
			position = Array1.length / 2;
			median = Array1[position];
		}
		else
		{
			position = Array1.length / 2;
			median = (Array1[position - 1] + Array1[position])/2.0;
		}

		System.out.println();
		System.out.println("The Median is: " + median);
			
			



		
			
			


		



	}


}