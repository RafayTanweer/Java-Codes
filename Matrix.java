public class Matrix
{
	public static void main(String[] args)
	{
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int[][] Matrix1 = new int[m][n];
		int[][] Matrix2 = new int[m][n];
		
		System.out.println("Matrix 1:");

		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				Matrix1[i][j] = (int)(Math.random()*100) + 1;
				System.out.print(Matrix1[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("Matrix 2:");

		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				Matrix2[i][j] = (int)(Math.random()*100) + 1;
				System.out.print(Matrix2[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("Addition of Matrices");
		
		int[][] Add = new int[m][n];

		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				Add[i][j] = Matrix1[i][j] + Matrix2[i][j];
				System.out.print(Add[i][j] + " ");
			}
			System.out.println();

		}
		
		System.out.println();
		System.out.println("Subtraction of Matrices");
	
		int[][] Sub = new int[m][n];

		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				Sub[i][j] = Matrix1[i][j] - Matrix2[i][j];
				System.out.print(Sub[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("Product of Matrices:");
	
		if (m == n)
		{
			int[][] prod = new int[m][m];

			int row = 0;
			int column = 0;
			int count = 0;
			int sum = 0;
			int Address = 0;

			for(int i = 0; i < m;i++)
			{
				do {

					for(int j = 0;j < m;j++)
					{
						sum = sum + (Matrix1[i][j] * Matrix2[j][Address]);
					}
					prod[row][column] = sum;
					sum = 0;
					column++;
					count++;
					Address++;

				} while (count < m);

				count = 0;
				row++;
				column = 0;
				Address = 0;
			}
		
			for(int i = 0;i < m;i++)
			{
				for(int j = 0;j < n;j++)
				{
					System.out.print(prod[i][j] + " ");
				}
				System.out.println();
			}

		}

		else
			System.out.println("Rule of Matrix Multiplication is not satisfied");

			
			
			

		

		

		

		






	}




}