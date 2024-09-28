package DDA;

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

