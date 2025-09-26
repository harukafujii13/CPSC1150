import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 1-9: ");
        int n = input.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("Error: The number must be 1-9");
        } else {
            for (int i = 1; i <= n; i++) {
              for (int s = 0; s < n - i; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        input.close();
    }
}
