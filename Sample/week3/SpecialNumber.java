import java.util.Scanner;

public class SpecialNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
      
		System.out.println("Please enter an integer number:");
		number = input.nextInt();
      
		if ((number % 2 == 0) && (number % 3 == 0))
		{
			System.out.println("\n" + number + " is divisible by both 2 and 3");
		}
		if ((number % 2 == 0) || (number % 3 == 0))
		{
				System.out.println("\n" + number + " is divisible by 2 or 3 but not both.");
            
				if (number % 2 == 0)
				{
					System.out.println("\n" + number + " is divisible by 2, it is not divisble by 3.");
				}
				else 
				{
				//	if (number % 3 == 0)
				//	{
						System.out.println("\n" + number + " is divisible by 3, it is not divisble by 2.");
				//	}
				}
		}
		else
				System.out.println("\n" + number + " is not divisible by either 2 or 3.");
		}
	
}