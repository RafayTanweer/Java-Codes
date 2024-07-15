public class SelectionSort2
{
	public static void main(String[] args)
	{

		//Largest to Smallest

		int[] Array1 = new int[10];
		
		for(int i = 0;i < Array1.length;i++)
		{
			Array1[i] = (int)(Math.random()*100)+1;
			System.out.print(Array1[i] + " ");

		}
			
		System.out.println();
		int LargestIndex = 0;
		int temp = 0;

		for(int i = 0;i < Array1.length;i++)
		{
			LargestIndex = i;
			for(int j = i + 1;j < Array1.length;j++)
			{
				if(Array1[j] > Array1[LargestIndex])
					LargestIndex = j;


			}

			temp = Array1[i];
			Array1[i] = Array1[LargestIndex];
			Array1[LargestIndex] = temp;
			




		}

		for(int i = 0;i < Array1.length;i++)
			System.out.print(Array1[i] + " ");






	}




}