import java.util.Scanner;

public class NumberOfWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine();

        int wordCount = 0;
        boolean inWord = false;  

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("\nThere are " + wordCount + " words in");
        System.out.println("\"" + sentence + "\"");

        input.close();
    }
}
