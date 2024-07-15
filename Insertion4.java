public class Insertion4
{
	public static void main(String[] args)
	{
		//Inserting of an element at a specific index in an unsorted Array

		int[] Array1 = new int[10];
		int element = Integer.parseInt(args[0]);
		int index = Integer.parseInt(args[1]);

		for(int i = 0;i < Array1.length;i++)
		{
			Array1[i] = (int)(Math.random()*100) + 1;
			System.out.print(Array1[i] + " ");
		}

		System.out.println();
		int[] Array2 = new int[Array1.length+1];

		for(int i = 0;i < index;i++)
			Array2[i] = Array1[i];
	
		Array2[index] = element;

		for(int i = index;i < Array1.length;i++)
			Array2[i+1] = Array1[i];

		for(int i = 0;i < Array2.length;i++)
			System.out.print(Array2[i] + " ");
			







	}





}