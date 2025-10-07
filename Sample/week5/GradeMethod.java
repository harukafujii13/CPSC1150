public class GradeMethod
{
	public static void main(String[] args)
	{
		// use of printGrade method
		System.out.print("The grade is ");
		printGrade(78.5);

		System.out.print("The grade is ");
		printGrade(59.5);

		// use of getGrade method
		System.out.println("The grade is " + getGrade(78.5));

		System.out.println("The grade is " + getGradeNew(59.5));
      
		printGrade(100);
		getGrade(100);
	}

	public static void printGrade(double score)
	{      
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
   
   public static char getGradeNew(double score)
	{
   
		if (score >= 90)
			return'A';
		if (score >= 80)
			return 'B' ;
		if (score >= 70)
			return 'C';
		 if (score >= 60)
			return'D';
		
      return 'F';

	}
}