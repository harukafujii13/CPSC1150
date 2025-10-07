import java.util.Scanner;

public class GradeMethods2
{
	public static void main(String[] args)
	{
		double grade;
		Scanner scan = new Scanner(System.in);
		String response;

		do
		{
			System.out.println("Enter a grade between 0 and 100:");
			grade = scan.nextDouble();

			System.out.print("\nThe grade is ");
			printGrade(grade);

			System.out.println("\nThe grade is " + getGrade(grade));

			System.out.print ("\nWould you like to enter another grade?");
       
			response = scan.next();
		} while (response.equalsIgnoreCase("yes"));
    
	}

	public static void printGrade(double score)
	{      
      
		if (score < 0 || score > 100)
		{
			System.out.println("Invalid score");
			return;
		}

		if (score >= 90)
			System.out.println('A');
		else if (score >= 80)
			System.out.println('B');
		else if (score >= 70)
			System.out.println('C');
		else if (score >= 60)
			System.out.println('D');
		else
			System.out.println('F');
	}

	public static char getGrade(double score)
	{
		char result;

		if (score < 0 || score > 100)
		{
			System.out.println("Invalid score");
			return 'X';
		}
     
		if (score >= 90)
			result = 'A';
		else if (score >= 80)
			result = 'B' ;
		else if (score >= 70)
			result = 'C';
		else if (score >= 60)
			result = 'D';
		else
			result = 'F';

		return result;
	}
}