public class truPyramid
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int space = (2*n)-1;
		
		for (int i = 1; i<=n; i++)
		{
		    for (int j = 1; j<=space; j++)
		    {
			System.out.print(" ");

		    }

 		    space = space - 2;

		    for (int k = 1; k<=i; k++)
		    {
			if (i<=9)
			{
			   System.out.print("0"+ i + "  ");
			}
			else
			{	 
			    System.out.print(i + "  ");
			}
			    
		    }
		    
		    System.out.println(); 	


		}
		





	}








}
