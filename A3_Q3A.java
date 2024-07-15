// NAME = Ali Muhammad
// ERP = 18585
public class A3_Q3A{
	public static void main(String[] args){
		StdOut.print("Enter a string to be processed : ");
		String s = StdIn.readAll();
	
		char ans;
		do {
		System.out.println("A) Count the number of vowels in the string");
		System.out.println("B) Count the number of consonants in the string");
		System.out.println("C) Convert the string to uppercase");
		System.out.println("D) Convert the string to lowercase");
		System.out.println("E) Display the current string");
		System.out.println("F) Enter another string");
		System.out.println("M) Display this menu");
		System.out.println("X) Exit the program");
		StdOut.print("Enter menu choice : ");
		ans = StdIn.readChar();
	        }while ( ans == 'M' || ans == 'm');

		do{
		
			if(ans == 'A' || ans == 'a')
			        First(s);
			if(ans == 'B' || ans == 'b')
				Second(s);
			if(ans == 'C' || ans == 'c')
				s = Third(s);			
			if( ans == 'D' || ans == 'd')
				s = Fourth(s);
			if(ans == 'E' || ans == 'e')
				System.out.println(s);
			if(ans == 'F' || ans == 'f')
			{
				s = input();
			}
			StdOut.print("Enter menu choice : ");
		        ans = StdIn.readChar();			
			
				
		}while ( ans != 'X' || ans != 'x');
		

	}
	public static String input()
	{
		System.out.println("Enter another String : ");		
				String s = StdIn.readLine();		
				s = StdIn.readLine();
		return s;
	}
	public static void First(String input)
	{
		int c = 0;
		for(int i = 0; i < input.length(); i++)
		{
			switch(input.charAt(i))
			{
				case 'a':
					
				case 'e':
					
				case 'i':
					
				case 'o':
					
				case 'u':
					
				case 'A':
					
				case 'E':
					
				case 'I':
					
				case 'O':
					
				case 'U':
					c++;
					break;

			}
		}
		System.out.println(c);
	}
	public static void Second(String input)
	{
		int c = 0;
		
		for(int i = 0; i < input.length(); i++)
		{
			switch(input.charAt(i))
			{
				case 'b':
					
				case 'c':
					
				case 'd':
					
				case 'f':
					
				case 'g':
					
				case 'h':
					
				case 'j':
					
				case 'k':
					
				case 'l':
					
				case 'm':
					
				case 'n':
					
				case 'p':
					
				case 'q':
					
				case 'r':
					
				case 's':
					
				case 't':
					
				case 'v':
					
				case 'w':
					
				case 'x':
					
				case 'y':
					
				case 'z':
				
                                case 'B':
					
				case 'C':
					
				case 'D':
					
				case 'F':
					
				case 'G':
					
				case 'H':
					
				case 'J':
					
				case 'K':
					
				case 'L':
					
				case 'M':
					
				case 'N':
					
				case 'P':
					
				case 'Q':
					
				case 'R':
					
				case 'S':
					
				case 'T':
					
				case 'V':
					
				case 'W':
					
				case 'X':
					
				case 'Y':
					
				case 'Z':
					c++;
					break;
					

			}

		}
		System.out.println(c);
	}
	public static String Third(String input)
	{
		String s = "";
		String L = "abcdefghijklmnopqrstuvwxyz";
		String U = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean found = false; 
		for(int i = 0; i < input.length(); i++)
		{
			for(int j = 0; j < 26; j++)
			{
				if( input.charAt(i) == L.charAt(j) ){
					s = s + U.charAt(j);
					found = true;
					break;
				}
			}
			if (!found)
				s = s + input.charAt(i);
			found = false;	}	
		return s;
	}
	public static String Fourth(String input)
	{
		String s = "";
		String L = "abcdefghijklmnopqrstuvxyz";
		String U = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean found = false; 
		for(int i = 0; i < input.length(); i++)
		{
			for(int j = 0; j < 26; j++)
			{
				if( input.charAt(i) == U.charAt(j) ){
					s = s + L.charAt(j);
					found = true;
					break;
				}
			}
			if (!found)
				s = s + input.charAt(i);
			found = false;}		
		return s;
	}
}