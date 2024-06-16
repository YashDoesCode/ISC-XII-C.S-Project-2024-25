package DDA;

import java.util.Scanner;

public class SquareMatrix {
    int[][] a;
    int[][] b;
    int r, c;

    public SquareMatrix(int x, int y) {
        r = x;
        c = y;
        a = new int[r][c];
        b = new int[c][r];
    }
    public void fillArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements for the original matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = input.nextInt();
            }
        }
    }
    public void rotate90DegClock() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[j][r - 1 - i] = a[i][j];
            }
        }
    }
    public void displayOriginalArray() {
        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void displayRotatedArray() {
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void sumOfCornerElements() {
        if (r < 2 || c < 2) {
            System.out.println("Matrix is too small to have corner elements.");
            return;
        }

        int sum = a[0][0] + a[0][c-1] + a[r-1][0] + a[r-1][c-1];
        System.out.println("Sum of corner elements: " + sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        SquareMatrix matrix = new SquareMatrix(rows, cols);

        matrix.fillArray();
        matrix.displayOriginalArray();

        System.out.println("Rotated 90 degrees clockwise:");
        matrix.rotate90DegClock();
        matrix.displayRotatedArray();

        matrix.sumOfCornerElements();
    }
}
