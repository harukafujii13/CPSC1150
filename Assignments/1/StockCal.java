import java.util.Scanner;

public class StockCal {
  public static void main(String[] args){

    double price, rate, commission, net, shareVal;
    int shareNum;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter stock price:");
    price = input.nextDouble();

    System.out.println("Enter number of share:");
    shareNum = input.nextInt();

    System.out.println("Enter commission:");
    rate = input.nextDouble();

    shareVal = price * shareNum;

    commission = Math.round(shareVal * (rate / 100));

    net = shareVal - commission;

    System.out.println("Value of share: " + shareVal);
    System.out.println("Commission: " + commission);
    System.out.println("Net proceed: " + net);


  }
}