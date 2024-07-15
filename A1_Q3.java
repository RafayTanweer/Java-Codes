public class A1_Q3
{
	public static void main(String[] args)
	{
		int OriginalNumber = Integer.parseInt(args[0]);
		int number = OriginalNumber;
		String[] unit = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] ElevenToNineteen = {"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] Ten = {"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String[] Hundred = {"One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
		String[] Thousand = {"One Thousand","Two Thousand","Three Thousand","Four Thousand","Five Thousand","Six Thousand","Seven Thousand","Eight Thousand","Nine Thousand"};
		String English = "";
		int ExtractedNum = 0;
				
		
		if(OriginalNumber >= -9999 && number <= 9999)
		{
			if(OriginalNumber < 0)
			{
				number = (-1) * OriginalNumber;

				if(number % 100 >= 11 && number % 100 <= 19)
				{

					ExtractedNum = number % 10;
					English = ElevenToNineteen[ExtractedNum-1] + " " + English;
					number = number/100;
					int counter = 0;

					while (number > 0)
					{
						ExtractedNum = number % 10;
						if (counter == 0)
							English = Hundred[ExtractedNum-1] + " " + "And" + " " + English;
						else
							English = Thousand[ExtractedNum-1] + " " + English;
						number = number/10;
						counter++;				
						
					}
				}

				else
				{
					int counter2 = 0;
					while (number > 0)
					{
						ExtractedNum = number % 10;
						if (counter2 == 0)
						{
							if (ExtractedNum != 0)
								English = unit[ExtractedNum] + " " + English;
						}

						if (counter2 == 1)
						{
							if (ExtractedNum != 0)
								English = Ten[ExtractedNum-1] + " " + English;
						}

						if (counter2 == 2)
						{
							if (ExtractedNum != 0 && English == "")
								English = Hundred[ExtractedNum-1] + " " + English;
							else
							{
								if (ExtractedNum != 0 && English != "")
									English = Hundred[ExtractedNum-1] + " " + "And" + " " + English;
								else
								{
									
									if (ExtractedNum == 0 && English != "")
										English = "And" + " " + English;
								}
							}
							
						
						
						}

						if (counter2 == 3)
						{
							if (ExtractedNum != 0)
								English = Thousand[ExtractedNum-1] + " " + English;
						}
	
						number = number/10;
						counter2++;
					
					}
			
				
				}

				English = "Negative" + " " + English;
				System.out.println(English);


			}

			else
			{

				if(number == 0)
				{
					System.out.println("Zero");
				}
				
				else
				{
					
					if(number % 100 >= 11 && number % 100 <= 19)
					{

						ExtractedNum = number % 10;
						English = ElevenToNineteen[ExtractedNum-1] + " " + English;
						number = number/100;
						int counter = 0;

						while (number > 0)
						{
							ExtractedNum = number % 10;
							if (counter == 0)
								English = Hundred[ExtractedNum-1] + " " + "And" + " " + English;
							else
								English = Thousand[ExtractedNum-1] + " " + English;
							number = number/10;
							counter++;				
						
						}
					}

					else
					{
						int counter2 = 0;
						while (number > 0)
						{
							ExtractedNum = number % 10;
							if (counter2 == 0)
							{
								if (ExtractedNum != 0)
									English = unit[ExtractedNum] + " " + English;
							}

							if (counter2 == 1)
							{
								if (ExtractedNum != 0)
									English = Ten[ExtractedNum-1] + " " + English;
							}

							if (counter2 == 2)
							{
								if (ExtractedNum != 0 && English == "")
									English = Hundred[ExtractedNum-1] + " " + English;
								else
								{
									if (ExtractedNum != 0 && English != "")
										English = Hundred[ExtractedNum-1] + " " + "And" + " " + English;
									else
									{
										if (ExtractedNum == 0 && English != "")
											English = "And" + " " + English;
						
									}
								}
								
						
							}

							if (counter2 == 3)
							{
								if (ExtractedNum != 0)
									English = Thousand[ExtractedNum-1] + " " + English;
							}
	
							number = number/10;
							counter2++;
					
						}
			
				
					}
	
					System.out.println(English);

				}

				
			}

				
		}

			
		else
			System.out.println("Number must be between -9999 and 9999.");

		




	}







}