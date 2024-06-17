package StringBased.TheoryPaper;
/**
# Question 13:

A class Trans is defined to find the transpose of a square matrix. A transpose of a matrix
is obtained by interchanging the elements of the rows and columns.
Example: If size of the matrix = 3, then

|  |     Original |  |
| --- | --- | --- |
| 11 | 5 | 7 |
| 8 | 13 | 9 |
| 1 | 6 | 20 |

|  |     Transpose |  |
| --- | --- | --- |
| 11 | 8 | 1 |
| 5 | 13 | 6 |
| 7 | 9 | 20 |

Some of the members of the class are given below:

Class name: Trans
Data members/instance variables:**

arr[][] : to store integers in the matrix
m : integer to store the size of the matrix 

Method/Memeber Functions

Trans(int mm) : parameterised constructor to initialise the data member m = mm
void fillarray() : to enter integer elements in the matrix
void transpose() : to create the transpose of the given matrix
void display() : displays the original matrix and the transposed matrix by invoking the method transpose()

Specify the class Trans giving details of the constructor( ), void fillarray( ),
void transpose() and void display(). Define a main() function to create an object and
call the functions accordingly to enable the task.

Algorithm

1. Start.
2. Define the `Trans` class with instance variables `arr` (2D array) and `m` (integer).
3. Define a parameterized constructor `Trans(int mm)` to initialize `m` and `arr`.
4. Define `fillArray()` method.
5. Create a `Scanner` object in `fillArray()`.
6. Prompt user to enter matrix elements.
7. Use nested loops to read and store elements in `arr`.
8. Define `transpose()` method.
9. Create a new 2D array `transposed` of size `m x m`.
10. Use nested loops to transpose elements from `arr` to `transposed`.
11. Assign `transposed` to `arr`.
12. Define `display()` method.
13. Print "Original matrix:".
14. Use nested loops to print elements of `arr`.
15. Call `transpose()` method.
16. Print "Transposed matrix:".
17. Use nested loops to print elements of `arr`.
18. Define `main` method.
19. Create `Scanner` object in `main`.
20. Prompt user for matrix size, create `Trans` instance, call `fillArray()`, and call `display()`. 
21. End.
 */
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
