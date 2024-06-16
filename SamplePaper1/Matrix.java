package SamplePaper1;

/*import java.util.Scanner;

public class Matrix {
    static int m, n;
    static int M[][];

    public static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order of the Matrix[M][N] (M > 2 & N >= 2, both < 10):\nEnter order of M: ");
        m = scanner.nextInt();
        System.out.println("Enter order of N: ");
        n = scanner.nextInt();
        if (m <= 2 || m >= 10 || n < 2 || n >= 10) {
            System.out.println("ERROR");
            System.exit(0);
        }
        System.out.println("Enter elements in the Array: ");
        M = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = scanner.nextInt();
            }
        }
    }

    public static void display() {
        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Rotated Matrix (270? Anticlockwise): ");
        rotate270Deg();
    }

    public static void rotate270Deg() {
        int[][] rotated = new int[n][m];  // Rotated matrix dimensions are switched

        // Perform the 270 degrees rotation
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[n - j - 1][i] = M[i][j];
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rotated[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sum() {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ext = M[i][j];
                if (ext % 2 != 0) {
                    sum += ext;
                }
            }
        }
        System.out.println("Sum of the odd elements = " + sum);
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.input();
        obj.display();
        obj.sum();
    }
}
*/