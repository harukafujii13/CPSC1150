import java.util.Scanner;

public class SpecialNumber2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
      
		System.out.println("Please enter an integer number:");
		number = input.nextInt();
      
		System.out.println("IS " + number + " divisible by 2 and 3? " +
                           ((number % 2 == 0) && (number % 3 == 0)));
      
		System.out.println("IS " + number + " divisible by 2 or 3? " +
                           ((number % 2 == 0) || (number % 3 == 0)));
      
		System.out.println("IS " + number + " divisible by 2 or 3, but not both? " +
                           ((number % 2 == 0) ^ (number % 3 == 0)));
      
	}
}