/**
 ** Program Name: SquareNumbers
 ** Author: Haruka Fujii
 ** Student ID: 100444473
 ** Date: October 1st, 2025
 ** Course: CPSC 1150
 **
 ** Purpose:
 **   This program prompts the user to enter a positive integer between 1 and 200.
 **   It then displays all perfect square numbers (0, 1, 4, 9, …) that are less
 **   than the entered number. The squares are displayed in a single line, separated by spaces.
 **
 ** Formula:
 **   square = i * i, where i is a non-negative integer
 **
 ** Variables:
 **   n       (int) – upper bound entered by user (1–200)
 **   i       (int) – loop counter used to generate squares
 **   square  (int) – calculated square value (i * i)
 **
 ** Precondition:
 **   - User input must be between 1 and 200 (inclusive)
 **
 ** Postcondition:
 **   - If input is valid, program outputs all perfect squares < n on one line
 **   - If input is invalid, program displays an error message
 */

import java.util.Scanner;

public  class SquareNumbers {
  public static void main(String[] args) {
      // Create Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt user for an integer
      System.out.println("Please enter a positive integer number between 1-200: ");
      int n = input.nextInt();

      // Validate input range
      if(n < 1 || n > 200){
        System.out.println("Error: The number must be 1-200");
      } else {
        // Loop through non-negative integers and compute squares
        for(int i = 0; i * i < n; i++){
         int square = i * i;  // calculate square
         System.out.print(square); // print square number
        
         // Print a space if there will be another square after this
        if((i + 1) * (i + 1) < n){
          System.out.print(" ");
         }
        }
        // Move to next line after printing all squares
        System.out.println();
      }

      // Close scanner resource
      input.close();
  }
}