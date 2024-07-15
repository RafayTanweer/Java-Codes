public class SumRec
{
	public static void main(String[] args)
	{
		StdOut.println("Enter an integer: ");

		int n = StdIn.readInt();
		
		int total = 0;

		StdOut.println("The sum upto " + n + " is " + Sum(n , total));
		

	}

	public static int Sum(int n, int total)
	{
		if (n < 1)
		{
			return total;
		}
		else
		{
			total = total + n;
			return Sum(n-1 , total);
		}



	}




}