package DDA;

import java.util.Scanner;

public class BoundaryElements{
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
    }
}
