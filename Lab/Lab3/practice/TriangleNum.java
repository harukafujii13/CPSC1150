import java.util.Scanner;

public class TriangleNum{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a number between 1-9: ");
      int n = input.nextInt();

      if(n < 1 || n > 9 ){
        System.out.println("Error: The number must be 1-9");
      } else {
        for(int i = 1; i <= n; i++){
          //space
          for(int s = 1; s <= n - i; s++){
            System.out.print(" ");
          }

          for(int j = 1; j <= i; j++){
            System.out.print(j);
          }

          System.out.println();
        }
      }
  }
}