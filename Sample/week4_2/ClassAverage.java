import java.util.*;
public class ClassAverage
{
	public static void main(String[] args)
	{
		int numSt, cont;
		double score, sum , ave;
      
		Scanner input = new Scanner (System.in);
		do
		{
			sum = 0;
			System.out.println("This program calculates the average of an exam or quiz");
         
			System.out.print("\nPlease enter the number of students in the class: ");
			numSt = input.nextInt();
         
			if (numSt <= 0)
			{
				System.out.println("Error: Number of students must be a positive integre number");
			}
			else
			{
				for (int cnt = 1; cnt <= numSt; cnt++)
				{
					System.out.print("enter a students score:");
					score = input.nextDouble();
					sum += score;
				}
         
				ave = sum / numSt;
				System.out.println("\nThe class average is: " + ave);
			}
         
			System.out.print("\nEnter 1 to continue 2 to exit:");
			cont = input.nextInt();
         
		} while(cont == 1);
	}

}
