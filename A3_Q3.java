//Name : Rafay Tanweer
//ERP : 19734
public class A3_Q3
{
	public static void main(String[] args)
	{
		StdOut.println("Enter the string: ");
			
		String str = "";
		int ascii = StdIn.readChar();
		
		while (ascii != 13 && ascii != 10)
		{

		 	str = str + (char) ascii;
			ascii = StdIn.readChar();

		} 


		String InputString = "";
		char InputChar;

		StdOut.println("A) Count the number of vowels in the string");
		StdOut.println("B) Count the number of consonents in the string");
		StdOut.println("C) Convert the string to upper case");
		StdOut.println("D) Convert the string to lower case");
		StdOut.println("E) Display the current string");
		StdOut.println("F) Enter another string");
		StdOut.println();
		StdOut.println("M) Display this menu");
		StdOut.println("X) Exit the program");
		StdOut.println();
		StdOut.println("Enter the menu choice");

		InputString = StdIn.readString();
		InputChar = InputString.charAt(0);
		

		while ( InputChar != 'X' && InputChar != 'x' )
		{
			
			if (InputChar == 'A' || InputChar == 'a')
				StdOut.println(Vowels(str));
			if (InputChar == 'B' || InputChar == 'b')
				StdOut.println(Consonents(str));
			if (InputChar == 'C' || InputChar == 'c')
				str = UpperCase(str);
			if (InputChar == 'D' || InputChar == 'd')
				str = LowerCase(str);
			if (InputChar == 'E' || InputChar == 'e')
				StdOut.println(str);
			if (InputChar == 'F' || InputChar == 'f')
			{
				str = "";

				StdOut.println("Enter the new string");

				ascii = StdIn.readChar();
	
				if (ascii == 13)
				{
					ascii = StdIn.readChar();
					if (ascii == 10)
					{
						ascii = StdIn.readChar();
						while (ascii != 13 && ascii != 10)
						{
							str = str + (char) ascii;
							ascii = StdIn.readChar();
						}
						
					}
					


				}
			
				
				
				
			}
			if (InputChar == 'M' || InputChar == 'm')
			{
				StdOut.println("A) Count the number of vowels in the string");
				StdOut.println("B) Count the number of consonents in the string");
				StdOut.println("C) Convert the string to upper case");
				StdOut.println("D) Convert the string to lower case");
				StdOut.println("E) Display the current string");
				StdOut.println("F) Enter another string");
				StdOut.println();
				StdOut.println("M) Display this menu");
				StdOut.println("X) Exit the program");
				StdOut.println();
			}

			
			StdOut.println("Enter the menu choice");
			
			InputString = StdIn.readString();
			InputChar = InputString.charAt(0);



		}

		StdOut.println("The current string is shown below. Thank you for using the menu.");
		StdOut.println(str); 



	}


	public static int Vowels (String str)
	{
		int count = 0;
		str = UpperCase(str);
		

		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' )
				count++;
		}

		return count;

	}

	public static int Consonents (String str)
	{
		int count = 0;
		str = UpperCase(str);

		
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U' && str.charAt(i) != ' ' )
				count++;

		}

		return count;	




	}

	public static String UpperCase (String str)
	{
		String upper = "";
		int CharAscii = 0;

		for (int i = 0; i < str.length(); i++)
		{
			CharAscii = (int) str.charAt(i);

			if (CharAscii >= 65 && CharAscii <= 90)
				upper = upper + str.charAt(i);
			else
			{
				if (CharAscii >= 97 && CharAscii <= 122)
				{
					CharAscii = CharAscii - 32;
					upper = upper + (char) CharAscii;
				}
				else
					upper = upper + str.charAt(i);
			}
				
			 

		}

		return upper;
				

	}

	public static String LowerCase (String str)
	{
		
		String lower = "";
		int CharAscii = 0;

		for (int i = 0; i < str.length(); i++)
		{
			CharAscii = (int) str.charAt(i);

			if (CharAscii >= 65 && CharAscii <= 90)
			{
				CharAscii = CharAscii + 32;
				lower = lower + (char) CharAscii;
			}
			else
				lower = lower + str.charAt(i);
				
			 

		}

		return lower;		



	}

	





}