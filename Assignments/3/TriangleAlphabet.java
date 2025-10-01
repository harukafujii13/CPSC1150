import java.util.Scanner;

public class TriangleAlphabet{
  public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a number between 1-26: ");
      int n = input.nextInt();

      if(n < 1 || n > 26){
        System.out.println("Error: The number must be 1-26");
      }else{
        for(int i = 1; i <= n; i++){
          for(int s = 0; s < n - i; s++){
            System.out.print(" ");
          }

          for(char j = 'A'; j < 'A' + i; j++){
            System.out.print(j);
          }
          System.out.println();
        }
      }
      
      input.close();
  }
}