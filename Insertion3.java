public class Insertion3
{
	public static void main(String[] args)
	{
		//Inserting an element at the end of an Array
		int[] Array1 = new int[10];
		int element = Integer.parseInt(args[0]);

		for(int i = 0;i < Array1.length;i++)
		{
			Array1[i] = (int)(Math.random()*100) + 1;
			System.out.print(Array1[i] + " ");
		}

		System.out.println();
		int[] Array2 = new int[Array1.length + 1];

		for(int i = 0;i < Array2.length-1;i++)
		{
			Array2[i] = Array1[i];
			
		}

		Array2[Array2.length-1] = element;


		for(int i = 0;i < Array2.length;i++)
			System.out.print(Array2[i] + " ");



	}




}