public class Armstrong
{
	public static void main(String[] args)
	{
              int n = Integer.parseInt(args[0]);
 	      int object = n;
	      int sum = 0;	
	      while ( n > 0)
              {		
			sum = sum + ((n%10)*(n%10)*(n%10));
                        n = n/10;
              }
     
	      if (sum == object)
	      {
	         System.out.println("Armstrong no.");
	      }
	      else
	      {
		  System.out.println("Not an Armstrong no.");
 	      }
     






	}













}