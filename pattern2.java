public class pattern2
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int Reset = 0;
		int space = (n-1);

		for (int i = 1; i <= n; i++)
                {
		     for (int j = 1; j <= space; j++)
                     {
			 System.out.print(" ");

		     }
                     space--;
                     Reset = n-i+1;
		     
		     for (int k = 1; k <= i; k++)
 		     {
			 System.out.print(Reset);
                         Reset++;
		 
                     }
		     
                     System.out.println();
		



                }





	}










}