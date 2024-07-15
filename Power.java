public class Power
{
	public static void main(String[] args)
        {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
      		int power = a;

                for (int i = 1; i <= (b-1) ; i++)
		{
		    power = power * a;
                }

                System.out.println(power);
		






	}


}