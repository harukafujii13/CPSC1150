import java.util.Scanner;

public class AdditionQuiz1
{
	public static void main(String[] args)
	{
		int number1 = (int)( System.currentTimeMillis() % 10);
		int number2 = (int)( System.currentTimeMillis() % 7);
		int answer;
      
		Scanner input = new Scanner(System.in);
      
		do
		{
			System.out.print("What is " + number1 + " + " + number2 + " ? ");
			answer = input.nextInt();
      
			System.out.println( number1 + " + " + number2 + " = " + answer
				+ " is "  +(number1 + number2 == answer));
		} while ( (number1 + number2) != answer   );
		
		input.close();
	}
}