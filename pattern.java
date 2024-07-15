public class pattern
{
	public static void main(String[] args)
        {
		int n = Integer.parseInt(args[0]);
		int Reset = 0;
		
		for (int i = 1; i <= n; i++)
		{
		    Reset = n;
		    for (int j = 1; j <= i; j++)
                    {
			System.out.print(Reset + " ");
			Reset--;
                    }
		    System.out.println();
                
                }	






        }










}