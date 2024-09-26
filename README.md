# ISCXII-CSProject2024-25
![image](https://github.com/YashDoesCode/XII-C.S-Project-2024-25/assets/169293586/530d8252-e827-4019-b2e7-2aaacb406fa6)


Acknowledgment

This is to inform you that I, Yash Srivastava, of Class XII-A, have completed my Computer Science project. Project work is an excellent way of learning by doing, and I learned a lot while working on this project. This project contains 30 programs, and each program includes an algorithm, program code, variable description table, and an output screen.

I would like to thank my teacher, Mr. Saurabh Singh Chauhan, under whose guidance I successfully completed this project. I am grateful for his expert advice, motivation, and suggestions during the preparation of this project. Finally, I would like to thank my family members and friends who supported me in completing this project.


______________                                         _____________               
Teacher’s Signature                                                Student’s Signature


______________                                        _____________
Examiner’s Signature                                             Principal’s Signature
Question 1 : 
Write a code in Java to create a class named “MaxMinAvgArray” and perform the following functions as listed below :
Take input of the Array length and its elements from the user using Scanner class.
Sort the Array in Ascending order using bubble sort technique only.
Then from the sorted Array, Find :
Greatest valued integer in the Array.
Least valued integer in the Array.
Average value of all the integer elements stored in the Array.
Write the main method as well and call all the objects, print greatest, lowest and average asked above.
Algorithm
Start
Import the Scanner class and define the MaxMinAvgArray class.
Declare a public integer array variable called ‘array’.
Create a constructor that assigns the input array to ‘array’.
Implement a ‘bubbleSort()’ method.
Initialize a Boolean variable ‘temp’.
Iterate over the array, swapping adjacent elements if necessary.
Define ‘findMax()’ and ‘findMin()’ methods.
Initialize ‘max’ and ‘min’ variables.
Iterate over the array, updating ‘max’ and ‘min’.
Implement ‘calculateAverage()’ method.
Initialize ‘sum’ and iterate over the array, adding elements.
Return the average as a double.
Define ‘printArray()’ method to print array elements.
Create a Scanner object and read the array size.
Read integers for the array.
Create a MaxMinAvgArray object.
Sort the array using bubble sort technique.
Find max, min, average and print the result.
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
array
int[]
Array of integers to be processed.
2
n
int
Length of the array.
3
temp
boolean
Flag to check if any swapping occurred during sorting.
4
i
int
Loop counter for outer loop in sorting and array input.
5
j
int
Loop counter for inner loop in sorting.
6
swap
int
Temporary variable to hold value during swapping.
7
max
int
Variable to store the maximum value in the array.
8
min
int
Variable to store the minimum value in the array.
9
num
int
Loop variable to iterate through the array.
10
sum
int
Variable to store the sum of array elements.
11
average
double
Variable to store the average value of array elements.
14
n
int
Number of elements in the array, input by user.

Program
import java.util.Scanner;

class MaxMinAvgArray {
    int[] array;

    MaxMinAvgArray(int[] array) {
        this.array = array;
    }

    void bubbleSort() {
        int n = array.length;
        boolean temp;
        for (int i = 0; i < n - 1; i++) {
            temp = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    temp = true;
                }
            }
            if (!temp) break;
        }
    }

    int findMax() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    double calculateAverage() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        MaxMinAvgArray obj = new MaxMinAvgArray(array);

        System.out.println("Unsorted array:");
        obj.printArray();

        obj.bubbleSort();

        System.out.println("Sorted array:");
        obj.printArray();

        int max = obj.findMax();
        int min = obj.findMin();
        double average = obj.calculateAverage();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);
    }
}


Terminal Output


Question 2: 
Write a program that inputs the names of people into 2 different arrays, 'a' and 'b'. Array 'a' has N names while array 'b' has M names, with no duplicates in either of them. Merge the array 'a' and 'b' such that the resultant array is sorted alphabetically. Display all 3 arrays sorted alphabetically.
Algorithm
Start.
Declare a class Names.
Declare string arrays a[], b[] and integers n, m.
Create a constructor Names(int mm, int nn) to initialize n and m.
Initialize arrays a and b with sizes n and m.
Create a method input() for user input.
Create a Scanner object as for input.
Print "Enter names for array 'A'".
Loop i from 0 to n-1 to read names into array a[].
Print "Enter names for array 'B'".
Loop i from 0 to m-1 to read names into array b[].
Close the Scanner object.
Create a method merge(String arr1[], String arr2[]).
Initialize a new array c[] of size m+n.
Use index variables k, i, and j to merge arr1 and arr2 into c[].
Create a method sort(String arr[]) to sort the merged array.
Implement bubble sort to sort the elements of array arr[].
Create methods display1(), display2(), and display3(String c[]) to print arrays.
Call input(), merge(), sort(), and display methods.
End.
Variable Description Table

Sr No.
Variable Name
Datatype
Description
1
a
String[]
Array to store names for the first group
2
b
String[]
Array to store names for the second group
3
n
int
Size of the first array
4
m
int
Size of the second array
5
size
int
Temporary variable to store user-input size
6
c
String[]
Array to store merged names from arrays a and b
7
k
int
Index for merged array c
8
i
int
Index for traversing array a
9
j
int
Index for traversing array b
10
t
String
Temporary variable for swapping during sorting
11
l
int
Length of the array for display purposes


Program
import java.util.*;

public class Names {
    public String a[], b[];
    public int n, m;

    public Names(int mm, int nn) {
        n = nn;
        m = mm;
        a = new String[n];
        b = new String[m];
    }

    public void input() {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter names for array \"A\"");
        for (int i = 0; i < n; i++)
            a[i] = as.nextLine();

        System.out.println("Enter names for array \"B\"");
        for (int i = 0; i < m; i++)
            b[i] = as.nextLine();

        as.close();
    }

    public String[] merge(String arr1[], String arr2[]) {
        String c[] = new String[m + n];
        int k = 0, i = 0, j = 0;

        while (i < n)
            c[k++] = arr1[i++];

        while (j < m)
            c[k++] = arr2[j++];

        return c;
    }

    public void sort(String arr[]) {
        String t = "";
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    public void display1() {
        int l = a.length;
        System.out.println("Names in 1st Array: ");
        for (int i = 0; i < l; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public void display2() {
        int l = b.length;
        System.out.println("Names in 2nd Array: ");
        for (int i = 0; i < l; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }

    public void display3(String c[]) {
        int l = c.length;
        System.out.println("Names in Merged Array: ");
        for (int i = 0; i < l; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter size of array A and B : ");
        Names obj = new Names(as.nextInt(), as.nextInt());

        obj.input();
        String c[] = obj.merge(obj.a, obj.b);
        obj.sort(c);

        obj.display1();
        obj.display2();
        obj.display3(c);
    }
}



Terminal Output


Question 3: 
WAP to input the choice of sorting technique from the user (Bubble sort, Selection Sort, Insertion sort), initialize a SDA of 10 integers and sort them in ascending order using the selected technique.
Algorithm
Start
Define a class Sorting.
Declare an integer array arr and an integer l for the array size.
Create a constructor Sorting(int n) to initialize l and allocate memory for arr.
Define the method input() to read user input.
Inside input(), create a Scanner object.
Prompt the user to enter array elements.
Use a loop to read l integers into arr.
Define the method bubbleSort() for bubble sorting.
Use nested loops in bubbleSort() to compare and swap elements.
Define the method insertionSort() for insertion sorting.
In insertionSort(), loop through the array to insert elements in the correct position.
Define the method selectionSort() for selection sorting.
In selectionSort(), find and swap the minimum element with the first unsorted element.
Define the method display() to print the sorted array.
In display(), print "Sorted Array:" and loop to print each element.
Define the main() method as the entry point.
Inside main(), create a Scanner object and read the size of the array.
Call input(), display sorting options, and read the user's choice.
Based on the choice, call the corresponding sorting method and display the sorted array. End.
Variable Description Table
Sr No.
Variable Name
Data Type
Description
1
arr
int[]
Array to hold the integers entered by the user.
2
l
int
Size of the array (number of elements).
3
as
Scanner
Scanner object for reading user input.
4
n
int
Size of the array entered by the user in main().
5
t
int
Temporary variable used for swapping in sorting methods.
6
i
int
Loop index for iterating through the array.
7
j
int
Loop index for nested loops in sorting methods.
8
min
int
Index of the minimum element found during selection sort.

Program
import java.util.*;

public class Sorting 
{
    int arr[],l;
    Sorting(int n)
    {
        l = n;
        arr = new int[l];
    }
    public void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i<l; i++)
            arr[i] = as.nextInt();
    }
    public void bubbleSort()
    {
        int t=0;
        for (int i=1; i<l; i++)
        {
            for (int j=0; j<l-i; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public void insertionSort()
    {
        for(int i=1; i<l; i++)
        {
            int j = i-1;
            int t = arr[i];
            while(j>=0 && t<=arr[j])
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = t;
        }
    }
    public void selectionSort()
    {
        int min=0,t=0;
        for(int i=0; i<l-1; i++)
        {   min = i;
            for(int j=i+1; j<l; j++)
            {
                 if(arr[j]<arr[min])
                  min = j;   
            }
            t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }
    public void display()
    {
        System.out.println("Sorted Array:");
        for(int i = 0; i<l; i++)
        System.out.print(arr[i] + " ");
    }
    public static void main() 
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = as.nextInt();
        Sorting obj = new Sorting(n);
        obj.input();
        System.out.println("Choose Sorting Technique: ");
        System.out.println("1. Bubble Sort ");
        System.out.println("2. Insertion Sort ");
        System.out.println("3. Selection Sort ");
        int ch = as.nextInt();
        switch(ch)
        {
            case 1: 
                obj.bubbleSort();
            break;
            case 2: 
                obj.insertionSort();
            break;
            case 3: 
                obj.selectionSort();
            break;
            default:
            System.out.println("Invalid Choice");
        }
        obj.display();
    }
}


Terminal Output


Question 4: 
Write a program in java to create a class “Rotate” and display the mirrored image of a 2D-array of m*n matrix.
Example
INPUT: n=4
Original Array : 
8
15
9
18
9
10
7
6
10
8
11
13
12
16
17
19


Modified Array : 
18
9
15
8
6
7
10
9
13
11
8
10
19
17
16
12








Algorithm
Start.
Import java.util.Scanner.
Define Display(int[][] arr) to print a 2D array.
Define arrMirrorer(int[][] arr) to create a mirror image of the array.
Inside Display, loop through rows and columns of arr.
Print each element followed by a tab and a new line after each row.
Inside arrMirrorer, initialize n as the length of arr.
Create a new 2D array ModdedArray of size n x n.
Loop through rows and columns of arr.
Assign ModdedArray[i][j] to arr[i][n - j - 1] to mirror horizontally.
Return ModdedArray.
Define main method.
Create a Scanner object for input.
Prompt and read integer n as the size of the array.
Create a 2D array arr of size n x n.
Prompt user to enter elements of the array.
Loop through rows and columns to read and store input in arr.
Print "Original array:" and call Display(arr).
Create ModdedArray by calling arrMirrorer(arr).
Print "Modified array:" and call Display(ModdedArray).
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
arr
int[][]
Original 2D array
2
n
int
Size of the 2D array (number of rows/cols)
3
ModdedArray
int[][]
Mirrored version of the original 2D array
4
i
int
Loop counter for rows
5
j
int
Loop counter for columns

Program
import java.util.Scanner;

public class Rotate {
    static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\\t");
            }
            System.out.println();
        }
    }
    static int[][] arrMirrorer(int[][] arr) {
        int n = arr.length;
        int[][] ModdedArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ModdedArray[i][j] = arr[i][n - j - 1];
            }
        }
        return ModdedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        
        System.out.println("Enter the elenents of the arr:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original arr:");
        Display(arr);

        int[][] ModdedArray = arrMirrorer(arr);
        System.out.println("Modified arr:");
        Display(ModdedArray);
    }
}


Terminal Output


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
Start.
Declare a class DoublyMarkov.
Declare a 2D array m of type double and an integer n.
Create a method input().
Create a Scanner object as for user input.
Print "Enter size of array: ".
Read the integer input size using as.nextInt().
Assign size to n.
If n is between 3 and 9, initialize m as a 2D array of size n x n.
Print "Enter n*n Elements: ".
Loop i from 0 to n-1 to read matrix elements.
Loop j from 0 to n-1 and read m[i][j] using as.nextDouble().
Create a method element() to check for negative values.
Loop through matrix to set flag f if any element is negative.
Return true if no negative values are found; otherwise return false.
Create a method sumrow() to check if row sums equal 1.
Loop through rows to set flag t if any row sum is not equal to 1.
Create a method sumcolumn() to check if column sums equal 1.
Print the matrix in the display() method and check conditions.
Call main() to create an object, invoke input(), and display() methods.
 End
Variable Description Table

Sr No.
Variable Name
Datatype
Description
1
m
double[][]
2D array to store the matrix elements
2
n
int
Size of the matrix
3
as
Scanner
Scanner object for user input
4
size
int
User-defined size for the matrix
5
i
int
Loop variable for rows in the matrix
6
j
int
Loop variable for columns in the matrix
7
f
int
Flag to check for negative elements
8
t
int
Flag for checking negative values in rows
9
s
double
Sum of elements in a row or column


Program
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




Terminal Output


Question 6 : 
Write a Program to declare a matrix A[ ][ ] of order (M*N) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 10. Allow the user to input integers into this matrix. Display appropriate error message for an invalid input.
Perform the following tasks on the matrix.
Display the input matrix.
Rotate the matrix by 270⁰ degrees anticlockwise and display the resultant matrix.
Calculate the sum of the odd elements of the matrix and display.
Test your program for the following data and some random data:
Example 1→
INPUT: M=3
       N=4
       ENTER ELEMENTS: 8, 7, 9, 3, -2, 0, 4, 5, 1, 3, 6, -4
       
OUTPUT: ORIGINAL MATRIX
        

8
15
9
18
9
10
7
6
10
8
11
13
12
16
17
19

ROTATED MATRIX (270⁰ ANTI-CLOCKWISE)
1
-2
8
3
0
7
6
4
9
-4
5
3

SUM OF THE ODD ELEMENTS =28
Example 2→
INPUT: M=3
       N=2
       ENTER ELEMENTS: 9, 13, 41, 5, 6, -5
       
OUTPUT: ORIGINAL MATRIX
        

9
13
41
5
6
-5

ROTATED MATRIX (270⁰ ANTI-CLOCKWISE)
5
9
6
13
-5
41

SUM OF THE ODD ELEMENTS =63
Example 3→
INPUT: M=2
       N=10
OUTPUT: INVALID INPUT
Algorithm
Start
Import java.util.Scanner.
Define Matrix class.
Initialize Scanner object.
Prompt for and read the number of rows (m).
Prompt for and read the number of columns (n).
Check if m or n are outside the range 3 to 9.
Print invalid input message and return if out of range.
Declare 2D array matrix with size m by n.
Prompt user to enter matrix elements.
Loop through matrix to read elements from input.
Print "Original matrix:" and display it using displayMatrix method.
Call rotateMatrixClockwise to get rotated matrix.
Print "Rotated matrix (90 degrees clockwise):" and display rotated matrix.
Call calculateOddSum to get the sum of odd elements.
Define displayMatrix method to print matrix.
Define rotateMatrixClockwise method to rotate matrix 90 degrees.
Define calculateOddSum method to sum odd elements in matrix.
End
Program
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


Terminal Output



Question 7:
Write a program in java to create a class “MirrorImage” and display the mirrored image of a 2D-array of m*n matrix.
Example
INPUT: n=4
Original Array:

8
15
9
18
9
10
7
6
10
8
11
13
12
16
17
19

Modified Array:
18
9
15
8
6
7
10
9
13
11
8
10
19
17
16
12

Algorithm
Start.
Import java.util.Scanner.
Define Display(int[][] arr) to print a 2D array.
Define arrMirrorer(int[][] arr) to create a mirror image of the array.
Inside Display, loop through rows and columns of arr.
Print each element followed by a tab and a new line after each row.
Inside arrMirrorer, initialize n as the length of arr.
Create a new 2D array ModdedArray of size n x n.
Loop through rows and columns of arr.
Assign ModdedArray[i][j] to arr[i][n - j - 1] to mirror horizontally.
Return ModdedArray.
Define main method.
Create a Scanner object for input.
Prompt and read integer n as the size of the array.
Create a 2D array arr of size n x n.
Prompt user to enter elements of the array.
Loop through rows and columns to read and store input in arr.
Print "Original array:" and call Display(arr).
Create ModdedArray by calling arrMirrorer(arr).
Print "Modified array:" and call Display(ModdedArray).
End
Variable Description Table

Sr No.
Variable Name
Datatype
Description
1
arr
int[][]
Original 2D array
2
n
int
Size of the 2D array (number of rows/cols)
3
ModdedArray
int[][]
Mirrored version of the original 2D array
4
i
int
Loop counter for rows
5
j
int
Loop counter for columns


Program
import java.util.Scanner;

public class MirrorInage {
    static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int[][] arrMirrorer(int[][] arr) {
        int n = arr.length;
        int[][] ModdedArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ModdedArray[i][j] = arr[i][n - j - 1];
            }
        }
        return ModdedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        
        System.out.println("Enter the elements of the arr:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original arr:");
        Display(arr);

        int[][] ModdedArray = arrMirrorer(arr);
        System.out.println("Modified arr:");
        Display(ModdedArray);
    }
}

Terminal Output


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
Start
Declare a class Shift containing two integer variables m, n, a 2D array mat[][], and a static Scanner object sc.
Create a constructor Shift(int mm, int nn) that initializes the matrix dimensions m and n and allocates memory for the 2D array mat[][].
Define a method input() to take input from the user.
In the input() method, print the prompt "Enter elements:".
Use a nested loop to iterate over the matrix and input values from the user using the Scanner object.
Define a method display() to print the matrix.
In the display() method, use a nested loop to print each element of the matrix.
Print the elements of each row on a new line, using a tab (\t) to separate them.
Define a method cyclic(Shift P) to perform a cyclic shift of matrix elements from the matrix P.
Use a nested loop in the cyclic() method to iterate over the elements of the matrix.
For each element, check if the current row index i is not the first row (i != 0).
If i != 0, move the element P.mat[i][j] from the current row i to the previous row i-1.
If i == 0, move the element P.mat[0][j] from the first row to the last row m-1.
In the main() method, create two instances x and y of the Shift class with dimensions 3x4.
Call the input() method on object x to input the elements of matrix X.
Print "Performing cyclic shift..." to indicate the start of the shifting operation.
Call the cyclic() method on object y, passing x as an argument to perform the cyclic shift of matrix X.
Print "Matrix X after input:" and call display() on object x to display the elements of matrix X
End.
Variable Description Table
Variable Name
Datatype
Description
mat
int[][]
2D array used to store the elements of the matrix.
m
int
Stores the number of rows in the matrix.
n
int
Stores the number of columns in the matrix.
sc
Scanner
Static object of the Scanner class used to take input from the user.
mm
int
Parameter passed to the constructor to set the number of rows (m).
nn
int
Parameter passed to the constructor to set the number of columns (n).
P
Shift
Object of the Shift class passed as an argument to perform cyclic shifts.
i
int
Loop counter used to iterate over the rows of the matrix.
j
int
Loop counter used to iterate over the columns of the matrix.
x
Shift
Object of the Shift class representing matrix X.
y
Shift
Object of the Shift class representing matrix Y after cyclic shift.


Program
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


Terminal Output



Question 9:
A class SwapSort has been defined to perform string related operations on a word input:
Class Name
Data Members/Instance Variables
Wrd                                                                                               :To store a word
Len                                                                  To store length of the word inputted
Swapwrd                                                                     :To store the swapped word
Sortwrd                                                                            :To store the sorted word
Member Functions
SwapSort()                                                            :Default constructor to initialize data 
                                                                               members with legal initial value.
void readword()                                                          :To accept a word in upper case.
void swapChar()                                                   :To swap the first and last character 
                                                                             of the word in ‘wrd’ and stores the 
                                                                             new word in “Swapwrd”
void sortword()                                                         :Sort the character of the original 
                                                                                 word in alphabetical order and 
                                                                                 stores it in ‘sortwrd’
void display()                                                     :Displays the original word, swapped 
                                                                           word and the sorted word.
Specify the class SwapSort() giving the details of the constructor, void readword(), void swapChar(), void sortword() and void display(). Define the main function to create an object and call the functions accordingly to enable the task.

Example
INPUT: HELLO
OUTPUT: Sorted Word: EHILO

Algorithm
Start.
Define class SwapSort.
Declare instance variables wrd, len, swapwrd, sortwrd.
Define default constructor SwapSort() to initialize variables.
Define method readword() to read a word from user input and convert to uppercase.
Define method swapChar() to swap first and last characters of wrd.
Check if len > 1, assign swapwrd as last char + middle + first char, else assign wrd.
Define method sortword() to sort characters of wrd.
Convert wrd to char array, sort using Arrays.sort(), convert back to String.
Define method display() to print original, swapped, and sorted words.
Print "Original Word: " followed by wrd.
Print "Swapped Word: " followed by swapwrd.
Print "Sorted Word: " followed by sortwrd.
Define main method.
Create object obj of class SwapSort.
Call readword() on obj to input and store word.
Call swapChar() on obj to swap characters.
Call sortword() on obj to sort characters.
Call display() on obj to output original, swapped, and sorted words.
End.
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
wrd
String
Original word entered by the user
2
len
int
Length of the original word
3
swapwrd
String
Word after swapping the first and last characters
4
sortwrd
String
Word after sorting its characters
5
sc
Scanner
Scanner object for user input
6
chars
char[]
Array to store characters of the original word

Program
import java.util.*;

public class SwapSort {
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    SwapSort() {
        wrd = "";
        len = 0;
        swapwrd = "";
        sortwrd = "";
    }
    void readword() {
        Scanner sc = new Scanner(System.in);
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }
    void swapChar() {
        if (len > 1) {
            swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
        } else {
            swapwrd = wrd;
        }
    }
    void sortword() {
        char[] chars = wrd.toCharArray();
        Arrays.sort(chars);
        sortwrd = new String(chars);
    }
    void display() {
        System.out.println("Original Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }
    public static void main(String[] args) {
        SwapSort obj = new SwapSort();
        obj.readword();
        obj.swapChar();
        obj.sortword();
        obj.display();
    }
}


Terminal Output



Question 10:
An encoded text can be decoded by finding the actual character for the ASCII code in the encoded message. Write a program to input an encoded text having only a sequence of ASCII values without any spaces. Any code or value which is not in the range of 65 to 90 or 97 to 97 to 122 (a-2) or 32 ( ) will be ignored and should not appear in the output message. Write a program to accept a code which contains only digits (0 to 9). Display an error message if it contains any character. Perform the following tasks :
Decode the encoded text as per the above instructions.
The first letter of each word must be changed to uppercase and remaining to lowercase.
Any consecutive sets of code 32 will be taken as only one black space.
Display it in the form of a sentence.
Example 
Input : 10665771011153266797868
Output : James Bond

Input : 667685693232837589
Output : Blue Sky

Input : 22-768#5693232375889
Output : Invalid Code

Algorithm
Start
Initialize the scanner to read input from the user.
Prompt the user to enter the encoded text.
Read the encoded text entered by the user.
Call the isValid function with the encoded text as an argument.
In isValid, loop through each character in the encoded text.
For each character in isValid, check if it's a digit (between '0' and '9').
If a character is not a digit, return false from isValid.
If all characters are digits, return true from isValid.
Check the return value of isValid.
If the return value is false, print "Invalid Code".
If the return value is true, call the Decoder function with the encoded text as an argument.
In Decoder, initialize an empty string d to store decoded output and an index i starting from 0.
While i is less than the length of the encoded text, check if three-digit substrings can be converted to ASCII characters (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to d, and increment i by 3.
If a three-digit substring does not represent a valid character, check if a two-digit substring can be converted to an ASCII character (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to d, and increment i by 2.
If neither three-digit nor two-digit substrings yield a valid character, increment i by 1.
Once all characters are processed, return the decoded string d from Decoder.
Call the Caser function with the decoded text d as an argument.
In Caser, split the decoded text into words and initialize an empty string sx to store formatted text. Loop and capitalize the first letter and finally print sx
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
s
String
Encoded text input by the user
2
c
char
Character in the string used for validation
3
d
String
Decoded string
4
i
int
Loop counter for traversing the string
5
c
int
Integer value parsed from the substring
6
st
String
Decoded string before case formatting
7
w
String[]
Array of words in the decoded string
8
sx
String
String after case formatting
9
word
String
Individual word from the array of words
10
scanner
Scanner
Scanner object for user input
11
sxt
String
Final formatted decoded string

Program
import java.util.Scanner;

public class EncoderDecoder {
    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false; 
            }
        }
        return true; 
    }
    public static String Decoder(String s) {
        String d = "";
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                int c = Integer.parseInt(s.substring(i, i + 3));
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32) {
                    d += (char) c;
                    i += 3;
                    continue;
                }
            }
            if (i + 2 <= s.length()) {
                int c = Integer.parseInt(s.substring(i, i + 2));
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32) {
                    d += (char) c;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return d;
    }
    public static String Caser(String st) {
        String[] w = st.split(" ");
        String sx = "";
        for (int i = 0; i < w.length; i++) {
            String word = w[i];
            if (word.length() > 0) {
                sx += Character.toUpperCase(word.charAt(0));
                sx += word.substring(1).toLowerCase();
                if (i < w.length - 1) {
                    sx += " "; 
                }
            }
        }
        return sx;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encoded text: ");
        String s = scanner.nextLine();
        if (!isValid(s)) {
            System.out.println("Invalid Code");
        } else {
            String d = Decoder(s);
            String sxt = Caser(d);
            System.out.println("Decoded Output: " + sxt);
        }
    }
}


Terminal Output :


Question 11: 
Write a Program in Java to accept a sentence which may be terminated by either ‘.’,’?’ or ‘!’ only. The words may be separated by more than one blank space and are in Upper case. Perform the following operations :
Find the number of words beginning and ending with a vowel.
Place the words which begin with a vowel at the beginning, followed by the remaining words as they occur in the sentence.
Example
INPUT: ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE
OUTPUT: No. of words beginning and ending with a vowel = 3
        ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL

Algorithm
Start
Import java.util.Scanner.
Define the VowelWords class.
Define the isVowel method to check if a character is a vowel.
In the isVowel method, return true if the character exists in the string "AEIOU"; otherwise, return false.
Define the countVowelWords method to count words starting and ending with vowels.
In the countVowelWords method, trim the input sentence and split it into words using whitespace as delimiter.
Initialize count to 0 for counting vowel words.
Loop through each word in the words array:
Check if the first and last characters of the word are vowels using isVowel method.
If both characters are vowels, increment count.
Return count.
Define the reorderWords method to reorder words in the sentence.
In the reorderWords method, trim the input sentence and split it into words using whitespace as delimiter.
Initialize vowels and others as empty strings for storing reordered words.
Loop through each word in the words array:
If the first character of the word is a vowel, concatenate the word with a space to vowels.
Otherwise, concatenate the word with a space to others.
Concatenate vowels and trimmed others to reorderedSentence.
Return reorderedSentence.
Define the main method to execute the program.
Create a Scanner object scanner to read user input.
Prompt the user to enter a sentence terminated by '.', '?' or '!'; convert input to uppercase.
Calculate vowelWordCount using countVowelWords method and reorder the sentence using reorderWords method.
Print the number of vowel words and the reordered sentence.
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
ch
char
Character to check if it is a vowel
2
sentence
String
Sentence input by the user
3
words
String[]
Array of words split from the sentence
4
count
int
Count of words that start and end with a vowel
5
i
int
Loop counter for traversing through words
6
vowels
String
String holding words starting with vowels
7
others
String
String holding words starting with non-vowels
8
input
String
User input sentence in uppercase
9
vowelWordCount
int
Number of words starting and ending with a vowel
10
reorderedSentence
String
Reordered sentence with all vowel-starting words followed by non-vowel starting words

Program
import java.util.*;

public class VowelWords {
    static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }
    static int countVowelWords(String sentence) {
        String[] words = sentence.trim().split("\\\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }
    static String reorderWords(String sentence) {
        String[] words = sentence.trim().split("\\\\s+");
        String vowels = "";
        String others = "";
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                vowels += words[i] + " ";
            } else {
                others += words[i] + " ";
            }
        }
        return vowels + others.trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence in uppercase terminated by '.', '?' or '!':");
        String input = scanner.nextLine().toUpperCase();
        
        int vowelWordCount = countVowelWords(input);
        String reorderedSentence = reorderWords(input);
        
        System.out.println("No. of words beginning and ending with a vowel = " + vowelWordCount);
        System.out.println(reorderedSentence);
            }
}

Terminal Output




Question 12: 
A class Capital has been defined to check whether a sentence has words beginning with a capital letter or not.
Class Name: Capitalizer
Data Members/Instance Variables
sent :To store a sentence
frequency: To store the frequency of the words beginning with a letter.
Member Functions
Capital()                                                                                         :Default Constructor
void input()                                                                                  :To accept a sentence
boolean isCapital(String w)                                           :Checks and returns true if the
                                                                                   word begins with a capital letter
                                                                                                 otherwise returns false.
void display()                                                                 :Displays the sentence along 
                                                                                     with the frequency of the words 
                                                                                        beginning with a capital letter.
Specify the class Capital, giving the details of the constructor(), void input(), boolean isCapital(String) and void display(). Define the main function to create an object and call the functions accordingly to enable the task.
Example
INPUT: The Quick Brown Fox Jumps Over the lazy Dog.
OUTPUT: Frequency: 7

INPUT: The Man walks Over To The Edge Of the Cliff.
OUTPUT: Frequency: 8

INPUT: The branches of the Trees are gnarled and Twisted.
OUTPUT: 3
Algorithm
Start
Import java.util.Scanner.
Define the Capitalizer class.
Declare static variables sent (for the sentence) and frequency (for counting title words).
Define the Capitalizer constructor to initialize sent and frequency.
Define the input method to read the sentence from the user.
In the input method, create a Scanner object for input.
Prompt the user to enter a sentence.
Store the entered sentence in the sent variable.
Define the isCapital method to check if the first character of a word is uppercase.
In the isCapital method, get the first character of the word.
Return true if the character is uppercase; otherwise, return false.
Define the display method to show the sentence and the frequency of title words.
Print the sentence.
Add a space before the sentence to handle the first word uniformly.
Loop through each character of the modified sentence.
Check if the character is a space and the next character exists.
If the next character is uppercase, increment the frequency.
Print the frequency of title words.
In the main method, create an instance of Capitalizer, call input method, and then call display method. End the program.
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
sent
String
Sentence input by the user
2
frequency
int
Frequency count of title-cased words in the sentence
3
scanner
Scanner
Scanner object for user input
4
w
String
Word from the sentence to check if it starts with uppercase
5
b
String
Modified sentence with a leading space for easy parsing
6
c
char
Character at a specific position in the sentence
7
i
int
Loop counter for traversing the sentence

Program
import java.util.Scanner;

public class Capitalizer {
    static String sent;
    static int frequency;

    public Capitalizer() {
        sent = "";
        frequency = 0;
    }
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to analyze: ");
        sent = scanner.nextLine();
    }
    public static boolean isCapital(String w) {
        char c = w.charAt(0);
        return Character.isUpperCase(c);
    }
    public static void display() {
        System.out.println("Sentence = " + sent);
        String b = " " + sent;
        char c;
        for (int i = 0; i < b.length(); i++) {
            c = b.charAt(i);
            if (c == ' ' && i + 1 < b.length()) {
                if (Character.isUpperCase(b.charAt(i + 1))) {
                    frequency++;
                }
            }
        }
        System.out.println("Frequency of the title word = " + frequency);
    }
    public static void main(String[] args) {
        Capitalizer obj = new Capitalizer();
        obj.input();
        obj.display();
    }
}


Terminal Output :




Question 13:
Caesar Cipher is an encryption technique which is implemented as ROT13 (rotate by 13 places). It is a simple letter substitution cipher that replaces a letter 13 places after it is in the alphabets, with the other character remaining unchanged.
Write a program in Java to accept a plain text of length ‘l’, where l must be greater than 3 and lesser than 100. Encrypt the text if valid as per the Caesar Cipher. Test your program with the sample data and some random data.
Example
INPUT: You
OUTPUT: Invalid Input

INPUT: Hello! How are you?
OUTPUT: Uryyb! Ubj ner lbh?

Algorithm
Start
Import java.util.Scanner.
Define CaesarCipher class.
Define main method for program entry.
Create a Scanner object named scanner.
Prompt user to input plaintext and trim whitespace.
Read plaintext input into plainText.
Check if plainText length is between 4 and 99 characters.
If not, print "Invalid Input" and exit.
Call encrypt method with plainText as parameter.
Print "Encrypted text: " followed by the encrypted result.
Define encrypt method to encrypt using Caesar cipher:
End encrypt method.
End main method.
End CaesarCipher class.
Handle input using Scanner.nextLine() and trim() to remove extra spaces.
Validate input length using conditional checks.
Use character manipulation (char, Character.isLetter(), arithmetic operations) for encryption.
Ensure encrypted characters wrap around alphabet using modulo arithmetic.
Print results using System.out.println() for output.
End
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
scanner
Scanner
Scanner object to read user input
2
plainText
String
Stores the plaintext entered by the user
3
length
int
Length of the plaintext string
4
encryptedText
String
Stores the encrypted text generated by the encrypt function
5
text
String
Parameter of the encrypt method, represents the plaintext
6
encrypted
String
Stores each character of the plaintext after encryption
7
i
int
Loop variable used in iterating through characters of text
8
c
char
Temporary variable to store each character of text

Program
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plainText = scanner.nextLine().trim();

        int length = plainText.length();
        if (length <= 3 || length >= 100) {
            System.out.println("Invalid Input");
            return;
        }

        String encryptedText = encrypt(plainText);
        System.out.println("Encrypted text: " + encryptedText);
    }

    public static String encrypt(String text) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    c = (char) ('a' + (c - 'a' + 13) % 26);
                } else if (Character.isUpperCase(c)) {
                    c = (char) ('A' + (c - 'A' + 13) % 26);
                }
            }
            encrypted += c;
        }
        return encrypted;
    }
}



Terminal Output :



Question 14: 
A snowball string is a sentence where each word is arranged in ascending order of their length and is also consecutive.

For example "I am the Lord" is a snowball string as
Length of word 'I' is 1
Length of word 'am' is 2
Length of word 'the' is 3
Length of word 'Lord' is 4

The length of each word is one more than the previous word. Hence they are consecutive and in ascending order.

Write a program to enter any sentence and check if it is a snowball string or not. The words in the sentence may be separated by one or more spaces and terminated by '.' or '?' only. The program will generate appropriate error message for any other terminating character.

Test your program for the following data and some random data:

Example 1
Input: He may give bonus
Output: IT IS A SNOWBALL STRING

Example 2
Input: Is the cold water frozen?
Output: IT IS A SNOWBALL STRING

Example 3
Input: Look before you leap
Output: IT IS A SNOWBALL STRING

Example 4
Input: The child is the father of the man!
Output: INCORRECT TERMINATING CHARACTER. INVALID INPUT
Algorithm
Initialize the class SnowballString.
Declare a string variable sent.
Create a method input() to read a sentence from the user.
Use a Scanner object to read input.
Prompt the user to enter a sentence.
Store the input in the variable sent.
Create a method isSnowball(String s) to check the snowball condition.
Tokenize the string s using delimiters ".? " to extract words.
Initialize an integer variable c to store the length of the first word.
If there are no tokens, return false.
In a loop, for each subsequent word, check its length.
Increment c by 1 for the expected length of the next word.
If the length of the current word does not match c, return false.
If all words match the condition, return true.
In the main method, create an instance of SnowballString.
Call the input() method to get user input.
Check the length of sent to ensure proper termination.
Validate the terminating character to be . or ?.
Call the isSnowball() method and store the result.
Print whether the input is a snowball string or not based on the result.
Variable Description Table
Variable Name
Data Type
Description
sent
String
Stores the input sentence provided by the user.
st
StringTokenizer
Tokenizes the input sentence into words based on delimiters.
x
String
Holds the current word being processed from the tokenized string.
c
int
Tracks the expected length of the next word in the snowball string condition.
l
int
Stores the length of the input sentence for validation.
x
char
Represents a character from the input sentence during validation.
check
String
Contains valid characters for validation of the terminating character.
obj
SnowballString
Instance of the SnowballString class to access its methods.

Program
import java.util.*;

public class SnowballString 
{
    String sent;

    void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = as.nextLine();
    }

    boolean isSnowball(String s)
    {
        StringTokenizer st = new StringTokenizer(sent, ".? ");
        String x = st.nextToken();
        int c = x.length();

        while(st.hasMoreTokens())
        {
             x = st.nextToken();
            if(++c != x.length())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SnowballString obj = new SnowballString();
        String check = "abcdefghijklmnopqrstuvwxyz.? ";
        
        obj.input();

        int l = obj.sent.length();

        for(int i = 0; i<l; i++)
        {   char x = Character.toLowerCase(obj.sent.charAt(i));
            if(check.indexOf(x) == -1)
            {
                System.out.println("Incorrect Terminating Character. Invalid Input");
                System.exit(0);
            }
        }
            if(obj.isSnowball(obj.sent))
                System.out.println("It is a Snowball String");
            else
                System.out.println("It is not a Snowball String");
    }
}


Terminal Output:




Question 15:
A class Encode has been defined to replace only the vowels in a word by the next corresponding vowel and form a new word.
   i.e A -> E, E -> I, I -> O, O -> U, U -> A   and
       a -> e, e -> i, i -> o, o -> u, u -> a
   Example: Input: Institution
            Output: Onstotatoun
   Some of the members of the class are given below:
   
   Class name                                                                                                               : Encode
   Data members/instance variables:
        word                                                                                                          : to store a word
        length                                                                    : integer to store the length of the word
        new_word                                                                               : to store the encoded word
        
   Methods/Member functions:
        Encode()                         : default constructor to initialize data members with legal intitial values
        void acceptWord()               : to accept a word
        void nextVowel()                : to replace only the vowels from the word stored in the 'word' by the next corresponding vowel and to assign it to 'newword', with the remaining alphabets unchanged
        void display()                  : to display the original word along with the encrytped word
   
   Specify the class Encode giving details of the constructor(), void acceptWord(), void nextVowel(), and void display(). Define a main() function to create an object and call the functions accordingly to enable the task.
Algorithm
Start
Define class Encode.
Declare data members: word, new_word, and length.
Create constructor Encode() to initialize word and new_word as empty strings, and length as 0.
Define method acceptWord() to accept a word from the user.
Use Scanner to read input.
Store the input word in word.
Define method nextVowel() to encode the vowels in word.
Set length to the length of word.
Create string vowS with lowercase vowels.
Create string vowC with uppercase vowels.
Loop from 0 to length - 1.
Get character x at the current index of word.
Check if x is in vowS.
If true, replace x with the next vowel using modulo operation.
Check if x is in vowC.
If true, replace x with the next vowel using modulo operation.
Append the modified x to new_word.
Define method display() to show original and encrypted words.
End
Variable Description Table
Variable Name
Data Type
Description
word
String
Stores the original word entered by the user.
new_word
String
Stores the encoded word with vowels replaced.
length
int
Holds the length of the original word.
vowS
String
Contains lowercase vowels for vowel replacement.
vowC
String
Contains uppercase vowels for vowel replacement.
x
char
Temporary character used to process each character in word.
obj
Encode
Instance of the Encode class used to call its methods.

Program
import java.util.Scanner;

public class Encode {
    String word, new_word;
    int length;

    Encode() {
        word = "";
        new_word = "";
        length = 0;
    }

    void acceptWord() {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = as.next();
    }
    
    void nextVowel() {
        length = word.length();
        String vowS = "aeiou";
        String vowC = "AEIOU";

        for (int i = 0; i < length; i++) {   
            char x = word.charAt(i);

            if (vowS.indexOf(x) != -1)
                x = vowS.charAt((vowS.indexOf(x) + 1) % 5);
            else if (vowC.indexOf(x) != -1)
                x = vowC.charAt((vowC.indexOf(x) + 1) % 5);
            
            new_word += x;
        }    
    }

    void display() {
        System.out.println("Original Word: " + word);
        System.out.println("Encrypted Word: " + new_word);
    }

    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.acceptWord();
        obj.nextVowel();
        obj.display();
    }   
}

Terminal Output



Question 16: 
A class SortAlpha has been defined to sort the words in the sentence in alphabetical order.
Example
Input: THE SKY IS BLUE
Output: BLUE IS SKY THE

Some of the members of the class are given below:
Class Name                                                                                                   SortAlpha             
Data Members/Instance Variables:
Sent                                                                                               : to store a sentence
n                                                  : integer to store the number of words in a sentence
Methods/Member Functions:
SortAlpha()                                                        : default constructor to initialize data 
                                                                         members with legal initial values
void Sort(SorAlpha P)                                      : Sorts the words of the sentence of 
                                                                         object P in alphabetical order and 
                                                                         stores the sorted sentence in the 
                                                                         current object.
void display()                                                   : Displays the original sentence along 
                                                                        with the sorted sentence by invoking 
                                                                        the method sort()
Specify the class SortAlpha giving details of the constructor(), void acceptsent( ), void sort(SortAlpha) and void display(). Define a main() function to create an object and call the functions accordingly to enable the task.
Algorithm
Start
Import java.util.*.
Define SortAlpha class.
Declare String sent and int n as instance variables.
Define a constructor to initialize sent and n.
Define acceptSent method.
Create Scanner object sc.
Prompt user to enter a sentence.
Read sentence into sent.
Create StringTokenizer object st with sent.
Set n to the number of tokens in st.
Define sort method.
Create StringTokenizer object st with sent.
Create String[] words array of size n.
Populate words array with tokens from st.
Implement nested loop to sort words using bubble sort.
Reconstruct sent from sorted words array.
Define display method and the sorted sentence,
In main method, create SortAlpha object, call acceptSent, sort, and display methods.
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
sent
String
Stores the sentence input by the user
2
n
int
Stores the number of words in the sentence
3
sc
Scanner
Scanner object to read input from the user
4
st
StringTokenizer
Tokenizer to split the sentence into words
5
words
String[]
Array of words extracted from the sentence

Program
import java.util.*;

class SortAlpha {
    String sent;
    int n;
    public SortAlpha() {
        sent = "";
        n = 0;
    }
    public void acceptSent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sent);
        n = st.countTokens();
    }
    public void sort() {
        StringTokenizer st = new StringTokenizer(sent);
        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = st.nextToken();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    words[j] = words[j] + words[j + 1];
                    words[j + 1] = words[j].substring(0, words[j].length() - words[j + 1].length());
                    words[j] = words[j].substring(words[j + 1].length());
                }
            }
        }
        sent = "";
        for (int i = 0; i < n; i++) {
            sent += words[i] + " ";
        }
        sent = sent.trim();
    }
    public void display() {
        System.out.println("Sorted Sentence: " + sent);
    }
    public static void main(String[] args) {
        SortAlpha obj = new SortAlpha();
        
        obj.acceptSent();
        obj.sort();
        obj.display();
    }
}



Terminal Output


Question 17: 
Keyword cipher is a form of encryption technique. A keyword is used as the key, and it determines the letter matching the cipher alphabet to the plain alphabet. Repeats of letters in the word are removed, then the cipher alphabet is generated with the keyword matching to A, B, C etc. until the keyword is used up, whereupon the rest of the cipher text letters are used in alphabetical order, excluding those already used in the key.
Encryption: The first line of input contains the keyword which you wish to enter. The second line of input contains the string which you have to encrypt.
Plaintext: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Encrypted: K R Y P T O S A B C D E F G H I J L M N Q U V W X Z
Example →
Encrypting the message: KNOWLEDGE IS POWER when, Keyword is KRYPTOS
Decoded Message → DGHVETPST BM IHVTL
Write a program to accept a Coded text in upper case and a Keyword. Using the above technique, decrypt the text and display. Note: All the messages are encoded in uppercase. Whitespace, special characters, and numbers remains unchanged.
Test your program for the following inputs:
Example 1→
INPUT: ENTER KEYWORD: SECRET
       ENTER TEXT TO BE DECODED: ZLJEFT DTOT
OUTPUT: DECODED TEXT: ZOMBIE HERE

Example 2 →
INPUT: ENTER KEYWORD: STAR WARS
       ENTER TEXT TO BE DECODED: SPPSAG SP RSVJ
OUTPUT: DECODED TEXT: ATTACK AT DAWN

Example 3→
INPUT: ENTER KEYWORD: PLAYERS
       ENTER TEXT TO BE DECODED: Haln de yokl
OUTPUT: INVALID INPUT**

Algorithm
Start
Import java.util.Scanner.
Define KeywordCipher class.
Define DuplicateRemover method with String keyword parameter.
Initialize result to an empty string.
Loop through keyword characters.
Append character to result if not already present.
Return result.
Define CipherAdder method with String keyword parameter.
Call DuplicateRemover and store result in Dup.
Initialize Alpha with "ABCDEFGHIJKLMNOPQRSTUVWXYZ".
Initialize cAlpha to an empty string.
Loop through Dup characters and append to cAlpha if in Alpha.
Loop through Alpha characters and append to cAlpha if not in cAlpha.
Return cAlpha.
Define decryptMessage method with String encoded and String keyword parameters.
Call CipherAdder and store result in cAlpha.
Initialize decoded to an empty string.
Loop through encoded characters.
For each character, find its index in cAlpha and append corresponding 'A' + index character to decoded.
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
keyword
String
The keyword used to generate the cipher alphabet.
2
result
String
The keyword with duplicate characters removed.
3
Dup
String
The keyword after duplicates are removed, used in the cipher alphabet generation.
4
Alpha
String
The string containing the standard English alphabet in uppercase.
5
cAlpha
String
The custom cipher alphabet generated using the keyword.
6
encoded
String
The encoded text that needs to be decoded.
7
decoded
String
The decoded message after processing the encoded text using the cipher alphabet.
8
c
char
A character from the encoded text being processed for decoding.
9
cAlphaIndex
int
The index of the character from the encoded text in the custom cipher alphabet.
10
scanner
Scanner
Scanner object to read input from the user.
11
textToDecode
String
The text that needs to be decoded, input by the user.

Program
import java.util.Scanner;

public class KeywordCipher {
    public static String DuplicateRemover(String keyword) {
        String result = "";
        for (int i = 0; i < keyword.length(); i++) {
            if (!result.contains(String.valueOf(keyword.charAt(i)))) {
                result += String.valueOf(keyword.charAt(i));
            }
        }
        return result;
    }
    public static String CipherAdder(String keyword) {
        String Dup = DuplicateRemover(keyword);
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cAlpha = "";
        for (int i = 0; i < Dup.length(); i++) {
            if (Alpha.indexOf(Dup.charAt(i)) != -1) {
                cAlpha += Dup.charAt(i);
            }
        }
        for (int i = 0; i < Alpha.length(); i++) {
            if (cAlpha.indexOf(Alpha.charAt(i)) == -1) {
                cAlpha += Alpha.charAt(i);
            }
        }
        return cAlpha;
    }
    public static String decryptMessage(String encoded, String keyword) {
        String cAlpha = CipherAdder(keyword);
        String decoded = "";
        for (int i = 0; i < encoded.length(); i++) {
            char c = encoded.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int cAlphaIndex = cAlpha.indexOf(c);
                decoded += (char) ('A' + cAlphaIndex);
            } else {
                decoded += c;
            }
        }
        return decoded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER KEYWORD: ");
        String keyword = scanner.nextLine().toUpperCase().replaceAll("\\\\s+", "");
        System.out.print("ENTER TEXT TO BE DECODED: ");
        String textToDecode = scanner.nextLine().toUpperCase();        
        String decoded = decryptMessage(textToDecode, keyword);
        System.out.println("DECODED TEXT: " + decoded);
    }
}


Terminal output



Question 18:
Write a Program to accept a sentence which may be terminated by either “_”, ‘?’ or ‘!’ only. The words may be separated by a single blank space and are in UPPER CASE.
Perform the following tasks:
Count the number of vowels and consonants present in each word.
Generate the output of the frequency in form of a bar graph, where V denotes vowels and Consonants as shown below:
Test your program for the following data and some random data:
Example→
INPUT: HOW ARE YOU?
OUTPUT: WORD    COUNT

        HOW      VCC
                 
        ARE      VVC
                 
        YOU      VVC
Example 2→
INPUT: GOOD DAY?
OUTPUT: WORD      COUNT

	      GOOD      VVCC
	                
	      DAY       VCC
Example 3→
INPUT: LONG LIVE THE KING
OUTPUT: INCORRECT TERMINATING CHARACTER INVALID INPUT

Algorithm
Start.
Import java.util.Scanner.
Define WordAnalyzer class with main method.
Create a Scanner object to read input.
Prompt the user to enter a sentence terminated by '_', '?', or '!'.
Read and store the input sentence.
Trim leading and trailing whitespaces from the input.
Check if the input ends with '_', '?', or '!'.
If true, split the input sentence into words using whitespaces.
Print column headers "WORD" and "COUNT".
Iterate over each word in the input sentence.
Initialize counters for vowels and consonants for the current word.
Iterate over each character in the word.
Check if the character is a vowel using the isVowel method.
If true, increment the vowel counter.
If the character is a letter and not a vowel, increment the consonant counter.
Print the current word followed by 'V' for each vowel and 'C' for each consonant.
Print a new line after printing the counts for each word.
If the terminating character is incorrect, print "INCORRECT TERMINATING CHARACTER. INVALID INPUT".
End.
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Used to take input from the user.
2
input
String
Stores the input sentence entered by the user.
3
words
String[]
Array of words extracted from the input sentence.
4
word
String
Used to iterate through each word in the words array.
5
vowels
int
Counter for the number of vowel characters in a word.
6
consonants
int
Counter for the number of consonant characters in a word.
7
ch
char
Used to iterate through each character in a word to check if it is a vowel or consonant.

Program
import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence (terminated by '_', '?' or '!'): ");
        String input = scanner.nextLine().trim();

        if (input.endsWith("_") || input.endsWith("?") || input.endsWith("!")) {
            String[] words = input.split("\\\\s+");
            System.out.println("WORD\\tCOUNT\\n");

            for (String word : words) {
                int vowels = 0;
                int consonants = 0;

                for (char ch : word.toCharArray()) {
                    if (isVowel(ch))
                        vowels++;
                    else if (Character.isLetter(ch))
                        consonants++;
                }

                System.out.print(word + "\\t");

                for (int i = 0; i < vowels; i++) {
                    System.out.print("V");
                }
                for (int i = 0; i < consonants; i++) {
                    System.out.print("C");
                }

                System.out.println("\\n");
            }
        } else {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}


Terminal Output

 
Question 19:
A number is said to be a Bouncy Number if the digits of the number are unsorted. For example:
22344, Is not a bouncy number because the digits are sorted in Ascending order.
774410, Is not a Bouncy number because the digits are unsorted.
155349, Is a bouncy number because the digits are unsorted.
NOTE: A number below 100 can never be a Bouncy number.
Write a program in Java using Recursion to accept a number. Check and display whether it is a Bouncy number or not.
Example
INPUT: 155349
OUTPUT: It is a Bouncy Number

INPUT: 123456
OUTPUT: It is not a Bouncy Number

INPUT: 4321
OUTPUT: It is not a Bouncy Number

INPUT: 98
OUTPUT: A number below 100 can never be a Bouncy Number**

Algorithm
Start
Define the BouncyNumber class.
Inside the class, define the main method.
Initialize a Scanner object to read input from the user.
Prompt the user to enter a number.
Read the input number using scanner.nextInt().
Close the Scanner object.
Call the isBouncy method with the input number, false for increasing, false for decreasing, and 1 as the index.
Inside the isBouncy method, convert the input number to a string.
Check if the current index is greater than or equal to the length of the string.
If true, return the logical AND of increasing and decreasing.
Compare the current digit with the previous digit.
If the current digit is greater than the previous digit, set increasing to true.
If the current digit is less than the previous digit, set decreasing to true.
If both increasing and decreasing are true, return true.
Make a recursive call to isBouncy with the same number, updated increasing, updated decreasing, and index incremented by 1.
In the main method, store the result of the isBouncy method call in isBouncy.
If isBouncy is true, print that the number is a bouncy number.
Otherwise, print that the number is not a bouncy number.
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Used to take input from the user.
2
number
int
Stores the number entered by the user to check if it is a bouncy number.
3
numStr
String
String representation of the number to facilitate character comparison.
4
increasing
boolean
Indicates if the digits in the number are in increasing order at any point.
5
decreasing
boolean
Indicates if the digits in the number are in decreasing order at any point.
6
index
int
Keeps track of the current digit position being checked in the recursive method isBouncy.

Program
import java.util.Scanner;

public class RecursiveBouncyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isBouncy(number, false, false, 1)) {
            System.out.println(number + " is a bouncy number.");
        } else {
            System.out.println(number + " is not a bouncy number.");
        }
    }
    public static boolean isBouncy(int number, boolean increasing, boolean decreasing, int index) {
        String numStr = String.valueOf(number);
        if (index >= numStr.length()) {
            return increasing && decreasing;
        }
        if (numStr.charAt(index) > numStr.charAt(index - 1)) {
            increasing = true;
        } else if (numStr.charAt(index) < numStr.charAt(index - 1)) {
            decreasing = true;
        }
        if (increasing && decreasing) {
            return true;
        }
        return isBouncy(number, increasing, decreasing, index + 1);
    }
}


Terminal Output



Question 20: 
A Disarium Number is a number in which the sum of digits to the powers of this repetitive position is equal to the number itself.
For example: 135 = 1¹ + 3² + 5²
Design a class “Disarium” to check if a given number is a Disarium number or not. Some of the details of the class are given below:
Class Name                                                                                                  : Disarium
Data Members/Instance Variable
int num                                                                                            :Stores the number
int size                                                                                             :Store the size
Member Functions
Disarium (int nn)                                                            :Parameterized constructor to 
                                                                                      initialize the data members 
                                                                                      n=nn and size=0
void countDigit()                                                            :Count the total number of 
                                                                                      digits and assign it to size
int sumOfDigits (int n, int p)                                          :Returns the sum of the digits 
                                                                                      to the power of this repetitive 
                                                                                      points using recursive 
                                                                                      technique.
void check()                                                                 :Checks whether the number is 
                                                                                    a Disarium number and 
                                                                                    displays the result with 
                                                                                    appropriate message.
Create the main method and perform function calling.
Example
INPUT: 135
OUTPUT: Disarium Number

INPUT: 111
OUTPUT: Not a Disarium Number

Algorithm
Start
Define the NumberBased package.
Define the DisariumNumber class.
Define a static method check that takes an integer n as an argument.
Convert the integer n to a string to determine the number of digits and store the length in DigitCounter.
Initialize an integer variable sum to 0.
Initialize an integer variable temp to n.
Start a while loop that continues as long as temp is not equal to 0.
Inside the loop, calculate r as temp modulo 10 to get the last digit of temp.
Update sum by adding r raised to the power of DigitCounter to sum.
Decrement DigitCounter by 1.
Update temp by dividing it by 10 to remove the last digit.
End the while loop.
Return the result of the comparison between sum and n.
Define the main method in the DisariumNumber class.
Initialize an integer variable n with the value 89.
Call the check method with n and store the result.
Use a ternary operator to print "Disarium Number" if the result is true.
Otherwise, print "Not a Disarium Number".
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
n
int
Stores the number to be checked for being a Disarium number
2
DigitCounter
int
Stores the number of digits in n
3
sum
int
Accumulates the sum of each digit raised to the power of its position from right to left
4
temp
int
Temporary variable used to extract digits from n during the while loop
5
r
int
Stores the current rightmost digit of temp during each iteration of the while loop

Program
import java.util.Scanner;

public class DisariumNumber
{
      static boolean check(int n)
    {
        int DigitCounter = Integer.toString(n).length();
        int sum = 0; 
        int temp = n;
        while (temp!=0)
        {
            int r = temp%10;
            sum = (int) (sum + Math.pow(r, DigitCounter--));
            temp = temp/10;
        }
    
        return (sum == n);
    }
      public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
    }
}


Terminal Output


Question 21: 
A Unique Digit integer is a positive integer (without Leading-zeros) and with no duplicate digits. Given two positive integers ‘a’ and ‘b’. Write a program in Java to determine how many unique digit integers are there in the range between ‘a’ and ‘b’ and output them.
Example
INPUT: Enter the values of m and n :
       a=100 b=120 
OUTPUT: The Unique digit integers are:
        102, 103, 104, 105, 106, 107, 108, 109, 120
        Frequency = 9
Algorithm
Start
Import the java.util.Scanner package.
Define the UniqueNumber class.
Define the main method.
Create a Scanner object to read input from the user.
Print the message "Enter the Number to check".
Read the input number using scanner.nextInt().
Convert the input number n to a string and store it in the variable con.
Initialize a boolean variable ch to true.
Start a for loop with an integer i initialized to 0, running while i is less than the length of con.
Inside the loop, get the character at index i in con.
Use the indexOf method to check if this character appears again in con starting from index i + 1.
If the character appears again, set ch to false.
Break out of the loop.
End the for loop.
Check the value of ch.
If ch is true, print "Unique".
Otherwise, print "Sorry, Not Unique".
Close the Scanner object.
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Scanner object to read input from the user
2
n
int
Stores the number input by the user
3
con
String
Converts the integer n to a string for easier manipulation and checking of unique digits
4
ch
boolean
Flag variable used to determine if all digits in the number n are unique
5
i
int
Loop variable used in the for loop to iterate through each character/digit in con

Program
import java.util.Scanner;

public class UniqueNumber {
    static boolean hasUniqueDigits(int num) {
        String strNum = String.valueOf(num);
        boolean[] digitSeen = new boolean[10];

        for (char c : strNum.toCharArray()) {
            int digit = c - '0';
            if (digitSeen[digit]) {
                return false;
            }
            digitSeen[digit] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of m and n: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The Unique digit integers are:");
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (hasUniqueDigits(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Frequency = " + count);
    }
}



Terminal Output


Question 22: 
Design a class “RecursivePrimePalindrome” to generate prime palindrome numbers.
For Example: 11 (where 11 is a Prime number and a palindrome number)
Some of the members of the class are given below:
Class Name: RecursivePrimePalindrome
Data Members/Instance Variables
Start :To store the start of range
end :To store the end of range
Member Methods/Functions
PrimePalinGen (int a, int b) :Parameterized constructor to initialize the data members ‘a’ and end=b
int isPrime (int i) :Return 1 if the number is Prime other return 0
int isPalin (int i) :Return 1 if the number is a palindrome otherwise return 0
void generate () :Generate all Prime Palindrome number between start and end by invoking the function and isPrime() and isPalin()
Specify the class “RecursivePrimePalindrome” giving details of the constructor(), int isPrime (int), int isPalin (int) and void generate(). Define a main() function to create an object and call the functions accordingly to end the task.
Algorithm
Start
Import java.util.Scanner
Define the RecursivePrimePalindrome class
Define the main method
Create a Scanner object
Print "Enter a number: "
Read input number n using scanner.nextInt()
Close the Scanner object
Call isPrime(n, 2)
Call isPalindrome(n, 0, n)
If both isPrime and isPalindrome return true, print "Prime Palindrome"
If either returns false, print "Sorry, Not a Prime Palindrome"
Define isPrime method with n and i
If n <= 1, return false
If n == 2 || n == 3, return true
If n % i == 0, return false
If i * i > n, return true
Recursively call isPrime(n, i + 1)
Define isPalindrome method with n, reversed, and original
If n == 0, return reversed == original; else, update reversed and call isPalindrome(n / 10, reversed, original)
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Scanner object to read input from the user
2
n
int
Stores the number input by the user
3
i
int
Used as an index in the isPrime recursive method to check for prime numbers
4
reversed
int
Used in the isPalindrome recursive method to store the reversed digits of the number
5
original
int
Used in the isPalindrome recursive method to store the original number for comparison with the reversed number

Program
import java.util.Scanner;

public class RecursivePrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n, 2) && isPalindrome(n, 0, n)) {
            System.out.println("Prime Palindrome");
        } else {
            System.out.println("Sorry, Not a Prime Palindrome");
        }
    }
    static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
    static boolean isPalindrome(int n, int reversed, int original) {
        if (n == 0) {
            return reversed == original;
        }
        reversed = reversed * 10 + n % 10;
        return isPalindrome(n / 10, reversed, original);
    }
}


Terminal Output


Question 23: 
An Evil Number is a positive whole number which has an even number of 1’s in its Binary equivalent.
For Example: Binary Equivalent of 9 is 100, Which contains even number of 1’s. A few evil numbers are 3, 5, 6, 9. Design a program to accept a positive whole number and find the binary equivalent of the number and count the number of 1’s in it and display whether it is an Evil Number or not using Recursion, with an appropriate message.
Example
INPUT: 15
       Binary Equivalent = 1111
       Number of 1's = 4
OUTPUT: Evil Number

INPUT:** 26
       Binary Equivalent = 11010
       Number of 1's = 3
OUTPUT: Not an Evil Number

Algorithm
Start
Import java.util.Scanner
Define the EvilNumber class
Define the main method
Create a Scanner object
Print "Enter a non-negative integer: "
Read input number number using scanner.nextInt()
Initialize countOnes to 0
Start a while loop with the condition number > 0
Inside the loop, check if number % 2 == 1
If true, increment countOnes
Update number by dividing it by 2
End the while loop
Determine if countOnes % 2 == 0 and assign to isEvil
Check the value of isEvil
If isEvil is true, print "The number is an evil number."
Otherwise, print "The number is not an evil number."
Close the Scanner object
End the main method
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Used to take input from the user.
2
number
int
Stores the non-negative integer entered by the user to check if it is an evil number.
3
countOnes
int
Keeps track of the count of '1's in the binary representation of the number.
4
isEvil
boolean
Indicates if the number is an evil number (true if the count of '1's is even, false otherwise).

Program
import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        int countOnes = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                countOnes++;
            }
            number /= 2;
        }
        boolean isEvil = countOnes % 2 == 0;
        if (isEvil) {
            System.out.println("The number is an evil number.");
        } else {
            System.out.println("The number is not an evil number.");
        }
    }
}


Terminal Output



Question 24: 
A composite Magic number is a positive integer which is composite as well as a Magic Number.
Write a Java program to accept two positive integers ‘m’ and ‘n’, where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below.
Example
INPUT: m=10
       n=100
OUTPUT:The Composite magic numbers are: 10, 28, 46, 55, 64, 82, 91, 100
       Frequency of Composite magic numbers : 8

Example 2
INPUT: m=120
       n=90
OUTPUT: Invalid Input 

Algorithm
Start.
Import java.util.Scanner.
Define isComposite(int num) method to check if a number is composite.
Define sumOfDigits(int num) method to calculate the sum of digits of a number.
Define isMagicNumber(int num) method to check if a number is a magic number.
Inside isComposite, return false if num <= 1.
Loop from 2 to sqrt(num) in isComposite and return true if num is divisible.
Return false in isComposite if no divisors are found.
Inside sumOfDigits, return 0 if num == 0, otherwise return (num % 10) + sumOfDigits(num / 10).
Inside isMagicNumber, loop until num is a single digit, replacing num with the sum of its digits.
Return true in isMagicNumber if num is 1, otherwise return false.
Define the main method.
Create a Scanner object for input.
Prompt and read m and n values.
Print "Invalid Input" and return if m > n.
Print "The Composite magic numbers are: ".
Initialize count to 0 and found to false.
Loop from m to n inclusive, checking if the number is composite and a magic number.
Print the number, increment count, and set found to true if conditions are met.
Print "None" if no composite magic numbers are found, then print "Frequency of Composite magic numbers: " followed by count. End.
Variable Description Table
Sr No.
Variable Name
Datatype
Description
1
num
int
Number to be checked for composite or magic
2
i
int
Loop counter
3
m
int
Lower bound of the range
4
n
int
Upper bound of the range
5
count
int
Counter for composite magic numbers
6
found
boolean
Flag to indicate if any composite magic number is found

Program
import java.util.Scanner;

public class RecursiveCompositeMagicNumber {
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }
    public static boolean isMagicNumber(int num) {
        while (num > 9) {
            num = sumOfDigits(num);
        }
        return num == 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for m:");
        int m = scanner.nextInt();

        System.out.println("Enter the value for n:");
        int n = scanner.nextInt();
        
        if (m > n) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.print("The Composite magic numbers are: ");
        int count = 0;
        boolean found = false;
        
        for (int i = m; i <= n; i++) {
            if (isComposite(i) && isMagicNumber(i)) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                count++;
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        System.out.println("Frequency of Composite magic numbers : " + count);
    }
}


Terminal Output


Question 25:
Lucky numbers are a sequence of natural numbers that remain after removing second, third, fourth, fifth and so on numbers respectively from a sequence of consecutive natural numbers.
Consider the sequence of first 20 natural numbers :
Removing every second number produces the sequence 1, 3, 5, 7, 9, 11, 13, 15, 17. 19 Next removing every third number produces the sequence 1, 3, 7, 9. 13, 15, 19 Next removing every fourth number produces the sequence : 1, 3, 7, 13, 15. 19 Further deleting every fifth number we get the sequence : 1, 3, 7, 13, 19
Deletion of every sixth number is not possible and the five numbers that are lucky to escape deletion remain indefinitely.
Write a program to enter any positive natural number 'N' where (1 <- N <- 50) and generate lucky numbers less than the given natural number. Test your program with the following set of data
Example 1
INPUT: N=10
OUTPUT: LUCKY NUMBERS LESS THAN 10 ARE: 1, 3, 7
Example 2
INPUT: N=25
OUTPUT: LUCKY NUMBERS LESS THAN 25 ARE: 1, 3, 7, 13, 19
Example 3
INPUT: N=100
OUTPUT: NUMBER NOT IN RANGE: INVALID ENTRY
Algorithm
Start
Import java.util.Scanner.
Define LuckyNumbers class.
Define remove method with int[] arr and int step parameters.
Return arr if step is greater than arr.length.
Initialize index j to 0.
Create new array newArr with reduced length.
Loop through arr with index i.
Copy elements to newArr if not at step position.
Return newArr.
Define Calculator method with int N parameter.
Create int[] numbers from 1 to N-1.
Loop from 2 to N.
Call remove method to update numbers.
Print "LUCKY NUMBERS LESS THAN N ARE: ".
Loop through numbers to print each element.
Define main method.
Create Scanner object scanner.
Check if N is out of range and print error message or call Calculator.
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
arr
int[]
Array of numbers from which elements are removed in the remove method.
2
step
int
Step value used to determine which elements to remove from the array.
3
j
int
Index for the new array during the removal process.
4
newArr
int[]
Array that stores the remaining elements after removal.
5
N
int
Upper limit for the range of numbers to determine lucky numbers.
6
numbers
int[]
Array of numbers from 1 to N-1.
7
i
int
Loop counter used in the Calculator method for the sieve process.
8
number
int
Elements of the numbers array, used to print the final list of lucky numbers.
9
scanner
Scanner
Used to take input from the user.

Program
import java.util.Scanner;

public class LuckyNumbers {
    public static int[] remove(int[] arr, int step) {
        if (step > arr.length) {
            return arr; 
        }
        int j = 0;
        int[] newArr = new int[arr.length - arr.length / step];
                for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % step != 0) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
    public static void Calculator(int N) {
        int[] numbers = new int[N - 1];
                for (int i = 0; i < N - 1; i++) {
            numbers[i] = i + 1;
        }
                for (int i = 2; i <= N; i++) {
            numbers = remove(numbers, i);
        }
        System.out.print("LUCKY NUMBERS LESS THAN " + N + " ARE: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("N=");
        int N = scanner.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("NUMBER NOT IN RANGE: INVALID ENTRY");
            return;
        }
        Calculator(N);
    }
}


Terminal Output



Question 26:
A Vampire number is a composite natural number with an even number of digits that can be factored into two natural numbers each with half as many digits as the original number and not both with trailing zeros, where the two factors contain precisely all the digits of the original number, in any order of counting multiplicity.
Example → 1260 = 21*60 (Where, 21 and 60 contain precisely all the digits of the number)
Thus, 1260 Is a Vampire number.
Accept two positive integers m and n, where m is less than n and the values of both ‘m’ and ‘n’ must be greater than or equal to 1000 and less than or equal to 9999 as user input. Display all Vampire numbers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format specified below:
Test your program for the following data and some random data.
Example 1→
Input: m=1002
          n=1640
Output: THE VAMPIRE NUMBERS ARE:
            1260 1395 1435 1530
             FREQUENCY OF VAMPIRE NUMBER IS: 4
Example 2→
Input: m=1810
          n=7800
Output: THE VAMPIRE NUMBERS ARE:
             1827 2187 6880
              FREQUENCY OF VAMPIRE NUMBER IS: 3
Example 3→
Input: m=8105
           n=9999
Output: THE VAMPIRE NUMBERS ARE:
             NIL
             FREQUENCY OF VAMPIRE NUMBER IS: 0
Example 4→
Input: m=174
          n=4500
Output: INVALID INPUT
Algorithm
Start
Import java.util.Scanner
Define Vampire class
Define isVampire(int num) method to check if num is a vampire number
Convert num to string n and get its length l
If l is odd, return false
Loop from i = 10^(l/2-1) to 10^(l/2)
Check if num is divisible by i, calculate quotient q = num / i
If q has correct number of digits, check EqualDigitChecker(n, i, q)
Define EqualDigitChecker(String o, int p1, int p2) method
Concatenate p1 and p2 into string com
If length of com matches o, call areAnag(o, com); return its result
Define areAnag(String str1, String str2) method
If lengths of str1 and str2 match, initialize count array of size 10
Loop through str1 and str2, updating count based on digit frequencies
If all elements in count are zero, return true; else, return false
Define main method
Prompt user for m and n, read using Scanner
Initialize vampireNumbers array and count
Loop from m to n, check each number with isVampire; if true, store in vampireNumbers and increment count
Print "THE VAMPIRE NUMBERS ARE:" followed by vampire numbers or "NIL" if count is 0
Print "FREQUENCY OF VAMPIRE NUMBER IS: " followed by count
End
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Used to take input from the user.
2
dayNumber
int
Stores the day number entered by the user (between 1 and 366).
3
year
int
Stores the year entered by the user (format yyyy).
4
N
int
Stores the value of N entered by the user (number of days to add).
5
daysInMonths
int[]
Array containing the number of days in each month.
6
monthNames
String[]
Array containing the names of the months.
7
month
int
Stores the index of the month derived from the day number.
8
day
int
Stores the day of the month derived from the day number and used to calculate the future date.

Program
import java.util.Scanner;

public class Vampire {
    public static boolean isVampire(int num) {
        String n = Integer.toString(num);
        int l = n.length();
        if (l % 2 != 0) {
            return false;
        } else {
            for (int i = (int)Math.pow(10, l / 2 - 1); i < Math.pow(10, l / 2); i++) {
                if (num % i == 0) {
                    int q = num / i;
                    if (q >= Math.pow(10, l / 2 - 1)) {
                        if (EqualDigitChecker(n, i, q)) {
                            return true;
                        } else {
                            continue;
                        }
                    }
                }
            }
            return false;
        }
    }
    public static boolean EqualDigitChecker(String o, int p1, int p2) {
        String com = Integer.toString(p1) + Integer.toString(p2);  
        if (com.length() != o.length()) {
            return false;
        } else {
            return areAnag(o, com);
        }
    }
    public static boolean areAnag(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int[] count = new int[10];
            
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - '0']++;
                count[str2.charAt(i) - '0']--;
            }
            for (int i = 0; i < 10; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        if (m < 1000 || m > 9999 || n < 1000 || n > 9999 || m >= n) {
            System.out.println("INVALID INPUT");
            return;
        } else {
            int[] vampireNumbers = new int[n - m + 1];
            int count = 0;
            for (int i = m; i <= n; i++) {
                if (isVampire(i)) {
                    vampireNumbers[count++] = i;
                }
            }
            System.out.println("THE VAMPIRE NUMBERS ARE:");
            if (count == 0) {
                System.out.println("NIL");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.print(vampireNumbers[i] + " ");
                }
                System.out.println();
            }
            System.out.println("FREQUENCY OF VAMPIRE NUMBER IS: " + count);
        }
    }
}


Terminal Output



Question 27: 
A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself.

Example: 2, 3, 5, 7 … etc.

Adam number: The square of a number and the square of its reverse are reverse to each other.

Example: If n = 13 and reverse of 'n' = 31, then,

(13)2 = 169

(31)2 = 961 which is reverse of 169

thus 13, is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. Display all Prime-Adam integers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format given below:

Test your program with the following data and some random data:

Example 1

INPUT:
m = 5
n = 100

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

Example 2

INPUT:
m = 100
n = 200

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
101 103 113
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

Example 3

INPUT:
m = 50
n = 70

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
NIL
FREQUENCY OF PRIME-ADAM INTEGERS IS: 0

Example 4

INPUT:
m = 700
n = 450

OUTPUT:
INVALID INPUT
Algorithm
1. Start
2. Declare the `PrimeAdam` class.
3. Define the `reverse(int num)` method to reverse a number.
4. Initialize `rev = 0` inside the `reverse()` method.
5. Loop to reverse the digits of the number.
6. Return the reversed number.
7. Define the `isAdam(int num)` method to check if a number is an Adam number.
8. Square the input number.
9. Reverse the original number.
10. Square the reversed number.
11. Reverse the square of the original number.
12. Compare the reversed square of the original with the square of the reversed number.
13. Return `true` if the two are equal, otherwise `false`.
14. Define the `isPrime(int num)` method to check for prime numbers.
15. Initialize a counter.
16. Loop to check divisibility from 1 to the number.
17. Return `true` if the counter equals 2, indicating it's prime.
18. In `main()`, take input for `m` and `n` from the user.
19. Loop through the numbers from `m` to `n`, checking for Prime-Adam numbers.
20. End
Variable Description Table

Variable Name
Datatype
Description
num
int
Stores the number being reversed, squared, or checked for primality.
rev
int
Stores the reverse of the number or its square.
d
int
Stores the last digit of the number while reversing it.
sqNum
int
Stores the square of the number being checked if it's an Adam number.
revNum
int
Stores the reverse of the number being checked if it's an Adam number.
sqRevNum
int
Stores the square of the reversed number.
c
int
Counter for checking if a number has exactly two divisors (prime check).
m
int
Lower limit of the range input by the user.
n
int
Upper limit of the range input by the user.
count
int
Counter to keep track of the number of Prime-Adam integers found.
adam
boolean
Stores the result of checking if a number is an Adam number.
prime
boolean
Stores the result of checking if a number is a prime number.
i
int
Loop counter to iterate through the range from m to n.
in
Scanner
Object of the Scanner class to take input from the user.

Program
import java.util.Scanner;

public class adam
{
    int reverse(int n)
    { int d=0,r=0;
        while(n>0)
        {
            d=n%10;
            r=10*r+d;
            n=n/10;
        }
        return r;
    }
    boolean isprime(int n)
    { int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    boolean isadam(int n)
    {
        int sq=n*n;
        int numrev=reverse(n);
        int sqrev=numrev*numrev;
        if(reverse(sq)==sqrev)
        return true;
        else
        return false;
    }
    void check(int m,int n)
    {
        int c=0;
        if(m<n)
        {
           System.out.println("The Prime Adam integers are: ");
           for(int i=m; i<=n; i++)
           {
               if(isprime(i) && isadam(i))
               {
                   System.out.println(i);
                   c++;
               }
           }
           System.out.println("Frequency: "+c);
        }
        else
        System.out.println("Invalid input");
    }
    public static void main()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter Start of range: ");
        int a=as.nextInt();
        System.out.println("Enter end of range: ");
        int b=as.nextInt();
        adam obj=new adam();
        obj.check(a,b);
    }
}


Terminal Output

Question 28: 
Input a sentence from the user and count the number of times, the words “an” and “and” are present in the sentence. Design a class Frequency using the description given below:
Class name:                                                                                                             Frequency
Data members/variables:
Text                                                                                                            :stores the sentence
Countand                                                                                                    :to store the 
                                                                                                       frequency of the word “and”
len                                                                                            : stores the length of the string
Member functions/methods:
Frequency()                                                     : constructor to initialize the instance variables
void accept(String n)                                      : to assign n to text, where the value of the 
                                                                       parameter n should be in lower case.
void checkandfreq()                                        : to count the frequency of “and”
void checkanfreq()                                          : to count the frequency of “an”
void display()                                                  : to display the number of “and” and “an” with 
                                                                       appropriate messages.
Specify the class Frequency giving details of the constructor(), void accepts(String), void checkandfreq(), void checkanfreq() and void display(). Also, define the main() function to create an object and call methods accordingly to enable the task.
Algorithm
1. Start
2. Declare the `Frequency` class.
3. Declare instance variables: `String text`, `int countand`, `int countan`, `int len`.
4. Create a constructor for the `Frequency` class to initialize variables.
5. Define the `accept` method to set `text` to the input string.
6. Define the `checkAndFreq` method to initialize a temporary string `S`.
7. Set `countand` to 0 and `len` to the length of `text`.
8. Loop through each character of `text`.
9. If the character is a space, check if `S` equals "and".
10. If true, increment `countand` and reset `S` to an empty string.
11. Otherwise, append the character to `S`.
12. After the loop, check if `S` equals "and" and increment `countand` if true.
13. Define the `checkAnFreq` method to initialize a temporary string `S1`.
14. Set `countan` to 0 and `len` to the length of `text`.
15. Loop through each character of `text`.
16. If the character is a space, check if `S1` equals "an".
17. If true, increment `countan` and reset `S1` to an empty string.
18. Otherwise, append the character to `S1`.
19. Define the `display` method to print the frequencies of "and" and "an".
20. Define the `main` method to read user input and call the necessary methods.
21. End
Variable Description Table
Variable Name
Datatype
Description
text
String
Holds the input sentence provided by the user.
countand
int
Counts the occurrences of the word "and" in the text.
countan
int
Counts the occurrences of the word "an" in the text.
len
int
Stores the length of the input sentence (text).
S
String
Temporary string used to build words when checking for "and".
S1
String
Temporary string used to build words when checking for "an".

Program

import java.util.Scanner;

public class Frequency {
    String text;
    public int countand;
    public int countan;
    public int len;

    Frequency() {
        text = "";
        countand = 0;
        countan = 0;
        len = 0;
    }

    void accept(String n) {
        text = n;
    }

    void checkAndFreq() {
        String S = "";
        countand = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S.equals("and")) {
                    countand = countand + 1;
                }
                S = "";
            } else {
                S = S + b;
            }
        }
        if (S.equals("and")) {
            countand = countand + 1;
        }
    }

    void checkAnFreq() {
        String S1 = "";
        countan = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S1.equals("an")) {
                    countan = countan + 1;
                }
                S1 = "";
            } else {
                S1 = S1 + b;
            }
        }
        if (S1.equals("an")) {
            countan = countan + 1;
        }
    }

    void display() {
        System.out.println("Frequency of 'and' in the sentence is: " + countand);
        System.out.println("Frequency of 'an' in the sentence is: " + countan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frequency freq = new Frequency();

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        freq.accept(input);
        freq.checkAndFreq();
        freq.checkAnFreq();
        freq.display();

        scanner.close();
    }
}

Terminal Output



Question 29: 
A class Mixer has been defined to merge two sorted integer arrays in ascending order.
Some of the members of the class are given below:

Class name                                                                                                                    : Mixer
Data members/instance variables:
int arr[ ]                                                                                 : to store the elements of an array
int n                                                                                      : to store the size of the array
Member functions:
Mixer(int nn)                                                                         : constructor to assign n=nn
void accept( )                                                                        : to accept the elements of the 
                                                                                              array in ascending order without 
                                                                                              any duplicates
Mixer mix(Mixer A)                                                               : to merge the current object array 
                                                                                              elements with the parameterized 
                                                                                              array elements and return the 
                                                                                              resultant object
void display( )                                                                        : to display the elements of the array
Specify the class Mixer, giving details of the constructor(int), void accept( ), Mixer mix(Mixer) and void display( ) . Define the main( ) function to create an object
and call the function accordingly to enable the task.
Algorithm
1. Start
2. Declare the `Mixer` class.
3. Declare an integer array `arr[]` and an integer variable `n`.
4. Create a `Scanner` object `sc` for user input.
5. Define the constructor `Mixer(int nn)` to initialize `n` and allocate memory for `arr`.
6. Define the `accept` method to prompt the user for input.
7. Print a message to enter `n` elements in ascending order.
8. Loop from `0` to `n - 1` to read elements into `arr`.
9. Define the `mix` method to take another `Mixer` object `A` as an argument.
10. Create a new `Mixer` object `B` with size `n + A.n`.
11. Initialize an index variable `x` to `0`.
12. Loop from `0` to `n - 1` to copy elements from `arr` to `B.arr`.
13. Increment the index variable `x` after each copy.
14. Loop from `0` to `A.n - 1` to copy elements from `A.arr` to `B.arr`.
15. Return the `Mixer` object `B`.
16. Define the `display` method to print elements of `arr`.
17. Loop from `0` to `n - 1` and print each element of `arr`.
18. Define the `main` method to execute the program.
19. Create a `Scanner` object `sc1` and read sizes for the first and second arrays.
20. Create `Mixer` objects `P` and `Q`, call `accept`, and display the combined array.
Variable Description Table

Variable Name
Datatype
Description
arr
int[]
An integer array to store the elements of the mixer.
n
int
The number of elements in the arr array.
sc
Scanner
Scanner object to take user input.
B
Mixer
A new Mixer object created in the mix method to store combined elements.
x
int
An index variable used to track the position while copying elements.
sc1
Scanner
Another Scanner object used in the main method for user input.
sizeOfFirstArray
int
Holds the size of the first array entered by the user.
sizeOfSecondArray
int
Holds the size of the second array entered by the user.
P
Mixer
A Mixer object representing the first array.
Q
Mixer
A Mixer object representing the second array.
R
Mixer
A Mixer object holding the result of the mix operation.

Program
import java.util.Scanner;

public class Mixer {
    int arr[];
    int n;
    Scanner sc = new Scanner(System.in);

    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }

    void accept() {
        System.out.println("Enter " + n + " unique elements in ascending order:");
        for (int i = 0; i < n; i++) {
            int input;
            while (true) {
                input = sc.nextInt();
                if (i == 0 || input > arr[i - 1]) {
                    arr[i] = input;
                    break;
                } else {
                    System.out.println("Please enter a number greater than " + arr[i - 1] + " to maintain ascending order without duplicates:");
                }
            }
        }
    }

    Mixer mix(Mixer A) {
        Mixer B = new Mixer(n + A.n);
        int x = 0, i = 0, j = 0;

        while (i < n && j < A.n) {
            if (arr[i] < A.arr[j]) {
                B.arr[x++] = arr[i++];
            } else if (arr[i] > A.arr[j]) {
                B.arr[x++] = A.arr[j++];
            } else {
                B.arr[x++] = arr[i++];
                j++;
            }
        }

        while (i < n) {
            B.arr[x++] = arr[i++];
        }
        while (j < A.n) {
            B.arr[x++] = A.arr[j++];
        }

        B.n = x;
        return B;
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("ENTER SIZE OF FIRST ARRAY: ");
        int sizeOfFirstArray = sc1.nextInt();
        Mixer P = new Mixer(sizeOfFirstArray);
        P.accept();

        System.out.print("ENTER SIZE OF SECOND ARRAY: ");
        int sizeOfSecondArray = sc1.nextInt();
        Mixer Q = new Mixer(sizeOfSecondArray);
        Q.accept();

        Mixer R = P.mix(Q);
        System.out.println("Merged array:");
        R.display();
    }
}

Terminal Output


Question 30: 
Write a program in JAVA to accept day number (between I and 366) and year (yyyy) from the user and display the corresponding date. Also accept 'N' from the user where (1 <- N <= 100) to compute and display the future date 'N' days after the given date. Display error message if the value of the day number or "N' are not within the limit. Day number is calculated taking 1 January of the given year as 1.
Test your program with given set of data and some random data
Example 1
INPUT: DAY NUMBER: 50
            YEAR: 2023
             N: 25
OUTPUT: ENTERED DATE: FEBRUARY 19, 2023
                25 DAYS LATER: MARCH 16, 2023
Example 2
INPUT: DAY NUMBER: 321
             YEAR: 2023
             N: 77
OUTPUT: ENTERED DATE: NOVEMBER 17, 2023
                77 DAYS LATER: FEBRUARY 2, 2024
Example 3
INPUT: DAY NUMBER: 400
            YEAR: 2023
            N: 125
OUTPUT: INCORRECT DAY NUMBER INCORRECT VALUE OF ‘N’
Algorithm
Start.
Import java.util.Scanner.
Define FutureDate class with main method.
Create Scanner object to read input.
Read and store day number (1-366).
Read and store year (yyyy).
Read and store N (1-100).
Validate day number (1-366).
If invalid, print "INCORRECT DAY NUMBER" and exit.
Validate N (1-100).
If invalid, print "INCORRECT VALUE OF 'N'" and exit.
Define arrays daysInMonths and monthNames.
Initialize month and day to 0.
Iterate to find month for entered day.
Calculate remaining day in month.
Print entered date.
Add N days to entered day.
Handle month and year change if necessary.
Print date N days later.
End.
Variable Description Table
Sr. No.
Variable Name
Data Type
Description
1
scanner
Scanner
Used to take input from the user.
2
dayNumber
int
Stores the day number entered by the user (between 1 and 366).
3
year
int
Stores the year entered by the user (format yyyy).
4
N
int
Stores the value of N entered by the user (number of days to add).
5
daysInMonths
int[]
Array containing the number of days in each month.
6
monthNames
String[]
Array containing the names of the months.
7
month
int
Stores the index of the month derived from the day number.
8
day
int
Stores the day of the month derived from the day number and used to calculate the future date.

Program
import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (between 1 and 366): ");
        int dayNumber = scanner.nextInt();

        System.out.print("Enter year (yyyy): ");
        int year = scanner.nextInt();

        System.out.print("Enter value of N (1 <= N <= 100): ");
        int N = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 366) {
            System.out.println("INCORRECT DAY NUMBER");
            return;
        }
        if (N < 1 || N > 100) {
            System.out.println("INCORRECT VALUE OF 'N'");
            return;
        }

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

        int month = 0;
        int day = dayNumber;
        for (int i = 0; i < 12; i++) {
            if (day > daysInMonths[i]) {
                day -= daysInMonths[i];
            } else {
                month = i;
                break;
            }
        }

        System.out.println("ENTERED DATE: " + monthNames[month] + " " + day + ", " + year);

        day += N;
        while (day > daysInMonths[month]) {
            day -= daysInMonths[month];
            month++;
            if (month == 12) {
                month = 0;
                year++;
            }
        }

        System.out.println(N + " DAYS LATER: " + monthNames[month] + " " + day + ", " + year);
    }
}


Terminal Output


