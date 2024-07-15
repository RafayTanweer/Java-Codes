public class common 
{
	public static void main(String[] args)
	{

		// Extracting the elements of the args array to form two diff arrays

		int a = args.length;
		int n = 0, m = 0;

		for (int i = 0; i<=(a-1); i++)
		{
			if (i == 0)
				n = Integer.parseInt(args[i]);
			if(i == (n+1))
				m = Integer.parseInt(args[i]);

		}

		int[] set1 = new int[n];
		int[] set2 = new int[m];
		int counter1 = 0, counter2 = 0;

		for (int j = 1; j<=n; j++)
		{
			set1[counter1] = Integer.parseInt(args[j]);
			counter1++;

		}

		for (int k = (n + 2); k<=(a-1); k++)
		{
			set2[counter2] = Integer.parseInt(args[k]);
			counter2++;

		}
		
		for (int l = 0; l<=(n-1); l++)
			System.out.println(set1[l]);
		System.out.println();
		for(int p = 0; p<=(m-1); p++)
			System.out.println(set2[p]);







	}








}