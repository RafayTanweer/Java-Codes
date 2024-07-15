public class SelectionSort
{
	public static void main(String[] args)
	{

		//Smallest to largest

		int[] Array1 = new int[10];
		
		for(int i = 0;i < Array1.length;i++)
		{
			Array1[i] = (int)(Math.random()*100)+1;
			System.out.print(Array1[i] + " ");

		}
			
		System.out.println();
		int SmallestIndex = 0;
		int temp = 0;

		for(int i = 0;i < Array1.length;i++)
		{
			SmallestIndex = i;
			for(int j = i + 1;j < Array1.length;j++)
			{
				if(Array1[j] < Array1[SmallestIndex])
					SmallestIndex = j;


			}

			temp = Array1[i];
			Array1[i] = Array1[SmallestIndex];
			Array1[SmallestIndex] = temp;
			




		}

		for(int i = 0;i < Array1.length;i++)
			System.out.print(Array1[i] + " ");






	}




}