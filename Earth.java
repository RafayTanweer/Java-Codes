public class Human
{
	int age;
	int height;
	String name;
	String EyeColour;

	public Human()	
	{
	}

	public void Speak()
	{
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
		System.out.println("I am " + height + " inches tall");
		System.out.println("My eye colour is: " + EyeColour);
	}

	public void Eat()
	{
		System.out.println("I like to eat Pizza");

	}

	public void Sleep()
	{
		System.out.println("Proceeding to sleep");

	}



}

public class Earth
{

	public static void main(String[] args)
	{
		Human Rafay;
		
		Rafay = new Human();
		Rafay.age = 19;
		Rafay.height = 80;
		Rafay.EyeColour = "Light Brown";
		Rafay.name = "Rafay Tanweer";

		Rafay.Speak();
		Rafay.Eat();
		Rafay.Sleep();


	}



}