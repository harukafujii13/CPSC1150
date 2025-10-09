/**
 ** Program Name: TrianglePerimeter
 ** Author: Haruka Fujii
 ** Student ID: 100444473
 ** Date: October 8, 2025
 ** Course: CPSC 1150
 **
 ** Purpose:
 **   This program calculates the perimeter of a triangle based on the
 **   x- and y-coordinates of its three corner points.
 **   The user will be prompted to enter the coordinates of three points.
 **   The program verifies that the points form a valid triangle and then
 **   computes and displays the perimeter.
 **
 ** Formula:
 **   Distance between two points (x1, y1) and (x2, y2):
 **     d = √((x2 - x1)² + (y2 - y1)²)
 **
 **   Perimeter = side1 + side2 + side3
 **
 ** Variables:
 **   x1, y1, x2, y2, x3, y3  (int) – coordinates of the three triangle vertices
 **   side1, side2, side3     (double) – lengths of the sides
 **   perimeter               (double) – total perimeter of the triangle
 **
 ** Precondition:
 **   - Coordinates must be positive integers between 1 and 40 (inclusive)
 **   - The three points must not be collinear (must form a valid triangle)
 **
 ** Postcondition:
 **   - If input values are valid, the program displays the triangle’s perimeter.
 **   - If input values are invalid, an appropriate error message is displayed.
 **   - The program repeats until the user chooses to stop.
 */

import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display introduction message
        System.out.println("This program calculates the perimeter of a Triangle.");

        boolean repeat = true; // control loop for repeating program

        while (repeat) {
            // --- User Input ---
            System.out.print("Please enter the x-coordinate of point1: ");
            int x1 = input.nextInt();
            System.out.print("Please enter the y-coordinate of point1: ");
            int y1 = input.nextInt();
            System.out.print("Please enter the x-coordinate of point2: ");
            int x2 = input.nextInt();
            System.out.print("Please enter the y-coordinate of point2: ");
            int y2 = input.nextInt();
            System.out.print("Please enter the x-coordinate of point3: ");
            int x3 = input.nextInt();
            System.out.print("Please enter the y-coordinate of point3: ");
            int y3 = input.nextInt();

            // --- Validation ---
            // Call method verify_input() to check if inputs are valid
            if (!verify_input(x1, y1, x2, y2, x3, y3)) {
                System.out.println("Invalid input. Please try again.\n");
            } else {
                // --- Compute distances between each pair of points ---
                double side1 = calculateDistance(x1, y1, x2, y2);
                double side2 = calculateDistance(x2, y2, x3, y3);
                double side3 = calculateDistance(x3, y3, x1, y1);

                // --- Compute perimeter ---
                double perimeter = side1 + side2 + side3;

                // --- Output result ---
                System.out.printf("\nThe perimeter of a Triangle with "
                        + "point1 (%d, %d), point2 (%d, %d) and point3 (%d, %d)\n"
                        + "is %.6f\n",
                        x1, y1, x2, y2, x3, y3, perimeter);
            }

            // --- Ask user if they want to repeat ---
            System.out.print("\nWould you like to repeat the program? (Yes/No): ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("Yes")) {
                repeat = false;
                System.out.println("\nEnd of the program.");
            }
        }

        // Close scanner resource
        input.close();
    }

    /**
     * Method Name: verify_input
     ** Purpose:
     **   Verifies that the user’s input values are valid triangle coordinates.
     **   - Checks that all coordinates are between 1 and 40.
     **   - Ensures that the three points are not collinear (area ≠ 0).
     **
     ** Parameters:
     **   x1, y1, x2, y2, x3, y3 – integer coordinates of the three points
     **
     ** Return:
     **   boolean – true if the input is valid, false otherwise
     */
    public static boolean verify_input(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Check if coordinates are positive and within 1–40 range
        if (x1 <= 0 || x1 > 40 || x2 <= 0 || x2 > 40 || x3 <= 0 || x3 > 40 ||
            y1 <= 0 || y1 > 40 || y2 <= 0 || y2 > 40 || y3 <= 0 || y3 > 40) {
            System.out.println("Error: Coordinates must be positive integers between 1 and 40.");
            return false;
        }

        // Check if points are collinear (area = 0)
        double area = 0.5 * Math.abs(
            x1 * (y2 - y3) +
            x2 * (y3 - y1) +
            x3 * (y1 - y2)
        );

        if (area == 0) {
            System.out.println("Error: The points are collinear and do not form a triangle.");
            return false;
        }

        return true; // Valid input
    }

    /**
     * Method Name: calculateDistance
     ** Purpose:
     **   Calculates the distance between two points using the Pythagorean theorem.
     **   Formula: distance = √((x2 - x1)² + (y2 - y1)²)
     **
     ** Parameters:
     **   x1, y1, x2, y2 – integer coordinates of the two points
     **
     ** Return:
     **   double – distance between the two points
     */
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        // Step 1: calculate (x2 - x1)^2 + (y2 - y1)^2 and store in variable "data"
        double data = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

        // Step 2: return the square root of data
        return Math.sqrt(data);
    }
}
