package DDA;

/**
 Question 6 : 
Write a Program to declare a matrix A[ ][ ] of order (M*N) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 10. Allow the user to input integers into this matrix. Display appropriate error message for an invalid input.
Perform the following tasks on the matrix.
1.	Display the input matrix.
2.	Rotate the matrix by 270? degrees anticlockwise and display the resultant matrix.
3.	Calculate the sum of the odd elements of the matrix and display.
Test your program for the following data and some random data:
Example 1?
INPUT: M=3
       N=4
       ENTER ELEMENTS: 8, 7, 9, 3, -2, 0, 4, 5, 1, 3, 6, -4
       
OUTPUT: ORIGINAL MATRIX
        

8	15	9	18
9	10	7	6
10	8	11	13
12	16	17	19
ROTATED MATRIX (270? ANTI-CLOCKWISE)
1	-2	8
3	0	7
6	4	9
-4	5	3
SUM OF THE ODD ELEMENTS =28
Example 2?
INPUT: M=3
       N=2
       ENTER ELEMENTS: 9, 13, 41, 5, 6, -5
       
OUTPUT: ORIGINAL MATRIX
        

9	13	41
5	6	-5
ROTATED MATRIX (270? ANTI-CLOCKWISE)
5	9
6	13
-5	41
SUM OF THE ODD ELEMENTS =63
Example 3?
INPUT: M=2
       N=10
OUTPUT: INVALID INPUT
Algorithm
1.	Start
2.	Import java.util.Scanner.
3.	Define Matrix class.
4.	Initialize Scanner object.
5.	Prompt for and read the number of rows (m).
6.	Prompt for and read the number of columns (n).
7.	Check if m or n are outside the range 3 to 9.
8.	Print invalid input message and return if out of range.
9.	Declare 2D array matrix with size m by n.
10.	Prompt user to enter matrix elements.
11.	Loop through matrix to read elements from input.
12.	Print "Original matrix:" and display it using displayMatrix method.
13.	Call rotateMatrixClockwise to get rotated matrix.
14.	Print "Rotated matrix (90 degrees clockwise):" and display rotated matrix.
15.	Call calculateOddSum to get the sum of odd elements.
16.	Define displayMatrix method to print matrix.
17.	Define rotateMatrixClockwise method to rotate matrix 90 degrees.
18.	Define calculateOddSum method to sum odd elements in matrix.
19.	End
 */
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        if (m <= 2 || n <= 2 || m >= 10 || n >= 10) {
            System.out.println("Invalid input. Rows and columns must be between 3 and 9.");
            return;
        }
        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original matrix:");
        displayMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrixClockwise(matrix);
        System.out.println("Rotated matrix (270 Degree Anti-clockwise):");
        displayMatrix(rotatedMatrix);

        int oddSum = calculateOddSum(matrix);
        System.out.println("Sum of odd elements: " + oddSum);
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotated = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
    public static int calculateOddSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element % 2 != 0) {
                    sum += element;
                }
            }
        }
        return sum;
    }
}

