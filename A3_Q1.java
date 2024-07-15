//Name : Rafay Tanweer
//ERP : 19734
public class A3_Q1
{
	public static void main(String[] args)
	{
		String Input = "";

		StdOut.println("Enter the sentence");

		Input = StdIn.readLine();
		
		
		PigLatin(Input);

	}

	public static String PigLatin(String Input)
	{
		String latin = "" , word = "";
		int n = -1;

		for(int i = 0; i < Input.length(); i++)
		{
			if (Input.charAt(i) == ' ')
			{
				for (int j = n + 2; j < i; j++)
					word = word + Input.charAt(j);
				word = word + Input.charAt(n + 1) + "ay";
				latin = latin + word + " ";
				word = "";
				n = i;								


			}

			
			if (i == Input.length() - 1)
			{
				for (int j = n + 2; j <= i; j++)
					word = word + Input.charAt(j);
				word = word + Input.charAt(n + 1) + "ay";
				latin = latin + word;

			}




		}

		StdOut.println(latin);
		return latin;




	}






}