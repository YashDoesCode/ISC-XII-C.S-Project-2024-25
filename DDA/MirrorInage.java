package DDA;
/**
 Question 7:
Write a program in java to create a class “MirrorImage” and display the mirrored image of a 2D-array of m*n matrix.
Example
INPUT: n=4
Original Array:
8	15	9	18
9	10	7	6
10	8	11	13
12	16	17	19
Modified Array:
18	9	15	8
6	7	10	9
13	11	8	10
19	17	16	12
Algorithm
1.	Start.
2.	Import java.util.Scanner.
3.	Define Display(int[][] arr) to print a 2D array.
4.	Define arrMirrorer(int[][] arr) to create a mirror image of the array.
5.	Inside Display, loop through rows and columns of arr.
6.	Print each element followed by a tab and a new line after each row.
7.	Inside arrMirrorer, initialize n as the length of arr.
8.	Create a new 2D array ModdedArray of size n x n.
9.	Loop through rows and columns of arr.
10.	Assign ModdedArray[i][j] to arr[i][n - j - 1] to mirror horizontally.
11.	Return ModdedArray.
12.	Define main method.
13.	Create a Scanner object for input.
14.	Prompt and read integer n as the size of the array.
15.	Create a 2D array arr of size n x n.
16.	Prompt user to enter elements of the array.
17.	Loop through rows and columns to read and store input in arr.
18.	Print "Original array:" and call Display(arr).
19.	Create ModdedArray by calling arrMirrorer(arr).
20.	Print "Modified array:" and call Display(ModdedArray).
21.	End
 */
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

