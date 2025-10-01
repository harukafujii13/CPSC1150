import java.util.Scanner;

public  class SquareNumbers {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a positive integer number between 1-200: ");
      int n = input.nextInt();

      if(n < 1 || n > 200){
        System.out.println("Error: The number must be 1-200");
      } else {
        for(int i = 0; i * i < n; i++){
         int square = i * i;
         System.out.print(square);

         if((i + 1) * (i + 1) < n){
          System.out.print(" ");
         }
        }
        System.out.println();
      }

      input.close();
  }
}