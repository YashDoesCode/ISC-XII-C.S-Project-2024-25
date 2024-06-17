package DDA;
/**
Question 8:

Write a program in Java to input ‘n’ number of elements in a 2D-Array and implement Scanner class to take elements and the size of the array from the user. After taking input into the Squre Matrix, calculate the sum of the array border elements or boundary elements sum. Perform the following functions:

1. Take input in the Boundary of the Square Matrix (Top Row, Right Column, Lef Column and Bottom Row)
2. Display the inputted array in the matrix format.
3. Calculate the boundary sum of all the boundary elements.

Algorithm

1. Start 
2. Import `java.util.Scanner`.
3. Define the `BoundaryElements` class.
4. Define the `main` method.
5. Create a `Scanner` object for input.
6. Prompt and read the order of the square matrix.
7. Initialize a 2D array `matrix` with the specified order.
8. Prompt and read the top row elements.
9. Prompt and read the right column elements (excluding first and last).
10. Prompt and read the bottom row elements in reverse order.
11. Prompt and read the left column elements in reverse order (excluding first and last).
12. Print the square matrix.
13. Define the `calculateBoundarySum` method.
14. Initialize the sum variable to 0.
15. Loop through and add the top row elements to sum.
16. Loop through and add the right column elements to sum.
17. Loop through and add the bottom row elements to sum.
18. Loop through and add the left column elements to sum.
19. Return the sum from `calculateBoundarySum`.
20. Print the sum of all boundary elements.
21. End
 */
import java.util.Scanner;

public class BoundaryElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the order of the square matrix: ");
        int order = scanner.nextInt();
        int[][] matrix = new int[order][order];
        
        System.out.println("Enter the boundary elements of the square matrix:");
        
        System.out.print("Top row: ");
        for (int i = 0; i < order; i++) {
            matrix[0][i] = scanner.nextInt();
        }
        System.out.print("Right column (excluding first and last elements): ");
        for (int i = 1; i < order - 1; i++) {
            matrix[i][order - 1] = scanner.nextInt();
        }
        System.out.print("Bottom row (in reverse order): ");
        for (int i = order - 1; i >= 0; i--) {
            matrix[order - 1][i] = scanner.nextInt();
        }
        System.out.print("Left column (excluding first and last elements, in reverse order): ");
        for (int i = order - 2; i > 0; i--) {
            matrix[i][0] = scanner.nextInt();
        }
        System.out.println("Square Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int boundarySum = calculateBoundarySum(matrix, order);
        System.out.println("Sum of all boundary elements: " + boundarySum);
    }
    public static int calculateBoundarySum(int[][] matrix, int order) {
        int sum = 0;
        for (int i = 0; i < order; i++) {
            sum += matrix[0][i];
        }
        for (int i = 1; i < order - 1; i++) {
            sum += matrix[i][order - 1];
        }
        for (int i = 0; i < order; i++) {
            sum += matrix[order - 1][i];
        }
        for (int i = 1; i < order - 1; i++) {
            sum += matrix[i][0];
        }
        return sum;
    }
}
