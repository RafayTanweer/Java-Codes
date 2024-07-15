public class A2_Q4
{
	public static void main(String[] args)
	{
		String Input = args[0];
		int x = 0, sum = 0, counter = 10, TempSum = 0;
		int[] PossibleChecksum = {10,9,8,7,6,5,4,3,2,1,0};
		
		for(int i = 0; i < Input.length(); i++)
		{
			sum = sum + counter*Character.getNumericValue(Input.charAt(i));
			counter--;
		}
		

		for(int i = 0; i < PossibleChecksum.length; i++)
		{
			x = PossibleChecksum[i];
			TempSum = sum + x;
			if (TempSum % 11 == 0)
				break;
		}

		System.out.println("The CheckSum is: " + x);
		System.out.println("The ISBN no. is: " + Input + x);
			

	}



}