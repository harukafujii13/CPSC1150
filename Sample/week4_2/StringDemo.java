public class StringDemo
{
	public static void main(String[] args)
	{
		String sentence = "Text processing is hard!";
		int position;

		position = sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println("012345678901234567890123");
		System.out.println("\nThe word \"hard\" starts at index "
				+ position);

		sentence = sentence.substring(0, position);
		sentence = sentence + "easy!";
 
		System.out.println("\nThe changed string is:\n" + sentence);
	}
}