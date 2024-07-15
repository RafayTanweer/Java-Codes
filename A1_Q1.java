public class A1_Q1
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double discriminant = 0.0;

		if (a == 0.0)
		{
			System.out.println(" Not a Quadratic function");
		}
		else
		{
			discriminant = (b*b)-(4*a*c);

			if(discriminant < 0.0)
				System.out.println("Imaginary Roots");
			if(discriminant == 0.0)
				System.out.println(-b/2*a);
			if(discriminant > 0.0)
			{
				System.out.println((-b + Math.sqrt(discriminant))/(2*a));
				System.out.println((-b - Math.sqrt(discriminant))/(2*a));
			}

		}
				  
				
			


	}


}