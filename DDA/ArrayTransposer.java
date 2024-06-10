package DDA;
/*
1. Define a Java class named `ArrayTransposer` within the package `DDA`.
2. Declare instance variables `arr` (a 2D integer array) and `m` (an integer representing the size of the square matrix).
3. Create a constructor `ArrayTransposer` that takes an integer `mm` as a parameter to initialize the size of the square matrix.
4. Inside the constructor, assign the value of `mm` to `m` and initialize the `arr` array with dimensions `m` by `m`.
5. Define a method `fillArray` to populate the matrix with user input.
6. Within the `fillArray` method, create a `Scanner` object to read user input.
7. Prompt the user to enter the elements of the array.
8. Use nested loops to iterate over each element of the array and store the user input in the corresponding array position.
9. Define a method `Transpose` to transpose the matrix.
10. Create a temporary 2D integer array `temp` to hold the transposed matrix.
11. Use nested loops to iterate over each element of the matrix.
12. Swap the elements of the matrix with their corresponding positions (row and column) in the temporary array to transpose the matrix.
13. Copy the transposed matrix from the temporary array back to the original matrix.
14. Define a method `display` to print the original and transposed matrices.
15. Within the `display` method, print "Original Matrix:" to indicate the display of the original matrix.
16. Use nested loops to iterate over each element of the original matrix and print its value.
17. After printing each row, add a newline character to move to the next line.
18. In the `main` method, create a `Scanner` object to read user input for the size of the square matrix.
19. Create an instance of the `ArrayTransposer` class with the size obtained from user input.
20. Call the `fillArray` method to populate the matrix, display the original matrix, transpose it using the `Transpose` method, and display the transposed matrix using the `display` method.
*/
import java.util.Scanner;

public class ArrayTransposer {
    int arr[][];
    int m;
    ArrayTransposer(int mm){
        m=mm;
        arr=new int[m][m];
    }
    void fillArray(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the elements in the Array: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
    }
    void Transpose(){
        int temp[][]=new int[m][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                temp[i][j]=arr[j][i];
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=temp[i][j];
            }
        }
    }
    void display(){
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        ArrayTransposer transposer = new ArrayTransposer(size);
        transposer.fillArray();
        System.out.println("Original Matrix:");
        transposer.display();
        transposer.Transpose();
        System.out.println("Transposed Matrix:");
        transposer.display();
    }
}