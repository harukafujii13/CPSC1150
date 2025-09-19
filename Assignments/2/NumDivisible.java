import java.util.Scanner;

public class NumDivisible{
	public static void main(String[] arg){
		
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer number:");
		num1 = input.nextInt();
		
		System.out.println("Enter a positive integer number:");
		num2 = input.nextInt();
		
		if(num1 <= 0 || num2 <= 0){
			System.out.println("Error: Expecting a positive number");
		} else if (num1 < num2){
			System.out.println("Error: First number must be bigger than the second number");
		} else {
		        if(num1 % num2 == 0){
			System.out.println(num1 + " is divisible by " + num2);
			}else{
			System.out.println(num1 + " is not divisible by " + num2);
		  }
	        }
		
	}
	
}
