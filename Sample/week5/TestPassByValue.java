public class TestPassByValue
{
	public static void main(String[] args)
	{
		int num1 = 1,
		      num2 = 2;
      
		System.out.println("Before involking the swap method, num1 is " +
			num1 + " and num2 is " + num2);

		swap (num2, num1);
      
		System.out.println("\nAfter involking the swap method, num1 is " +
			num1 + " and num2 is " + num2);
      
		swap(90, 20);
	}
   
	public static void swap(int num1, int num2)
	{
		int temp;
      
		System.out.println("\n\tInside the swap method");
		System.out.println("\t\tBefore swapping num1 is " + num1
				+ " num2 is " + num2);
      
		temp = num1;
		num1 = num2;
		num2 = temp;
      
		System.out.println("\t\tAfter swapping num1 is " + num1
				+ " num2 is " + num2);
      
	}
}