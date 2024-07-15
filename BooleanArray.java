public class BooleanArray
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		boolean[][] Array1 = new boolean[n][n];
		boolean[][] Array2 = new boolean[n][n];
		boolean[][] Array3 = new boolean[n][n];
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(Math.random() >= 0.5)
					Array1[i][j] = true;
				else
					Array1[i][j] = false;
				System.out.print(Array1[i][j] + " ");
					
			}
			System.out.println();

		}
		System.out.println();

		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(Math.random() >= 0.5)
					Array2[i][j] = true;
				else
					Array2[i][j] = false;
				System.out.print(Array2[i][j] + " ");
					
			}
			System.out.println();

		}
		System.out.println();


		int counter = 0;
		boolean result = false;
		int row = 0;
		int column = 0;
		int ColumnCount = 0;



		for(int i = 0;i < n;i++)
		{
			do {

				for(int j = 0;j < n;j++)
				{
					result = result || (Array1[i][j] && Array2[j][counter]);
				}
				
				Array3[row][column] = result;
				column++;
				result = false;
				counter++;
				ColumnCount++;

			} while(ColumnCount < n);

			column = 0;
			row++;
			counter = 0;
			ColumnCount = 0;

		}
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
				System.out.print(Array3[i][j] + " ");
			System.out.println();

		}

			
				


				

	
	}


}