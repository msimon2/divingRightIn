import java.util.*;

public class divingRightIn 
	{
	static String name;
	static int age;
	static int date;
	public static void main(String[] args) 
		{
		questions();
		dogYears();
		}
	public static void questions()
		{
		Scanner userInput = new Scanner (System.in);
		System.out.println("What is your name?");
		name = userInput.nextLine();
		System.out.println("How old are you?");
		age = userInput.nextInt();
		System.out.println("Alright, " +name+ ", what is your year of birth?");
		date = userInput.nextInt();
		if (age<=16)
			{
			System.out.println("Are you excited for driving?");
			years();
			}
		else if (age>=18)
			{
			System.out.println("You can legally vote in elections.");
			years();
			}
		else 
			{
			System.out.println("We're the same age.");
			years();
			}
		}
	public static void years()
		{
		System.out.println();
		for (int i=0; i<age+1; i++)
			{
			if (i==1)
				{
				System.out.println("In " + (date+i)+ ", you were " + i + " year old.");
				}
			else
				System.out.println("In " + (date+i) + ", you were " +i+ " years old.");
			}
		}
	public static void dogYears()
		{
		System.out.println( );
		int dogYears = age*7;
		System.out.println("In dog years, you would be " +dogYears + " years old.");
		}
	}







