/**
 * Program Name: StockCal
 * Author: Haruka Fujii
 * Student ID: 100444473
 * Date: September 13, 2025
 * Course: CPSC 1150
 */

import java.util.Scanner;

public class StockCal {
 /**
 * Purpose:
 * This program calculates the value of a stock sale.
 * The user will be prompted to enter the price per share,
 * the number of shares to be sold, and the commission rate.
 * 
 * Variables:
 * stockPrice      (double) – price per share entered by user
 * commissionRate  (double) – commission rate as a percentage
 * commission      (double) – total commission amount
 * netProceeds     (double) – final amount after commission
 * shareVal        (double) – total value of shares before commission
 * shareNum        (int)    – number of shares entered by user
 *
 * Precondition:
 * - stock price > 0
 * - number of shares > 0
 * - commission rate >= 0
 *
 * Postcondition:
 * The program displays the value of the shares, commission, and net proceeds.
 */
  public static void main(String[] args){

    double stockPrice, 
           commissionRate, 
           commission, 
           netProceeds, 
           shareVal;

    int shareNum;

    Scanner input = new Scanner(System.in);

    // display a prompt that ask the user to enter stock price
    System.out.println("Enter stock price:");
    stockPrice = input.nextDouble();

    // display a prompt that ask the user to enter number of shares
    System.out.println("Enter number of shares:");
    shareNum = input.nextInt();
    
    // display a prompt that ask the user to enter commission
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