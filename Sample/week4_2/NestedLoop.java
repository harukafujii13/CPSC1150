public class NestedLoop
{
	public static void main(String[] args)
	{
		for (int count = 0; count <=3; count++)
		{
			//System.out.print(count);
			for (int innercount = 0; innercount <= count; innercount++)
			{
				System.out.print("\t" + innercount);
			}
			System.out.println();
		}
	}
}