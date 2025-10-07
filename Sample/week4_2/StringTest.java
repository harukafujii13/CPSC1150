import java.util.*;

public class StringTest
{
	public static void main(String[] args)
	{
		String inputLine, changedLine;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a sentence:");	
		inputLine = input.nextLine();

		changedLine = inputLine.toLowerCase();

		System.out.println("The input sentence is:\n\t" + 
				inputLine + "\nThe first changed sentence is:\n\t"
						+ changedLine);

		changedLine = inputLine.toUpperCase();

		System.out.println("\n\nThe input sentence is:\n\t" + 
				inputLine + "\nThe second changed sentence is:\n\t"
					+ changedLine);
	
		changedLine = inputLine.replace('c', 'x');

		System.out.println("\n\nThe input sentence is:\n\t" + 
				inputLine + "\nThe Third changed sentence is:\n\t"
					+ changedLine);
     
	}
}