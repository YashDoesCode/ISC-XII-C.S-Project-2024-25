package StringBased.TheoryPaper;

import java.util.Scanner;

public class Trans {

    int[][] arr;
    int m;

    public Trans(int mm) {
        m = mm;
        arr = new int[m][m];
    }

    public void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void transpose() {
        int[][] transposed = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        arr = transposed;
    }

    public void display() {
        System.out.println("Original matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        transpose();

        System.out.println("Transposed matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        Trans matrix = new Trans(size);
        matrix.fillArray();
        matrix.display();
    }
}
