package DDA;

/**
Question 5: 
Write a program to declare a square matrix M[][] of order 'N'. Check if the matrix is Doubly Markov matrix or not. A matrix which satisfies the following conditions are Doubly Markov matrix

(i)      All elements are greater than or equal to 0
(ii)     Sum of each row is equal to 1
(iii)    Sum of each column is equal to 1

Accept 'N' from the user where 3<=N<=9. Display an appropriate error message if 'N' is not in the given range or the entered numbers are negative. Allow the user to create a matrix and check whether the created matrix is a Doubly Markov matrix or not

Test your program for the following data and some random data:

Example 1
Input: N=3
       Enter elements in the matrix: 0,5,0.25,0.25,.25,0.75,0.0,0.25,0.0,0.75
Output: FORMED MATRIX
       0.5   0.25    0.25
       0.25  0.75    0.0
       0.25  0.0     0.75
IT IS A DOUBLY MARKOV MATRIX

Example 2
Input: N=3
       Enter elements in the matrix: 1.5,3,0.15,0.25,4,1.0,0.25,1.0,3
Output: FORMED MATRIX
        1.5  3   0.15
        0.25 4   1.0
        0.25 1.0 3
IT IS NOT A DOUBLY MARKOV MATRIX

Example 3
Input: N=2
       Enter elements in the matrix: 0.8,-4.0,0.9,3.5
Output: NEGATIVE NUMBERS ENTERED. INVALID ENTRY

Example 4
Input: N=12
Output: SIZE IS OUT OF RANGE. INVALID ENTRY

Algorithm
1.	Start.
2.	Declare a class DoublyMarkov.
3.	Declare a 2D array m of type double and an integer n.
4.	Create a method input().
5.	Create a Scanner object as for user input.
6.	Print "Enter size of array: ".
7.	Read the integer input size using as.nextInt().
8.	Assign size to n.
9.	If n is between 3 and 9, initialize m as a 2D array of size n x n.
10.	Print "Enter n*n Elements: ".
11.	Loop i from 0 to n-1 to read matrix elements.
12.	Loop j from 0 to n-1 and read m[i][j] using as.nextDouble().
13.	Create a method element() to check for negative values.
14.	Loop through matrix to set flag f if any element is negative.
15.	Return true if no negative values are found; otherwise return false.
16.	Create a method sumrow() to check if row sums equal 1.
17.	Loop through rows to set flag t if any row sum is not equal to 1.
18.	Create a method sumcolumn() to check if column sums equal 1.
19.	Print the matrix in the display() method and check conditions.
20.	Call main() to create an object, invoke input(), and display() methods.
21.	 End
 */
import java.util.Scanner;

public class DoublyMarkov
{   
    double m[][];
    int n;
    
    public void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = as.nextInt();
        n = size;
        if (n >= 3 && n <= 9)
        {
            m = new double[n][n];
            System.out.println("Enter " + (n * n) + " Elements: ");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    m[i][j] = as.nextDouble();
            }
        }
        else
            System.out.println("Invalid Input");
    }
    
    public boolean element()
    {  
        int f = 0;
        for (int i = 0; i < n; i++)
        { 
            int t = 0;
            for (int j = 0; j < n; j++)
            {
                if (m[i][j] < 0)
                {
                    t = 1;
                    break;
                }
            }
            if (t == 1)
            {
                f = 1;
                break;
            }
        }
        if (f == 0)
            return true;
        else
            return false;
    }
    
    public boolean sumrow()
    { 
        int t = 0;
        for (int i = 0; i < n; i++)
        { 
            double s = 0;
            for (int j = 0; j < n; j++)
            {
                s = s + m[i][j];
            }
            if (s != 1)
            {
                t = 1;
                break;
            }
        }
        if (t == 0)
            return true;
        else
            return false;
    }
    
    public boolean sumcolumn()
    { 
        int t = 0;
        for (int i = 0; i < n; i++)
        { 
            double s = 0;
            for (int j = 0; j < n; j++)
            {
                s = s + m[j][i];
            }
            if (s != 1)
            {
                t = 1;
                break;
            }
        }
        if (t == 0)
            return true;
        else
            return false;
    }
    
    public void display()
    {
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        if (element() && sumrow() && sumcolumn())
        {
            System.out.println("Doubly Markov Matrix");
        }
        else
        {
            System.out.println("Not a Doubly Markov Matrix");
        }
    }
    
    public static void main()
    {
        DoublyMarkov obj = new DoublyMarkov();
        obj.input();
        obj.display();
    }
}
