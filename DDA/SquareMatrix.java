package DDA;
/**
# Question 6:

Declare a Square Matrix A[][] of order m*m where ‘m’ is the number of rows and the number of columns, such that M must be greater than 2 and lesser than 10. Accept the value of M from the user. Display an appropriate message for an Invalid input. Allow the user to to input integers into this matrix, perform :

1. Display the Original Matrix
2. Rotate the Matrix by 90 Degrees
3. Find the sum of the elements of the four corners of the matrix.

Example

INPUT: m=3

Original Matrix

| 1 | 2 | 3 |
| --- | --- | --- |
| 6 | 5 | 4 |
| 7 | 8 | 9 |

Rotated Matrix

| 3 | 4 | 9 |
| --- | --- | --- |
| 2 | 5 | 8 |
| 1 | 6 | 7 |

Example 2

INPUT: m=4

Original Matrix

| 1 | 2 | 4 | 9 |
| --- | --- | --- | --- |
| 2 | 5 | 8 | 3 |
| 1 | 6 | 7 | 4 |
| 3 | 7 | 6 | 5 |

Rotated Matrix

| 3 | 1 | 2 | 1 |
| --- | --- | --- | --- |
| 7 | 6 | 5 | 2 |
| 6 | 7 | 8 | 4 |
| 5 | 4 | 3 | 9 |

Algorithm

1. Start
2. Import `java.util.Scanner`
3. Define `SquareMatrix` class
4. Declare `a`, `b`, `r`, `c` as static variables
5. Define constructor to initialize arrays
6. Define `fillArray` method to populate `a`
7. Use nested loops to read input and fill `a`
8. Define `rotate90DegClock` method to rotate `a` and store it in `b`
9. Use nested loops to rotate `a` and assign to `b`
10. Define `displayOriginalArray` method to print elements of `a`
11. Use nested loops to print elements of `a`
12. Define `displayRotatedArray` method to print elements of `b`
13. Use nested loops to print elements of `b`
14. Define `main` method
15. Create `Scanner` object to read input
16. Prompt user to enter rows and columns
17. Create `SquareMatrix` object with user input
18. Call `fillArray`, `displayOriginalArray`, `rotate90DegClock`, and `displayRotatedArray` methods
19. Display original and rotated matrices
20. End
 */
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
