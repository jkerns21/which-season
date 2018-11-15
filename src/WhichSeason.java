import java.util.Scanner;

public class WhichSeason 
{

	public static void main (String []args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your birth month...");
		int x = keyboard.nextInt();
		if ((x<1)||(x>12))	
		{
			System.out.println("This is an invalid month. ");
		}
		else if ((x<3)||(x==12))
		{
			System.out.println("You were born in the Winter.");
		}
		else if ((x>2)&&(x<6))
		{
			System.out.println("You were born in the Spring.");
		}
		else if ((x>5)&&(x<9))
		{
			System.out.println("You were born in the Summer.");
		}
		else
		{
			System.out.println("You were born in the Fall.");
		}
		
	}
}
