package DDA;

import java.util.Scanner;

public class Shift {
    static Scanner sc = new Scanner(System.in);
    int mat[][];
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }
    }

    void cyclic(Shift P) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != 0) {
                    mat[i - 1][j] = P.mat[i][j];
                } else {
                    mat[m - 1][j] = P.mat[0][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Shift x = new Shift(3, 4);
        Shift y = new Shift(3, 4);

        System.out.println("Input matrix X:");
        x.input();

        System.out.println("Performing cyclic shift...");
        y.cyclic(x);

        System.out.println("\nMatrix X after input:");
        x.display();

        System.out.println("\nMatrix Y after cyclic shift:");
        y.display();
    }
}
