/**
 ** Program Name: WindChillCalculator
 ** Author: Haruka Fujii
 ** Student ID: 100444473
 ** Date: September 24, 2025
 ** Course: CPSC 1150
 **
 ** Purpose:
 **   This program calculates the wind chill index (Twc) based on the
 **   ambient air temperature (Ta, in Celsius) and wind speed (V, in km/h).
 **   The user will be prompted to enter both values, and the program
 **   will output the calculated wind chill index as an integer.
 **
 ** Formula:
 **   Twc = 13.112 + 0.6215*Ta - 11.37*V^0.16 + 0.3965*Ta*V^0.16
 **
 ** Variables:
 **   Ta   (double) – ambient temperature in Celsius, entered by user
 **   V    (double) – wind speed in kilometers per hour, entered by user
 **   Twc  (double) – calculated wind chill index
 **
 ** Precondition:
 **   - Temperature must be between -50 and 5 degrees Celsius
 **   - Wind speed must be between 0 and 100 km/h
 **
 ** Postcondition:
 **   - If input values are valid, the program displays the wind chill index as an integer.
 **   - If input values are invalid, the program displays an error message and terminates.
 */

import java.util.Scanner;

public class WindChillCalculator
{
    public static void main(String[] args)
    {
        // Declare variables for temperature, wind speed, and wind chill index
        double Ta, V, Twc;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display introduction message
        System.out.println("This program calculates the wind-chill index.");

        // Prompt and read the temperature from the user
        System.out.print("Enter the temperature in Celsius: ");
        Ta = input.nextDouble();

        // Prompt and read the wind speed from the user
        System.out.print("Enter the wind speed in kilometers per hour: ");
        V = input.nextDouble();

        // Validate temperature range
        if (Ta < -50 || Ta > 5) {
            System.out.println("Error: Temperature must be between -50 and 5 °C.");
            input.close();   // Close scanner before exiting
            return;          // Terminate program on invalid input
        }

        // Validate wind speed range
        if (V < 0 || V > 100) {
            System.out.println("Error: Wind speed must be between 0 and 100 km/h.");
            input.close();   // Close scanner before exiting
            return;          // Terminate program on invalid input
        }

        // Compute wind chill index using the given formula
        Twc = 13.112 + (0.6215 * Ta)
                - (11.37 * Math.pow(V, 0.16))
                + (0.3965 * Ta * Math.pow(V, 0.16));

        // Display the wind chill index as an integer
        System.out.println("The wind chill index is " + (int)Twc);

        // Close scanner resource
        input.close();
    }
}
