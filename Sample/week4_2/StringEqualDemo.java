import java.util.*;

public class StringEqualDemo
{
	public static void main(String[] args)
	{
		String msg1, msg2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		msg1 = scan.nextLine();
		
		System.out.println("Please enter another word");
		msg2 = scan.nextLine();
		
		if (msg1.equals(msg2))
			System.out.println(msg1 + " and " + msg2 + " are equal");
		else
			System.out.println(msg1 + " and " + msg2 + " are not equal");
		
		if (msg1 == msg2)
			System.out.println("Address of " +msg1 + " and " + msg2 + " are equal");
		else
			System.out.println("Address of " + msg1 + " and " + msg2 + " are not equal");
		
		msg1 = msg2;
		
		if (msg1 == msg2)
			System.out.println("Address of " +msg1 + " and " + msg2 + " are equal");
		else
			System.out.println("Address of " + msg1 + " and " + msg2 + " are not equal");
	}
}