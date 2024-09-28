package DDA;
/**
 Question 8:
A class Shift contains a two dimensional integer array of order (m×n) where the maximum 
values of both m and n is 5. Design the class Shift to shuffle the matrix (i.e. the first row 
becomes the last, the second row becomes the first and so on). The details of the members 
of the class are given below:
Class name                                                                                                                      :Shift
Data member/instance variable:
mat[ ][ ]                                                                        : stores the array element
m                                                                                 : integer to store the number of rows
n                                                                                 :  integer to store the number of columns
Member functions/methods:
Shift(int mm, int nn )                                       : parameterized constructor to initialize the data                        
                                                                       members m = mm and n = nn
void input( )                                                    : enters the elements of the array
void cyclic(Shift P)                                         : enables the matrix of the object(P) to shift each  
                                                                       row upwards in a cyclic manner and store the 
                                                                       resultant matrix in the current object
void display( )                                                : displays the matrix elements

Specify the class Shift giving details of the constructor( ), void input( ), void cyclic(Shift)
and void display( ). Define the main( ) function to create an object and call the methods 
accordingly to enable the task of shifting the array elements.
Algorithm
1.	Start
2.	Declare a class Shift containing two integer variables m, n, a 2D array mat[][], and a static Scanner object sc.
3.	Create a constructor Shift(int mm, int nn) that initializes the matrix dimensions m and n and allocates memory for the 2D array mat[][].
4.	Define a method input() to take input from the user.
5.	In the input() method, print the prompt "Enter elements:".
6.	Use a nested loop to iterate over the matrix and input values from the user using the Scanner object.
7.	Define a method display() to print the matrix.
8.	In the display() method, use a nested loop to print each element of the matrix.
9.	Print the elements of each row on a new line, using a tab (\t) to separate them.
10.	Define a method cyclic(Shift P) to perform a cyclic shift of matrix elements from the matrix P.
11.	Use a nested loop in the cyclic() method to iterate over the elements of the matrix.
12.	For each element, check if the current row index i is not the first row (i != 0).
13.	If i != 0, move the element P.mat[i][j] from the current row i to the previous row i-1.
14.	If i == 0, move the element P.mat[0][j] from the first row to the last row m-1.
15.	In the main() method, create two instances x and y of the Shift class with dimensions 3x4.
16.	Call the input() method on object x to input the elements of matrix X.
17.	Print "Performing cyclic shift..." to indicate the start of the shifting operation.
18.	Call the cyclic() method on object y, passing x as an argument to perform the cyclic shift of matrix X.
19.	Print "Matrix X after input:" and call display() on object x to display the elements of matrix X
20.	End.
 */
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
