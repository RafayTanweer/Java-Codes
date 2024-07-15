public class Numbers
{
	public static void main(String[] args)
	{
		int alpha = 7;

	        for(int i = 1; i <= alpha; i++)
		{
		    System.out.print(i + " ");
		}
			
		for(int j = (alpha - 1); j >= 1; j--)
		{
		     System.out.print(j + " ");

		}
		
		System.out.println();
                int a = (alpha - 1);
		int LeftSpaces = 2;
		int b = (alpha - 1);
		int RightSpaces = 1;

		for (int k = 1; k <= (alpha-1); k++)
		{
		     for(int l = 1; l <= a; l++)
		     {
			if (l<a)
			{
			   System.out.print(l + " ");
			}
			else
			{
			   System.out.print(l);
			   for(int m = 1; m <= LeftSpaces; m++)
			   {
			        System.out.print(" ");
			   }
			}
			

		     }
		     a--;
		     LeftSpaces = LeftSpaces + 2;

		     for (int n = 1; n <= RightSpaces; n++)
		     {
			  System.out.print(" ");
		     }
		     RightSpaces = RightSpaces + 2;

		     for (int p = b; p >= 1; p--)
		     {
			  System.out.print(p + " ");

		     }

		     b--;
		     System.out.println();

		}
		     
		     

		




	}






}