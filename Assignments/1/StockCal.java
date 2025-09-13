import java.util.Scanner;

public class StockCal {
  public static void main(String[] args){

    double stockPrice, commissionRate, commission, netProceeds, shareVal;
    int shareNum;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter stock price:");
    stockPrice = input.nextDouble();

    System.out.println("Enter number of shares:");
    shareNum = input.nextInt();

    System.out.println("Enter commission rate (as a percentage):");
    commissionRate = input.nextDouble();

    shareVal = stockPrice * shareNum;

    commission = shareVal * (commissionRate / 100);

    netProceeds = shareVal - commission;

    System.out.printf("Value of share: $%.2f\n", shareVal);
    System.out.printf("Commission: $%.4f\n", commission);
    System.out.printf("Net proceeds: $%.4f\n", netProceeds);

    input.close();
  }
}