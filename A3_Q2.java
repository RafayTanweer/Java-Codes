//Name : Rafay Tanweer
//ERP : 19734
public class A3_Q2
{
	public static void main(String[] args)
	{

		StdOut.println("Enter the string");
		
		String Input = StdIn.readLine();

		StdOut.println(Duplicate(Input));



	}

	public static String Duplicate(String Input)
	{
		String Unique = "";
		int count = 0;

		for (int i = 0; i < Input.length(); i++)
		{
			for (int j = i + 1; j < Input.length(); j++)
			{
				if (Input.charAt(i) == Input.charAt(j))
					count++;
				else
					break;

			}
		
			Unique = Unique + Input.charAt(i);
			i = i + count;
			count = 0;
			

		}

		return Unique;



	}




}