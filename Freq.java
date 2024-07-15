public class Freq
{
	public static void main(String[] args)
	{
	      int n = Integer.parseInt(args[0]);
	      int zero = 0,one = 0,two = 0,three = 0,four = 0,five = 0,six = 0,seven = 0,eight = 0,nine = 0;
              
              if (n == 0)
	      {
 		 System.out.println("Zero = 1");
              }
	      else
	      {
                 while ( n > 0)
                 {
			if(n%10 == 0)
                                zero++;
                        if(n%10 == 1)
                                one++;     
                        if(n%10 == 2)
                                two++;     
                        if(n%10 == 3)
                                three++;     
                        if(n%10 == 4)
                                four++;     
                        if(n%10 == 5)
                                five++;     
                        if(n%10 == 6)
                                six++;
                        if(n%10 == 7)
                                seven++;     
                        if(n%10 == 8)
                                eight++;     
                        if(n%10 == 9)
                                nine++;
                        n = n/10;
                 }     
     
                 System.out.println(" zero = " + zero + " " + " one = " + one + " " + " two = " + two + " " + " three = " + three + " " + " four = " + four + " " + " five = " + five + " " + " six = " + six + " " + " seven = " + seven + " " + " eight = " + eight + " " + " nine = " + nine + " "); 

	      }
 	     
	    







	}









}