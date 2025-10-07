import java.util.Scanner;

public class GuessNumberWhile
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number, guess;
      
		number = (int)(Math.random() * 101);
		System.out.println("\nnumber is: " + number + "\n\n");
      
		guess = -1;
      
		while (guess != number)
		{
			System.out.print("\nEnter your guess: ");
			guess = scan.nextInt();
      
			if (guess == number)
				System.out.println("Yes the number is " + number);
			else 
				if (guess > number)
					System.out.println("Your guess is too high");
				else
					System.out.println("Your guess is too low");
		}
	}
}