import java.util.Scanner;

public class SimpleIfDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number;
      
		System.out.print("Please enter an integer number: ");
		number = scan.nextInt();
      
		if (number % 5 == 0)
		{
			System.out.println("HiFive");
		}
      
		if (number % 2 == 0)
		{
			System.out.println("HiEven");
		}
	}
}