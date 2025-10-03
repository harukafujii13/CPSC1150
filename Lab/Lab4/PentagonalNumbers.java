
public class  PentagonalNumbers{

  public static int getPentagonalNumber(int num){
  return num * (3 * num -1) / 2;
  }

  public static void main(String[] args) {
    System.out.println("The first 10 pentagonal numbers are:");

    for(int i = 1; i <= 10; i++){
      System.out.print(getPentagonalNumber(i) + " ");
    }
    System.out.println();
  }
  
}