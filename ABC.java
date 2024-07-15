public class ABC
{
	public static void main(String[] args)
	{
		int alpha = 71;

	        for(int i = 65; i <= alpha; i++)
		{
		    System.out.print((char)i + " ");
		}
			
		for(int j = (alpha - 1); j >= 65; j--)
		{
		     System.out.print((char)j + " ");

		}
		
		System.out.println();
                int a = (alpha - 1);
		int LeftSpaces = 2;
		int b = (alpha - 1);
		int RightSpaces = 1;

		for (int k = 1; k <= 6; k++)
		{
		     for(int l = 65; l <= a; l++)
		     {
			if (l<a)
			{
			   System.out.print((char)l + " ");
			}
			else
			{
			   System.out.print((char)l);
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

		     for (int p = b; p >= 65; p--)
		     {
			  System.out.print((char)p + " ");

		     }

		     b--;
		     System.out.println();

		}
		     
		     

		




	}






}