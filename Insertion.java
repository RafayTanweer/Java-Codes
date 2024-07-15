public class Insertion
{
	public static void main(String[] args)
	{

		//Insertion in a sorted array
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


		System.out.println();
		int element = Integer.parseInt(args[0]);
		int InsertionIndex = 0;	

		for(int i = 0;i < Array1.length;i++)
		{
			if(element < Array1[i])
			{
				InsertionIndex = i;
				break;
			}

		}	

		int[] Array2 = new int[Array1.length + 1];

		for(int i = 0;i < InsertionIndex;i++)
		{
			Array2[i] = Array1[i];
		}

		Array2[InsertionIndex] = element;

		for(int i = InsertionIndex + 1;i < Array2.length;i++)
		{
			Array2[i] = Array1[i-1];

		}

		for(int i = 0;i < Array2.length;i++)
			System.out.print(Array2[i] + " ");

		






	}





}