public class Increment
{
	public static void main(String[] args)
	{
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment (x);
		System.out.println("After the call, x is " + x);
	}
   
	public static void increment(int x)
	{
		x++;
		System.out.println("inside the method n is: " + x);
	}
}