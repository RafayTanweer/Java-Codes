public class pyramid
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int space = (n-1);

		for (int i = 1; i <= n; i++)
                {
		     for (int j = 1; j <= space; j++)
                     {
			 System.out.print(" ");

		     }
                     space--;
	
		     for (int k = 1; k <= i; k++)
 		     {
			 System.out.print(i + " ");
		 
                     }
		     
                     System.out.println();
		



                }





	}










}