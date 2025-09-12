import java.util.Scanner;

public class VolumeCalc {
	public static void main(String[] args){
		
		double radius, 
	         area, 
					 volume;
		
		int length;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of a cylinder:");
		radius = input.nextDouble();
		
		System.out.println("Enter the length of a cylinder:");
		length = input.nextInt();
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The volume is " + volume);
		
	}
}