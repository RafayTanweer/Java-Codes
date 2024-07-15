public class prisoner
{
	public static void main(String[] args)
	{
		int NoOfPri = Integer.parseInt(args[0]);
		int NoOfCandies = Integer.parseInt(args[1]);
		int Start = Integer.parseInt(args[2]);
		int CandiesDistributed = 0;
		boolean End = false;

		for(int i = Start; i <= NoOfPri; i++)
		{
			CandiesDistributed++;
			if (CandiesDistributed == NoOfCandies)
			{
				End = true;
				System.out.println(i + " will get the last candy");
				break;
			}
		}

		if (End == false)
		{
			while (End == false)
			{
				for(int i = 1; i <= NoOfPri; i++)
				{
					CandiesDistributed++;
					if (CandiesDistributed == NoOfCandies)
					{
						End = true;
						System.out.println(i + " will get the last candy");
						break;
					}

				}

			}
		}

		


	}



}