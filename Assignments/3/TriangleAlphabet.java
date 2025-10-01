/**
 ** Program Name: TriangleAlphabet
 ** Author: Haruka Fujii
 ** Student ID: 100444473
 ** Date: October 1st, 2025
 ** Course: CPSC 1150
 **
 ** Purpose:
 **   This program prompts the user to enter an integer between 1 and 26.
 **   It then displays a right-aligned triangle of letters starting from 'A'.
 **   Each row prints letters from 'A' up to the row number (A, AB, ABC, ...).
 **
 ** Example (n = 4):
 **      A
 **     AB
 **    ABC
 **   ABCD
 **
 ** Variables:
 **   n   (int)   – number of rows to print (1–26), entered by user
 **   i   (int)   – outer loop counter for the rows
 **   s   (int)   – inner loop counter for spaces to align the triangle
 **   j   (char)  – inner loop counter for letters from 'A' upward
 **
 ** Precondition:
 **   - User input must be between 1 and 26 (inclusive)
 **
 ** Postcondition:
 **   - If input is valid, a right-aligned triangle of alphabets is printed
 **   - If input is invalid, an error message is displayed
 */
import java.util.Scanner;

public class TriangleAlphabet{
  public static void main(String[] args) {
      
       // Create Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Prompt user for a number between 1–26
      System.out.println("Please enter a number between 1-26: ");
      int n = input.nextInt();

      // Validate input
      if(n < 1 || n > 26){
        System.out.println("Error: The number must be 1-26");
      }else{
        // Outer loop for rows
        for(int i = 1; i <= n; i++){
          // Print spaces for right alignment
          for(int s = 0; s < n - i; s++){
            System.out.print(" ");
          }
          
          // Print letters from 'A' up to 'A' + i - 1
          for(char j = 'A'; j < 'A' + i; j++){
            System.out.print(j);
          }

          // Move to next line after each row
          System.out.println();
        }
      }
      
      // Close scanner
      input.close();
  }
}