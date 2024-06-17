# ISCXII-CSProject2024-25
# Question 1 :

Write a code in Java to create a class named “MaxMinAvgArray” and perform the following functions as listed below :

1. Take input of the Array length and its elements from the user using Scanner class.
2. Sort the Array in Ascending order using bubble sort technique only.
3. Then from the sorted Array, Find :
    1. Greatest valued integer in the Array.
    2. Least valued integer in the Array.
    3. Average value of all the integer elements stored in the Array.

Write the main method as well and call all the objects, print greatest, lowest and average asked above.

### Algorithm

1. **Start**
2. Import the Scanner class and define the `MaxMinAvgArray` class.
3. Declare a public integer array variable called ‘array’.
4. Create a constructor that assigns the input array to ‘array’.
5. Implement a `‘bubbleSort()’` method.
6. Initialize a Boolean variable ‘temp’.
7. Iterate over the array, swapping adjacent elements if necessary.
8. Define ‘`findMax()’` and `‘findMin()’` methods.
9. Initialize ‘max’ and ‘min’ variables.
10. Iterate over the array, updating `‘max’` and `‘min’.`
11. Implement `‘calculateAverage()’` method.
12. Initialize ‘sum’ and iterate over the array, adding elements.
13. Return the average as a double.
14. Define `‘printArray()’` method to print array elements.
15. Create a Scanner object and read the array size.
16. Read integers for the array.
17. Create a `MaxMinAvgArray` object.
18. Sort the array using bubble sort technique.
19. Find max, min, average and print the result.
20. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | array | int[] | Array of integers to be processed. |
| 2 | n | int | Length of the array. |
| 3 | temp | boolean | Flag to check if any swapping occurred during sorting. |
| 4 | i | int | Loop counter for outer loop in sorting and array input. |
| 5 | j | int | Loop counter for inner loop in sorting. |
| 6 | swap | int | Temporary variable to hold value during swapping. |
| 7 | max | int | Variable to store the maximum value in the array. |
| 8 | min | int | Variable to store the minimum value in the array. |
| 9 | num | int | Loop variable to iterate through the array. |
| 10 | sum | int | Variable to store the sum of array elements. |
| 11 | average | double | Variable to store the average value of array elements. |
| 14 | n | int | Number of elements in the array, input by user. |

### Program

```java
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
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/d873096a-6cde-4f39-afe1-678a753fe943/Untitled.png)

---

# Question 2:

A University has implemented a specific sorting system to arrange the final percentage marks scored by students from highest to lowest. 

Write a Java program that allows the user to input the names and percentage marks of students as printed on their University report cards. Utilize the insertion sort technique within your program to sort the students based on their percentage marks. After sorting, segregate the 'Top scorers'—students with the highest marks above the students who scored lower.

### Algorithm

1. Start.
2. Import `java.util.Scanner`.
3. Define `Student` class with `name` and `score` as instance variables.
4. Define constructor `Student(name, score)` to initialize `name` and `score`.
5. Define `getName()` method to return `name`.
6. Define `getScore()` method to return `score`.
7. Define `toString()` method to return `name` and `score` as a formatted string.
8. Define `StudentScoreSort` class with `main` method.
9. Create a `Scanner` object to read input.
10. Prompt the user to enter the number of students.
11. Read and store the number of students.
12. Create an array `students` of `Student` objects with size `n`.
13. Iterate to input details for each student:
a. Prompt the user to enter details for each student.
b. Read and store the name of the student.
c. Read and store the score of the student.
d. Create a new `Student` object with the entered name and score.
e. Store the `Student` object in the `students` array.
14. Call `insertionSort(students)` to sort the `students` array based on scores.
15. Print "Sorted list of students:".
16. Iterate over the `students` array:
a. Print each `Student` object using its `toString()` method.
17. Define `insertionSort(students)` method:
a. Initialize `n` to the length of `students`.
b. Iterate from index 1 to `n - 1`:
i. Assign `students[i]` to `key`.
ii. Initialize `j` to `i - 1`.
iii. Iterate while `j` is greater than or equal to 0 and `students[j].getScore()` is greater than `key.getScore()`:
A. Shift `students[j]` to `students[j + 1]`.
B. Decrement `j` by 1.
iv. Assign `key` to `students[j + 1]`.
18. End.

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | n | int | Number of students |
| 2 | students | Student[] | Array of Student objects |
| 3 | i | int | Loop counter |
| 4 | name | String | Name of the student |
| 5 | score | int | Score of the student |
| 6 | key | Student | Temporary Student object for sorting |
| 7 | j | int | Loop counter for sorting |
| 8 | student | Student | Iterates through array of Student objects |

### Program

```java
import java.util.Scanner;

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public String toString() {
        return name + ": " + score;
    }
}
public class StudentScoreSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            students[i] = new Student(name, score);
        }
        insertionSort(students);
        System.out.println("\nSorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}

```

### Terminal Output

---

# Question 3:

Write a program in Java, which contains methods to find the kth smallest and kth largest elements in an array, and to calculate the sum of the first k smallest elements.

$Example:$

```
Original array: [12, 3, 5, 7, 19]
The 3th smallest element is: 5
The 3th largest element is: 7
Sum of the first 3 smallest elements: 20
Sorted array after finding kth smallest: [3, 5, 7, 12, 19]
```

Design a program to:

1. Accept an array of integers.
2. Prompt the user to enter a value for k.
3. Find and display the kth smallest element in the array.
4. Find and display the kth largest element in the array.
5. Calculate and display the sum of the first k smallest elements in the array.
6. Display the sorted array after finding the kth smallest element.

Ensure to handle invalid input appropriately and display informative messages.

### Algorithm

1. Start
2. Implement a method `findKthSmallest` to find the kth smallest element in an array.
3. Iterate from 0 to k - 1 to find the kth smallest element.
4. Within the loop, find the index of the minimum element.
5. Swap the minimum element with the element at index i.
6. Return the kth smallest element at index k - 1.
7. Define a method `findKthLargest` to find the kth largest element in an array.
8. Iterate from 0 to k - 1 to find the kth largest element.
9. Within the loop, find the index of the maximum element.
10. Swap the maximum element with the element at index i.
11. Return the kth largest element at index k - 1.
12. Implement a method `sumOfFirstKSmallest` to calculate the sum of the first k smallest elements in an array.
13. Initialize a variable `sum` to 0.
14. Iterate from 0 to k - 1 to sum the first k smallest elements.
15. Return the sum of the first k smallest elements.
16. In the `main` method, initialize an integer array `arr` with predefined values.
17. Prompt the user to input the value of k.
18. Read the value of k from the user.
19. Print the original array.
20. Call the methods `findKthSmallest`, `findKthLargest`, and `sumOfFirstKSmallest` with appropriate arguments, and print their results.
21. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | arr | int[] | Array of integers |
| 2 | k | int | Position of the kth element |
| 3 | minIndex | int | Index of the current minimum element |
| 4 | j | int | Loop counter for inner loop |
| 5 | temp | int | Temporary variable for swapping elements |
| 6 | kthSmallest | int | The kth smallest element in the array |
| 7 | maxIndex | int | Index of the current maximum element |
| 8 | kthLargest | int | The kth largest element in the array |
| 9 | sum | int | Sum of the first k smallest elements |

### Program

```java
import java.util.*;

public class KthSmallestElement {
    
    public static int findKthSmallest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[k - 1];
    }

    public static int findKthLargest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr[k - 1];
    }

    public static int sumOfFirstKSmallest(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        
        int kthLargest = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
        
        int sum = sumOfFirstKSmallest(arr, k);
        System.out.println("Sum of the first " + k + " smallest elements: " + sum);
        
        System.out.println("Sorted array after finding kth smallest: " + Arrays.toString(arr));
    }
}

```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/bf022f2b-00ff-41a3-b4d6-22acefb91cdc/Untitled.png)

---

# Question 4:

A Circular Prime is a Prime number that is Prime under cyclic shelter it digits. When the left most digits is removed and replaced at the end of the remaining string of digits, The generated number is still prime. The process is repeated with the original number is reached again

$Example$

131, 311, 113 etc

### Algorithm

1. Start
2. Define a Java class named `CircularPrime`.
3. Implement a method `isPrime` to check if a given number is prime.
4. Initialize a variable `c` to count the factors of the number.
5. Iterate from 1 to the given number to count the factors.
6. If the count `c` equals 2, return 1 indicating the number is prime; otherwise, return 0.
7. Implement a method `CircularCheck` to check if a number is a circular prime.
8. Initialize variables `f` and `m` to track the circular check and store the original number, respectively.
9. Convert the integer `m` to a string `S`.
10. Initialize an empty string `a` to store circular permutations.
11. Print the original number `m`.
12. Iterate through each character in the string `S`.
13. Extract the first character `ch` of `S`.
14. Create a substring `P` containing only the first character `ch`.
15. Create a circular permutation `a` by concatenating the substring `P` with the remaining characters of `S`.
16. Convert the circular permutation `a` back to an integer `m`.
17. Check if the integer `m` is prime using the `isPrime` method.
18. If `m` is not prime, set `f` to 1, reset the string `a`, and break the loop.
19. If `f` is 1, print "Not a Circular Prime !" and return.
20. If the loop completes without setting `f` to 1, print "Circular Prime !".
21. In the `main` method, prompt the user to input a number to check for circular prime. Then, call the `CircularCheck` method with the input number.
22. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | n | int | Input number to check for Circular Prime |
| 2 | c | int | Counter for number of divisors |
| 3 | f | int | Flag to indicate non-circular prime |
| 4 | m | int | Temporary variable for modified number |
| 5 | S | String | String representation of the number |
| 6 | a | String | Temporary string for rotations |
| 7 | i | int | Loop counter |
| 8 | ch | char | First character of the string representation |
| 9 | P | String | String representation of the first character |
| 10 | num | int | Number input by user |

### Program

```java
import java.util.Scanner;

public class CircularPrime {
    int isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return 1;
        } else {
            return 0;
        }
    }
    void CircularCheck(int n) {
        int f = 0, m = n;
        String S = Integer.toString(m);
        String a = "";
        System.out.println(m);

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(0);
            String P = Character.toString(ch);
            a = S.substring(1).concat(P);
            System.out.println(a);
            m = Integer.parseInt(a);

            if (isPrime(m) == 0) {
                f = 1;
                a = "";
                if (f == 1) {
                    System.out.println("Not a Circular Prime !");
                    return;
                }
            }
        }
        System.out.println("Circular Prime !");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check for Circular Prime: ");
        int num = scanner.nextInt();

        CircularPrime circularPrime = new CircularPrime();
        circularPrime.CircularCheck(num);
    }
}
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/a1ea3997-8e5d-4465-bffe-31904a163111/Untitled.png)

---

# Question 5:

Write a program in java to create a class “MirrorImage” and display the mirrored image of a 2D-array of m*n matrix.

**Example**

**INPUT:** n=4

Original Array: 

| 8 | 15 | 9 | 18 |
| --- | --- | --- | --- |
| 9 | 10 | 7 | 6 |
| 10 | 8 | 11 | 13 |
| 12 | 16 | 17 | 19 |

Modified Array:

| 18 | 9 | 15 | 8 |
| --- | --- | --- | --- |
| 6 | 7 | 10 | 9 |
| 13 | 11 | 8 | 10 |
| 19 | 17 | 16 | 12 |

### Algorithm

1. Start.
2. Import `java.util.Scanner`.
3. Define `Display(int[][] arr)` to print a 2D array.
4. Define `arrMirrorer(int[][] arr)` to create a mirror image of the array.
5. Inside `Display`, loop through rows and columns of `arr`.
6. Print each element followed by a tab and a new line after each row.
7. Inside `arrMirrorer`, initialize `n` as the length of `arr`.
8. Create a new 2D array `ModdedArray` of size `n x n`.
9. Loop through rows and columns of `arr`.
10. Assign `ModdedArray[i][j]` to `arr[i][n - j - 1]` to mirror horizontally.
11. Return `ModdedArray`.
12. Define `main` method.
13. Create a `Scanner` object for input.
14. Prompt and read integer `n` as the size of the array.
15. Create a 2D array `arr` of size `n x n`.
16. Prompt user to enter elements of the array.
17. Loop through rows and columns to read and store input in `arr`.
18. Print "Original array:" and call `Display(arr)`.
19. Create `ModdedArray` by calling `arrMirrorer(arr)`.
20. Print "Modified array:" and call `Display(ModdedArray)`.
21. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | arr | int[][] | Original 2D array |
| 2 | n | int | Size of the 2D array (number of rows/cols) |
| 3 | ModdedArray | int[][] | Mirrored version of the original 2D array |
| 4 | i | int | Loop counter for rows |
| 5 | j | int | Loop counter for columns |

### Program

```java
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
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/fceb6293-4360-4388-9b8c-0b027a53701b/Untitled.png)

---

# Question 6:

Declare a Square Matrix A[][] of order m*m where ‘m’ is the number of rows and the number of columns, such that M must be greater than 2 and lesser than 10. Accept the value of M from the user. Display an appropriate message for an Invalid input. Allow the user to to input integers into this matrix, perform :

1. Display the Original Matrix
2. Rotate the Matrix by 90 Degrees
3. Find the sum of the elements of the four corners of the matrix.

**Example**

**INPUT:** m=3

**Original Matrix**

| 1 | 2 | 3 |
| --- | --- | --- |
| 6 | 5 | 4 |
| 7 | 8 | 9 |

**Rotated Matrix**

| 3 | 4 | 9 |
| --- | --- | --- |
| 2 | 5 | 8 |
| 1 | 6 | 7 |

**Example 2**

**INPUT:** m=4

**Original Matrix**

| 1 | 2 | 4 | 9 |
| --- | --- | --- | --- |
| 2 | 5 | 8 | 3 |
| 1 | 6 | 7 | 4 |
| 3 | 7 | 6 | 5 |

**Rotated Matrix**

| 3 | 1 | 2 | 1 |
| --- | --- | --- | --- |
| 7 | 6 | 5 | 2 |
| 6 | 7 | 8 | 4 |
| 5 | 4 | 3 | 9 |

### Algorithm

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

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | a | int[][] | Original matrix |
| 2 | b | int[][] | Rotated matrix |
| 3 | r | int | Number of rows in the matrices |
| 4 | c | int | Number of columns in the matrices |
| 5 | x | int | Input parameter for rows |
| 6 | y | int | Input parameter for columns |
| 7 | i | int | Loop counter for rows |
| 8 | j | int | Loop counter for columns |
| 9 | input | Scanner | Scanner object for user input |

### Program

```java
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

```

---

# Question 7:

A class SwapSort has been defined to perform string related operations on a word input:

**Class Name** 

**Data Members/Instance Variables**

wrd 

:To store a word

len 

:To store length of the word inputted

swapwrd 

:To store the swapped word

sortwrd 

:To store the sorted word

**Member Functions**

SwapSort() 

:Default constructor to initialize data members with legal initial value.

void readword()

 :To accept a word in upper case.

void swapChar() 

:To swap the first and last character of the word in ‘wrd’ and stores the new word in “Swapwrd”

void sortword() 

:Sort the character of the original word in alphabetical order and stores it in ‘sortwrd’

void display() 

:Displays the original word, swapped word and the sorted word.

Specify the class SwapSort() giving the details of the constructor, void readword(), void swapChar(), void sortword() and void display(). Define the main function to create an object and call the functions accordingly to enable the task.

```java
**INPUT:** Swapped Word: ****HELLO
**OUTPUT:** Sorted Word: ****EHILO
```

### Algorithm

1. Start.
2. Define class `SwapSort`.
3. Declare instance variables `wrd`, `len`, `swapwrd`, `sortwrd`.
4. Define default constructor `SwapSort()` to initialize variables.
5. Define method `readword()` to read a word from user input and convert to uppercase.
6. Define method `swapChar()` to swap first and last characters of `wrd`.
7. Check if `len > 1`, assign `swapwrd` as last char + middle + first char, else assign `wrd`.
8. Define method `sortword()` to sort characters of `wrd`.
9. Convert `wrd` to `char` array, sort using `Arrays.sort()`, convert back to `String`.
10. Define method `display()` to print original, swapped, and sorted words.
11. Print "Original Word: " followed by `wrd`.
12. Print "Swapped Word: " followed by `swapwrd`.
13. Print "Sorted Word: " followed by `sortwrd`.
14. Define `main` method.
15. Create object `obj` of class `SwapSort`.
16. Call `readword()` on `obj` to input and store word.
17. Call `swapChar()` on `obj` to swap characters.
18. Call `sortword()` on `obj` to sort characters.
19. Call `display()` on `obj` to output original, swapped, and sorted words.
20. End.

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | wrd | String | Original word entered by the user |
| 2 | len | int | Length of the original word |
| 3 | swapwrd | String | Word after swapping the first and last characters |
| 4 | sortwrd | String | Word after sorting its characters |
| 5 | sc | Scanner | Scanner object for user input |
| 6 | chars | char[] | Array to store characters of the original word |

### Program

```java
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
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/38091f2b-9514-47ee-bda5-a533a16eeb1e/Untitled.png)

---

# Question 8:

Write a program in Java to input ‘n’ number of elements in a 2D-Array and implement Scanner class to take elements and the size of the array from the user. After taking input into the Squre Matrix, calculate the sum of the array border elements or boundary elements sum. Perform the following functions:

1. Take input in the Boundary of the Square Matrix (Top Row, Right Column, Lef Column and Bottom Row)
2. Display the inputted array in the matrix format.
3. Calculate the boundary sum of all the boundary elements.

### Algorithm

1. Start 
2. Import `java.util.Scanner`.
3. Define the `BoundaryElements` class.
4. Define the `main` method.
5. Create a `Scanner` object for input.
6. Prompt and read the order of the square matrix.
7. Initialize a 2D array `matrix` with the specified order.
8. Prompt and read the top row elements.
9. Prompt and read the right column elements (excluding first and last).
10. Prompt and read the bottom row elements in reverse order.
11. Prompt and read the left column elements in reverse order (excluding first and last).
12. Print the square matrix.
13. Define the `calculateBoundarySum` method.
14. Initialize the sum variable to 0.
15. Loop through and add the top row elements to sum.
16. Loop through and add the right column elements to sum.
17. Loop through and add the bottom row elements to sum.
18. Loop through and add the left column elements to sum.
19. Return the sum from `calculateBoundarySum`.
20. Print the sum of all boundary elements.
21. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Scanner object for user input |
| 2 | order | int | Order of the square matrix |
| 3 | matrix | int[][] | 2D array representing the square matrix |
| 4 | i | int | Loop counter for rows |
| 5 | j | int | Loop counter for columns |
| 6 | boundarySum | int | Sum of all boundary elements in the matrix |
| 7 | sum | int | Sum of boundary elements in the calculateBoundarySum method |

### Program

```java
import java.util.Scanner;

public class BoundaryElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the order of the square matrix: ");
        int order = scanner.nextInt();
        int[][] matrix = new int[order][order];
        
        System.out.println("Enter the boundary elements of the square matrix:");
        
        System.out.print("Top row: ");
        for (int i = 0; i < order; i++) {
            matrix[0][i] = scanner.nextInt();
        }
        System.out.print("Right column (excluding first and last elements): ");
        for (int i = 1; i < order - 1; i++) {
            matrix[i][order - 1] = scanner.nextInt();
        }
        System.out.print("Bottom row (in reverse order): ");
        for (int i = order - 1; i >= 0; i--) {
            matrix[order - 1][i] = scanner.nextInt();
        }
        System.out.print("Left column (excluding first and last elements, in reverse order): ");
        for (int i = order - 2; i > 0; i--) {
            matrix[i][0] = scanner.nextInt();
        }
        System.out.println("Square Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int boundarySum = calculateBoundarySum(matrix, order);
        System.out.println("Sum of all boundary elements: " + boundarySum);
    }
    public static int calculateBoundarySum(int[][] matrix, int order) {
        int sum = 0;
        for (int i = 0; i < order; i++) {
            sum += matrix[0][i];
        }
        for (int i = 1; i < order - 1; i++) {
            sum += matrix[i][order - 1];
        }
        for (int i = 0; i < order; i++) {
            sum += matrix[order - 1][i];
        }
        for (int i = 1; i < order - 1; i++) {
            sum += matrix[i][0];
        }
        return sum;
    }
}
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/7fc45efa-c192-45fb-beee-8f1408c9baa8/Untitled.png)

---

# Question 9:

An encoded text can be decoded by finding the actual character for the ASCII code in the encoded message. Write a program to input an encoded text having only sequence of ASCII values without any spaces. Any code or value which is not in the range of 65 to 90 or 97 to 97 to 122 (a-2) or 32 ( ) will be ignored and should not appear in the output message. Write a program to accept a code which contains only digit (0 to 9). Display an error message if it contains any character. Perform the following tasks :

1. Decode the encoded text as per the above instructions.
2. The first letter of each word must be changed to uppercase and remaining to lowercase.
3. Any consecutive sets of code 32 will be taken as only one black space.
4. Display it in the form of a sentence.

$Example$

```java
Input : 10665771011153266797868
Output : James Bond

Input : 667685693232837589
Output : Blue Sky

Input : 22-768#5693232375889
Output : Invalid Code
```

### Algorithm

1. Start
2. Initialize the scanner to read input from the user.
3. Prompt the user to enter the encoded text.
4. Read the encoded text entered by the user.
5. Call the `isValid` function with the encoded text as an argument.
6. In `isValid`, loop through each character in the encoded text.
7. For each character in `isValid`, check if it's a digit (between '0' and '9').
8. If a character is not a digit, return `false` from `isValid`.
9. If all characters are digits, return `true` from `isValid`.
10. Check the return value of `isValid`.
11. If the return value is `false`, print "Invalid Code".
12. If the return value is `true`, call the `Decoder` function with the encoded text as an argument.
13. In `Decoder`, initialize an empty string `d` to store decoded output and an index `i` starting from 0.
14. While `i` is less than the length of the encoded text, check if three-digit substrings can be converted to ASCII characters (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to `d`, and increment `i` by 3.
15. If a three-digit substring does not represent a valid character, check if a two-digit substring can be converted to an ASCII character (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to `d`, and increment `i` by 2.
16. If neither three-digit nor two-digit substrings yield a valid character, increment `i` by 1.
17. Once all characters are processed, return the decoded string `d` from `Decoder`.
18. Call the `Caser` function with the decoded text `d` as an argument.
19. In `Caser`, split the decoded text into words and initialize an empty string `sx` to store formatted text. Loop  and capitalize the first letter and finally print `sx`
20. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | s | String | Encoded text input by the user |
| 2 | c | char | Character in the string used for validation |
| 3 | d | String | Decoded string |
| 4 | i | int | Loop counter for traversing the string |
| 5 | c | int | Integer value parsed from the substring |
| 6 | st | String | Decoded string before case formatting |
| 7 | w | String[] | Array of words in the decoded string |
| 8 | sx | String | String after case formatting |
| 9 | word | String | Individual word from the array of words |
| 10 | scanner | Scanner | Scanner object for user input |
| 11 | sxt | String | Final formatted decoded string |

### Program

```java
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
```

### Terminal Output :

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/7ac16481-e2a7-4f81-935f-a70cc69a9cc0/Untitled.png)

---

# Question 10:

Write a Program in Java to accept a sentence which may be terminated by either ‘.’,’?’ or ‘!’ only. The words may be seperated by more than one blank space and are in Upper case. Perform the following operations :

1. Find the number of words beginning and ending with a vowel.
2. Place the words which begin with a vowel at the beginning, followed by the remaining words as they occur in the sentence.

**Example** 

```java
**INPUT:** ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE
**OUTPUT:** No. of words beginning and ending with a vowel = 3
        ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL
```

### Algorithm

1. Start
2. Import `java.util.Scanner`.
3. Define the `VowelWords` class.
4. Define the `isVowel` method to check if a character is a vowel.
5. In the `isVowel` method, return `true` if the character exists in the string "AEIOU"; otherwise, return `false`.
6. Define the `countVowelWords` method to count words starting and ending with vowels.
7. In the `countVowelWords` method, trim the input sentence and split it into words using whitespace as delimiter.
8. Initialize `count` to 0 for counting vowel words.
9. Loop through each word in the `words` array:
    - Check if the first and last characters of the word are vowels using `isVowel` method.
    - If both characters are vowels, increment `count`.
10. Return `count`.
11. Define the `reorderWords` method to reorder words in the sentence.
12. In the `reorderWords` method, trim the input sentence and split it into words using whitespace as delimiter.
13. Initialize `vowels` and `others` as empty strings for storing reordered words.
14. Loop through each word in the `words` array:
    - If the first character of the word is a vowel, concatenate the word with a space to `vowels`.
    - Otherwise, concatenate the word with a space to `others`.
15. Concatenate `vowels` and trimmed `others` to `reorderedSentence`.
16. Return `reorderedSentence`.
17. Define the `main` method to execute the program.
18. Create a `Scanner` object `scanner` to read user input.
19. Prompt the user to enter a sentence terminated by '.', '?' or '!'; convert input to uppercase.
20. Calculate `vowelWordCount` using `countVowelWords` method and reorder the sentence using `reorderWords` method.
21. Print the number of vowel words and the reordered sentence.
22. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | ch | char | Character to check if it is a vowel |
| 2 | sentence | String | Sentence input by the user |
| 3 | words | String[] | Array of words split from the sentence |
| 4 | count | int | Count of words that start and end with a vowel |
| 5 | i | int | Loop counter for traversing through words |
| 6 | vowels | String | String holding words starting with vowels |
| 7 | others | String | String holding words starting with non-vowels |
| 8 | input | String | User input sentence in uppercase |
| 9 | vowelWordCount | int | Number of words starting and ending with a vowel |
| 10 | reorderedSentence | String | Reordered sentence with all vowel-starting words followed by non-vowel starting words |

### Program

```java
import java.util.*;

public class VowelWords {
    static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }
    static int countVowelWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }
    static String reorderWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
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
```

# Question 11:

A class Capital has been defined to check whether a sentence has words beginning with a capital letter or not.

**Class Name:** Capitalizer

**Data Members/Instance Variables**

sent :To store a sentence 

frequency: To store the frequency of the words beginning with a letter.

**Member Functions**

Capital() :Default Constructor

void input() :To accept a sentence

boolean isCapital(String w) :Checks and returns true if the word begins with a capital letter otherwise returns false.

void display() :Displays the sentence along with the frequency of the words beginning with a capital letter.

Specify the class Capital, giving the details of the constructor(), void input(), boolean isCapital(String) and void display(). Define the main function to create an object and call the functions accordingly to enable the task.

**Example** 

```java
**INPUT:** The Quick Brown Fox Jumps Over the lazy Dog.
**OUTPUT:** Frequency: 7

**INPUT:** The Man walks Over To The Edge Of the Cliff.
**OUTPUT:** Frequency: 8

**INPUT:** The branches of the Trees are gnarled and Twisted.
**OUTPUT:** 3
```

### Algorithm

1. Start 
2. Import `java.util.Scanner`.
3. Define the `Capitalizer` class.
4. Declare static variables `sent` (for the sentence) and `frequency` (for counting title words).
5. Define the `Capitalizer` constructor to initialize `sent` and `frequency`.
6. Define the `input` method to read the sentence from the user.
7. In the `input` method, create a `Scanner` object for input.
8. Prompt the user to enter a sentence.
9. Store the entered sentence in the `sent` variable.
10. Define the `isCapital` method to check if the first character of a word is uppercase.
11. In the `isCapital` method, get the first character of the word.
12. Return `true` if the character is uppercase; otherwise, return `false`.
13. Define the `display` method to show the sentence and the frequency of title words.
14. Print the sentence.
15. Add a space before the sentence to handle the first word uniformly.
16. Loop through each character of the modified sentence.
17. Check if the character is a space and the next character exists.
18. If the next character is uppercase, increment the `frequency`.
19. Print the frequency of title words.
20. In the `main` method, create an instance of `Capitalizer`, call `input` method, and then call `display` method. End the program.
21. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | sent | String | Sentence input by the user |
| 2 | frequency | int | Frequency count of title-cased words in the sentence |
| 3 | scanner | Scanner | Scanner object for user input |
| 4 | w | String | Word from the sentence to check if it starts with uppercase |
| 5 | b | String | Modified sentence with a leading space for easy parsing |
| 6 | c | char | Character at a specific position in the sentence |
| 7 | i | int | Loop counter for traversing the sentence |

### Program

```java
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
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/4c02a805-1345-4bdd-83ce-a7b8fbade413/Untitled.png)

# Question 12:

Caesar Ciphor is an encyrption technique which is implemented as ROT13 (rotate by 13 places). It is a simple letter substitution cipher that replaces a letter 13 places after it is in the alphabets, with the other character remaining unchanged.

Write a program in Java to accept a plain text of length ‘l’, where l must be greater than 3 and lesser than 100. Encrypt the text if valid as per the Caesar Cipher. Test your program with the sample data and some random data.

**Example**

```java
**INPUT:** You
**OUTPUT:** Invalid Input

**INPUT:** Hello! How are you?
**OUTPUT:** Uryyb! Ubj ner lbh?
```

### Algorithm

1. Start
2. Import `java.util.Scanner`.
3. Define `CaesarCipher` class.
4. Define `main` method for program entry.
5. Create a `Scanner` object named `scanner`.
6. Prompt user to input plaintext and trim whitespace.
7. Read plaintext input into `plainText`.
8. Check if `plainText` length is between 4 and 99 characters.
9. If not, print "Invalid Input" and exit.
10. Call `encrypt` method with `plainText` as parameter.
11. Print "Encrypted text: " followed by the encrypted result.
12. Define `encrypt` method to encrypt using Caesar cipher:
13. End `encrypt` method.
14. End `main` method.
15. End `CaesarCipher` class.
16. Handle input using `Scanner.nextLine()` and `trim()` to remove extra spaces.
17. Validate input length using conditional checks.
18. Use character manipulation (`char`, `Character.isLetter()`, arithmetic operations) for encryption.
19. Ensure encrypted characters wrap around alphabet using modulo arithmetic.
20. Print results using `System.out.println()` for output.
21. End

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Scanner object to read user input |
| 2 | plainText | String | Stores the plaintext entered by the user |
| 3 | length | int | Length of the plaintext string |
| 4 | encryptedText | String | Stores the encrypted text generated by the encrypt function |
| 5 | text | String | Parameter of the encrypt method, represents the plaintext |
| 6 | encrypted | String | Stores each character of the plaintext after encryption |
| 7 | i | int | Loop variable used in iterating through characters of text |
| 8 | c | char | Temporary variable to store each character of text |

### Program

```java
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

```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/51379d74-7fb5-4364-8621-66221ec19db6/Untitled.png)

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

**Class name
Data members/instance variables:**

arr[][]

: to store integers in the matrix

m

: integer to store the size of the matrix 

**Method/Memeber Functions** 

Trans(int mm)

: parameterised constructor to initialise
the data member m = mm

void fillarray() 

: to enter integer elements in the matrix

void transpose()

: to create the transpose of the given
matrix

void display()

: displays the original matrix and the
transposed matrix by invoking the
method transpose()

Specify the class Trans giving details of the constructor( ), void fillarray( ),
void transpose() and void display(). Define a main() function to create an object and
call the functions accordingly to enable the task.

### Algorithm

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

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | arr | int[][] | Two-dimensional array to store the matrix elements |
| 2 | m | int | Size of the matrix (both rows and columns) |
| 3 | scanner | Scanner | Scanner object to read input from the user |
| 4 | mm | int | Parameter of the constructor Trans(int mm), represents the matrix size |
| 5 | transposed | int[][] | Temporary array used to store the transposed matrix during the transpose operation |

### Program

```java
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

```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/2be4cea1-2cfc-4c6f-86c7-1d09582bba17/Untitled.png)

---

# Question 14:

A class SortAlpha has been defined to sort the words in the sentence in alphabetical
order.

$Example$

```java
Input: THE SKY IS BLUE
Output: BLUE IS SKY THE
```

Some of the members of the class are given below:

**Class Name**

**Data Members/Instance Variables:**

sent

n

: to sotre a sentence

: integer to store the number of words in a sentence

**Methods/Member Functions:**

SortAlpha()

: default constructor to initialise data members with legal initial values

void Sort(SorAlpha P)

: Sorts the words of the sentence of object P in alphabetical order and stores the sorted sentence in the current object.

void display()

: Displays the original sentence along with the sorted sentence by invoking the method *sort()*

Specify the class SortAlpha giving details of the constructor(), void acceptsent( ),
void sort(SortAlpha) and void display(). Define a main() function to create an object
and call the functions accordingly to enable the task.

### Algorithm

1. Start
2. Import `java.util.*`.
3. Define `SortAlpha` class.
4. Declare `String sent` and `int n` as instance variables.
5. Define a constructor to initialize `sent` and `n`.
6. Define `acceptSent` method.
7. Create `Scanner` object `sc`.
8. Prompt user to enter a sentence.
9. Read sentence into `sent`.
10. Create `StringTokenizer` object `st` with `sent`.
11. Set `n` to the number of tokens in `st`.
12. Define `sort` method.
13. Create `StringTokenizer` object `st` with `sent`.
14. Create `String[] words` array of size `n`.
15. Populate `words` array with tokens from `st`.
16. Implement nested loop to sort `words` using bubble sort.
17. Reconstruct `sent` from sorted `words` array.
18. Define `display` method and the sorted sentence,
19. In `main` method, create `SortAlpha` object, call `acceptSent`, `sort`, and `display` methods.
20. End

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | sent | String | Stores the sentence input by the user |
| 2 | n | int | Stores the number of words in the sentence |
| 3 | sc | Scanner | Scanner object to read input from the user |
| 4 | st | StringTokenizer | Tokenizer to split the sentence into words |
| 5 | words | String[] | Array of words extracted from the sentence |

### Program

```java
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

```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/fa905626-b0b6-46e5-be1b-31e663f38e6c/Untitled.png)

---

# Question 15:

A number is said to be Bouncy Number if the digits of the number are unsorted. For example:

> 22344, Is not a bouncy number because the digits are sorted in Ascending order.
> 

> 774410, Is not a Bouncy number because the digits are unsorted.
> 

> 155349, Is a bouncy number because the digits are unsorted.
> 

**NOTE:** A number below 100 can never be a Bouncy number. 

Write a program in Java using Recursion to accept a number. Check and display whether it is a Bouncy number or not.

**Example**

```java
**INPUT:** 155349
**OUTPUT:** It is a Bouncy Number

**INPUT:** 123456
**OUTPUT:** It is not a Bouncy Number

**INPUT:** 4321
**OUTPUT:** It is not a Bouncy Number

**INPUT:** 98
**OUTPUT: A number below 100 can never be a Bouncy Number**
```

### Algorithm

1. Start
2. Define the `BouncyNumber` class.
3. Inside the class, define the `main` method.
4. Initialize a `Scanner` object to read input from the user.
5. Prompt the user to enter a number.
6. Read the input number using `scanner.nextInt()`.
7. Close the `Scanner` object.
8. Call the `isBouncy` method with the input number, `false` for increasing, `false` for decreasing, and `1` as the index.
9. Inside the `isBouncy` method, convert the input number to a string.
10. Check if the current index is greater than or equal to the length of the string.
11. If true, return the logical AND of increasing and decreasing.
12. Compare the current digit with the previous digit.
13. If the current digit is greater than the previous digit, set `increasing` to true.
14. If the current digit is less than the previous digit, set `decreasing` to true.
15. If both increasing and decreasing are true, return true.
16. Make a recursive call to `isBouncy` with the same number, updated increasing, updated decreasing, and index incremented by 1.
17. In the `main` method, store the result of the `isBouncy` method call in `isBouncy`.
18. If `isBouncy` is true, print that the number is a bouncy number.
19. Otherwise, print that the number is not a bouncy number.
20. End

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Used to take input from the user. |
| 2 | number | int | Stores the number entered by the user to check if it is a bouncy number. |
| 3 | numStr | String | String representation of the number to facilitate character comparison. |
| 4 | increasing | boolean | Indicates if the digits in the number are in increasing order at any point. |
| 5 | decreasing | boolean | Indicates if the digits in the number are in decreasing order at any point. |
| 6 | index | int | Keeps track of the current digit position being checked in the recursive method isBouncy. |

### Program

```java
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
```

### Terminal Output

---

# Question 16:

A Disarium Number is a number in which the sum of digits to the powers of this repetetive position is qual to the number itself.

For example: $135 = 1¹ + 3² + 5²$

Design a class “Disarium” to check if a given number is a Disarium number or not. Some of the details of the class are given below:

**Class Name:** Disarium

**Data Members/Instance Variable**

int num :Stores the number

int size :Store the size

**Member Functions**

Disarium (int nn) :Parameterized constructor to initialize the data members n=nn and size=0

void countDigit() :Count the total number of digits and assign it to size

int sumOfDigits (int n, int p) :Returns the sum of the digits to the power of this repetitive points using recursive technique.

void check() :Checks whether the number is a Disarium number and displays the result with appropriate message.

Create the main method and perform function calling.

**Example**

```java
**INPUT:** 135
**OUTPUT:** Disarium Number

**INPUT:** 111
**OUTPUT:** Not a Disarium Number
```

### Algorithm

1. Start
2. Define the `NumberBased` package.
3. Define the `DisariumNumber` class.
4. Define a static method `check` that takes an integer `n` as an argument.
5. Convert the integer `n` to a string to determine the number of digits and store the length in `DigitCounter`.
6. Initialize an integer variable `sum` to 0.
7. Initialize an integer variable `temp` to `n`.
8. Start a `while` loop that continues as long as `temp` is not equal to 0.
9. Inside the loop, calculate `r` as `temp` modulo 10 to get the last digit of `temp`.
10. Update `sum` by adding `r` raised to the power of `DigitCounter` to `sum`.
11. Decrement `DigitCounter` by 1.
12. Update `temp` by dividing it by 10 to remove the last digit.
13. End the `while` loop.
14. Return the result of the comparison between `sum` and `n`.
15. Define the `main` method in the `DisariumNumber` class.
16. Initialize an integer variable `n` with the value 89.
17. Call the `check` method with `n` and store the result.
18. Use a ternary operator to print "Disarium Number" if the result is true.
19. Otherwise, print "Not a Disarium Number".
20. End

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | n | int | Stores the number to be checked for being a Disarium number |
| 2 | DigitCounter | int | Stores the number of digits in n |
| 3 | sum | int | Accumulates the sum of each digit raised to the power of its position from right to left |
| 4 | temp | int | Temporary variable used to extract digits from n during the while loop |
| 5 | r | int | Stores the current rightmost digit of temp during each iteration of the while loop |

### Program

```java
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
        int n = 89;
        
        System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
    }
}
```

### Terminal Output

---

# Question 17:

A Unique Digit integer is a positive integer (without Leading-zeros) and with no duplicate digits. Given two positive integers ‘a’ and ‘b’. Write a program in Java to determine how many unique digit integer are there in the range between ‘a’ and ‘b’ and output them.

**Example**

```java
**INPUT:** Enter the values of m and n :
       a=100 b=120 
**OUTPUT:** The Unique digit integers are:
        102, 103, 104, 105, 106, 107, 108, 109, 120
        Frequency = 9
```

### Algorithm

1. Start
2. Import the `java.util.Scanner` package.
3. Define the `UniqueNumber` class.
4. Define the `main` method.
5. Create a `Scanner` object to read input from the user.
6. Print the message "Enter the Number to check".
7. Read the input number using `scanner.nextInt()`.
8. Convert the input number `n` to a string and store it in the variable `con`.
9. Initialize a boolean variable `ch` to `true`.
10. Start a `for` loop with an integer `i` initialized to 0, running while `i` is less than the length of `con`.
11. Inside the loop, get the character at index `i` in `con`.
12. Use the `indexOf` method to check if this character appears again in `con` starting from index `i + 1`.
13. If the character appears again, set `ch` to `false`.
14. Break out of the loop.
15. End the `for` loop.
16. Check the value of `ch`.
17. If `ch` is `true`, print "Unique".
18. Otherwise, print "Sorry, Not Unique".
19. Close the `Scanner` object.
20. End

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Scanner object to read input from the user |
| 2 | n | int | Stores the number input by the user |
| 3 | con | String | Converts the integer n to a string for easier manipulation and checking of unique digits |
| 4 | ch | boolean | Flag variable used to determine if all digits in the number n are unique |
| 5 | i | int | Loop variable used in the for loop to iterate through each character/digit in con |

### Program

```java
import java.util.Scanner;

public class UniqueNumber
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Number to check");
        int n = scanner.nextInt();
        String con = n +"";
        boolean ch =true;
        for (int i=0; i<con.length();i++)
        {
            if (con.indexOf(con.charAt(i),i+1) > -1)
            {
                ch = false;
                break;
            }
        }
        if (ch == true){
            System.out.println("Unique");
        }
        else {
            System.out.println("Sorry, Not Unique");
        }
    }
}
```

### Terminal Output

---

# Question 18:

Design a class “RecursivePrimePalindrome” to generate prime palindrome numbers. 

For Example: 11 (where 11 is a Prime number and a palindrome number)

Some of the members of the class are given below:

**Class Name:** RecursivePrimePalindrome

**Data Members/Instance Variables**

Start :To store the start of range

end :To store the end of range

**Member Methods/Functions**

PrimePalinGen (int a, int b) :Parameterized constructor to initialize the data members ‘a’ and end=b

int isPrime (int i) :Return 1 if the number is Prime other return 0

int isPalin (int i) :Return 1 if the number is a palindrome otherwise return 0

void generate () :Generate all Prime Palindrome number between start and end by invoking the function and isPrime() and isPalin()

Specify the class “RecursivePrimePalindrome” giving details of the constructor(), int isPrime (int), int isPalin (int) and void generate(). Define a main() function to create an object and call the functions accordingly to end the task.

### Algorithm

1. Start
2. Import `java.util.Scanner`
3. Define the `RecursivePrimePalindrome` class
4. Define the `main` method
5. Create a `Scanner` object
6. Print "Enter a number: "
7. Read input number `n` using `scanner.nextInt()`
8. Close the `Scanner` object
9. Call `isPrime(n, 2)`
10. Call `isPalindrome(n, 0, n)`
11. If both `isPrime` and `isPalindrome` return `true`, print "Prime Palindrome"
12. If either returns `false`, print "Sorry, Not a Prime Palindrome"
13. Define `isPrime` method with `n` and `i`
14. If `n <= 1`, return `false`
15. If `n == 2 || n == 3`, return `true`
16. If `n % i == 0`, return `false`
17. If `i * i > n`, return `true`
18. Recursively call `isPrime(n, i + 1)`
19. Define `isPalindrome` method with `n`, `reversed`, and `original`
20. If `n == 0`, return `reversed == original`; else, update `reversed` and call `isPalindrome(n / 10, reversed, original)`
21. End

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Scanner object to read input from the user |
| 2 | n | int | Stores the number input by the user |
| 3 | i | int | Used as an index in the isPrime recursive method to check for prime numbers |
| 4 | reversed | int | Used in the isPalindrome recursive method to store the reversed digits of the number |
| 5 | original | int | Used in the isPalindrome recursive method to store the original number for comparison with the reversed number |

### Program

```java
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
```

### Terminal Output

---

# Question 19:

An Evil Number is a positive whole number which has even number of 1’s in its Binary equivalent.

For Example: Binary Equivalent of 9 is 100, Which contains even number of 1’s. A few evil numbers are 3, 5, 6, 9. Design a program to accept a positive whole number and find the binary equivalent of the number and count the number of 1’s in it and display whether it is a Evil Number or not using Recursion, with an appropriate message.

**Example**

```java
**INPUT:** 15
       Binary Equivalent = 1111
       Number of 1's = 4
**OUTPUT: Evil Number

INPUT:** 26
       Binary Equivalent = 11010
       Nuumber of 1's = 3
**OUTPUT:** Not an Evil Number
```

### Algorithm

1. Start
2. Import `java.util.Scanner`
3. Define the `EvilNumber` class
4. Define the `main` method
5. Create a `Scanner` object
6. Print "Enter a non-negative integer: "
7. Read input number `number` using `scanner.nextInt()`
8. Initialize `countOnes` to 0
9. Start a `while` loop with the condition `number > 0`
10. Inside the loop, check if `number % 2 == 1`
11. If true, increment `countOnes`
12. Update `number` by dividing it by 2
13. End the `while` loop
14. Determine if `countOnes % 2 == 0` and assign to `isEvil`
15. Check the value of `isEvil`
16. If `isEvil` is true, print "The number is an evil number."
17. Otherwise, print "The number is not an evil number."
18. Close the `Scanner` object
19. End the `main` method
20. End 

### Variable Description Table

| Sr. No. | Variable Name | Data Type | Description |
| --- | --- | --- | --- |
| 1 | scanner | Scanner | Used to take input from the user. |
| 2 | number | int | Stores the non-negative integer entered by the user to check if it is an evil number. |
| 3 | countOnes | int | Keeps track of the count of '1's in the binary representation of the number. |
| 4 | isEvil | boolean | Indicates if the number is an evil number (true if the count of '1's is even, false otherwise). |

### Program

```java
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
```

### Terminal Output

---

# Question 20:

A composite Magic number is a positive integer which is composite as well as a Magic Number.

Write a Java program to accept two positive integers ‘m’ and ‘n’, where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below.

**Example** 

```java
**INPUT:** m=10
       n=100
**OUTPUT:The Composite magic numbers are: 10, 28, 46, 55, 64, 82, 91, 100
       Frequency of Composite magic numbers : 8**
```

**Example 2**

```java
**INPUT:** m=120
       n=90
**OUTPUT:** Invalid Input 
```

### Algorithm

1. Start.
2. Import `java.util.Scanner`.
3. Define `isComposite(int num)` method to check if a number is composite.
4. Define `sumOfDigits(int num)` method to calculate the sum of digits of a number.
5. Define `isMagicNumber(int num)` method to check if a number is a magic number.
6. Inside `isComposite`, return `false` if `num` <= 1.
7. Loop from 2 to `sqrt(num)` in `isComposite` and return `true` if `num` is divisible.
8. Return `false` in `isComposite` if no divisors are found.
9. Inside `sumOfDigits`, return 0 if `num` == 0, otherwise return `(num % 10) + sumOfDigits(num / 10)`.
10. Inside `isMagicNumber`, loop until `num` is a single digit, replacing `num` with the sum of its digits.
11. Return `true` in `isMagicNumber` if `num` is 1, otherwise return `false`.
12. Define `main` method.
13. Create `Scanner` object for input.
14. Prompt and read `m` and `n` values.
15. Print "Invalid Input" and return if `m` > `n`.
16. Print "The Composite magic numbers are: ".
17. Initialize `count` to 0 and `found` to `false`.
18. Loop from `m` to `n` inclusive, checking if the number is composite and a magic number.
19. Print the number, increment `count`, and set `found` to `true` if conditions are met.
20. Print "None" if no composite magic numbers found, then print "Frequency of Composite magic numbers: " followed by `count`. End.

### Variable Description Table

| Sr No. | Variable Name | Datatype | Description |
| --- | --- | --- | --- |
| 1 | num | int | Number to be checked for composite or magic |
| 2 | i | int | Loop counter |
| 3 | m | int | Lower bound of the range |
| 4 | n | int | Upper bound of the range |
| 5 | count | int | Counter for composite magic numbers |
| 6 | found | boolean | Flag to indicate if any composite magic number is found |

### Program

```java
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
```

### Terminal Output

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/0e8da209-d3a6-47bb-a60e-424afaf1e531/Untitled.png)

---

- Sample Paper 1
    
    # Question 22: `ERRORED`
    
    # Question 21:
    
    Write a Program to declare a matrix A[ ][ ] of order (M*N) where ‘M’ is the number of rows and ‘N’ is the number of columns such that both M and N must be greater than 2 and less than 10. Allow the user to input integers into this matrix. Display appropriate error message for an invalid input.
    
    Perform the following tasks on the matrix.
    
    1. Display the input matrix.
    2. Rotate the matrix by 270⁰ degrees anti-clock wise and display the resultant matrix.
    3. Calculate the sum of the odd elements of the matrix and display.
    
    Test your program for the following data and some random data:
    
    $Example 1→$
    
    ```java
    **INPUT:** M=3
           N=4
           ENTER ELEMENTS: 8, 7, 9, 3, -2, 0, 4, 5, 1, 3, 6, -4
           
    **OUTPUT: ORIGINAL MATRIX** 
            
    ```
    
    | 8 | 7 | 9 | 3 |
    | --- | --- | --- | --- |
    | -2 | 0 | 4 | 5 |
    | 1 | 3 | 6 | -4 |
    
    **ROTATED MATRIX (270⁰ ANTI-CLOCK WISE)**
    
    | 1 | -2 | 8 |
    | --- | --- | --- |
    | 3 | 0 | 7 |
    | 6 | 4 | 9 |
    | -4 | 5 | 3 |
    
    **SUM OF THE ODD ELEMENTS =28**
    
    $Example 2→$
    
    ```java
    **INPUT:** M=3
           N=2
           ENTER ELEMENTS: 9, 13, 41, 5, 6, -5
           
    **OUTPUT: ORIGINAL MATRIX** 
            
    ```
    
    | 9 | 13 | 41 |
    | --- | --- | --- |
    | 5 | 6 | -5 |
    
    **ROTATED MATRIX (270⁰ ANTI-CLOCK WISE)**
    
    | 5 | 9 |
    | --- | --- |
    | 6 | 13 |
    | -5 | 41 |
    
    **SUM OF THE ODD ELEMENTS =63**
    
    $Example 3→$
    
    ```java
    **INPUT:** M=2
           N=10
    **OUTPUT:** INVALID INPUT
    ```
    
    ### Algorithm
    
    ### Program
    
    # Question 23: `ERRORED`
    
    **Keyword cipher** is a form of eneryption technique. A keyword is used as the key, and it
    determines the letter matching the cipher alphabet to the plain alphabet. Repeats of letters in the word are removed, then the cipher alphabet is generated with the keyword matching to A, B, C etc. until the keyword is used up, whereupon the rest of the cipher text letters are used in
    alphabetical order, excluding those already used in the key.
    
    **Encryption:**
    The first line of input contains the keyword which you wish to enter. The second line of input
    contains the string which you have to encrypt.
    
    **Plaintext:** A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    
    **Encrypted:** K R Y P T O S A B C D E F G H I J L M N Q U V W X Z
    
    **Example →**
    
    Encrypting the message: KNOWLEDGE IS POWER when, Keyword is KRYPTOS
    
    **Decoded Message →** DGHVETPST BM IHVTL
    
    Write a program to accept a Coded text in upper case and a Keyword. Using the above technique
    decrypt the text and display.
    Note: ***All the messages are encoded in uppercase. Whitespace, special characters, and
    numbers remains unchanged.***
    
    Test your program for the following inputs:
    
    **$Example 1→$**
    
    ```java
    **INPUT:** ENTER KEYWORD: SECRET
           ENTER TEXT TO BE DECODED: ZLJEFT DTOT
    **OUTPUT:** DECODED TEXT: ZOMBIE HERE
    ```
    
    **$Example 2 →$**
    
    ```java
    **INPUT:** ENTER KEYWORD: STAR WARS
           ENTER TEXT TO BE DECODED: SPPSAG SP RSVJ
    **OUTPUT:** DECODED TEXT: ATTACK AT DAWN
    ```
    
    **$Example 3→$**
    
    ```java
    **INPUT:** ENTER KEYWORD: PLAYERS
           ENTER TEXT TO BE DECODED: Haln de yokl
    **OUTPUT: INVALID INPUT**
    ```
    
- Sample Paper 2
    
    # Question 24:
    
    Write a program in JAVA to accept day number (between I and 366) and year (yyyy) from the
    user and display the corresponding date. Also aocept 'N' from the user where (1 <- N <= 100) to
    compute and display the future date 'N' days after the given date. Display error message if the
    value of the day number or "N' are not within the limit. Day number is calculated taking 1 January
    of the given year as 1.
    
    Test your program with given set of data and some random data
    
    **Example 1**
    
    **INPUT:** DAY NUMBER: 50
    
                  YEAR: 2023
    
                   N: 25
    
    **OUTPUT:** ENTERED DATE: FEBRUARY 19, 2023
    
                      25 DAYS LATER: MARCH 16, 2023
    
    **Example 2**
    
    **INPUT:** DAY NUMBER: 321
    
                  YEAR: 2023
    
                   N: 77
    
    **OUTPUT:** ENTERED DATE: NOVEMBER17, 2023
    
                      77 DAYS LATER: FEBRUARY 2, 2024
    
    **Example 3**
    
    **INPUT:** DAY NUMBER: 400
    
                  YEAR: 2023
    
                   N: 125
    
    **OUTPUT:** INCORRECT DAY NUMBER
                       INCORRECT VALUE OF ‘N’
    
    ### Algorithm
    
    1. Start.
    2. Import `java.util.Scanner`.
    3. Define `FutureDate` class with `main` method.
    4. Create `Scanner` object to read input.
    5. Read and store day number (1-366).
    6. Read and store year (yyyy).
    7. Read and store N (1-100).
    8. Validate day number (1-366).
    9. If invalid, print "INCORRECT DAY NUMBER" and exit.
    10. Validate N (1-100).
    11. If invalid, print "INCORRECT VALUE OF 'N'" and exit.
    12. Define arrays `daysInMonths` and `monthNames`.
    13. Initialize `month` and `day` to 0.
    14. Iterate to find month for entered day.
    15. Calculate remaining day in month.
    16. Print entered date.
    17. Add N days to entered day.
    18. Handle month and year change if necessary.
    19. Print date N days later.
    20. End.
    
    ### Variable Description Table
    
    | Sr. No. | Variable Name | Data Type | Description |
    | --- | --- | --- | --- |
    | 1 | scanner | Scanner | Used to take input from the user. |
    | 2 | dayNumber | int | Stores the day number entered by the user (between 1 and 366). |
    | 3 | year | int | Stores the year entered by the user (format yyyy). |
    | 4 | N | int | Stores the value of N entered by the user (number of days to add). |
    | 5 | daysInMonths | int[] | Array containing the number of days in each month. |
    | 6 | monthNames | String[] | Array containing the names of the months. |
    | 7 | month | int | Stores the index of the month derived from the day number. |
    | 8 | day | int | Stores the day of the month derived from the day number and used to calculate the future date. |
    
    ### Program
    
    ```java
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
    
    ```
    
    ### Terminal Output
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/8805e12f-3028-48ed-b4b7-94c19ddc780e/Untitled.png)
    
    # Question 25: `ERRORED`
    
    Lucky numbers are a sequence of natural numbers that remain after removing second, third, fourth,
    fifth and so on numbers respectively from a sequence of consecutive natural numbers.
    
    Consider the sequence of first 20 natural numbers :
    
    Removing every second number produces the sequence 1, 3, 5, 7, 9, 11, 13, 15, 17. 19
    Next removing every third number prodaces the sequence 1, 3, 7, 9. 13, 15, 19
    Next removing every fourth number produces the sequence : 1, 3, 7, 13, 15. 19
    Further deleting every fifth number we get the sequence : 1, 3, 7, 13, 19
    
    Deletion of every sixth number is not possible and the five numbers that are lucky to escape deletion
    remain indefinitely.
    
    Write a program to enter any positive natural number 'N" where (1 <- N <- 50) and generate lucky
    numbers less than the given natural number.
    Test your program with the following set of data
    
    **Example 1**
    
    **INPUT:** N=10
    
    **OUTPUT:** LUCKY NUMBERS LESS THAN 10 ARE: 1, 3, 7
    
    **Example 2**
    
    **INPUT:** N=25
    
    **OUTPUT:** LUCKY NUMBERS LESS THAN 25 ARE: 1, 3, 7, 13, 19
    
    **Example 3**
    
    **INPUT:** N=100
    
    **OUTPUT:** NUMBER NOT IN RANGE: INVALID ENTRY
    
- Sample Paper 3
    
    # Question 27:
    
    A **Vampire** number is a composite natural number with an even number of digits that can be factored into two natural numbers  each with half as many digits as the original number and not both with trailing zeros, where the two factors contain precisely all the digits of the original number, in any order of counting multiplicity.
    
    $Example →$ 1260 = 21*60 (Where, 21 and 60 contain precisely all the digits of the number)
    
    Thus, 1260 Is a Vampire number.
    
    Accept two positive integers m and n, where m is less than n and the values of both ‘m’ and ‘n’ must be greater than or equal to 1000 and less than or equal to 9999 as user input. Display all Vampire numbers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format specified below:
    
    Test your program for the following data and some random data.
    
    $Example$ $→$
    
    ```java
    **Input: m=1002
           n=1640
    Output**: THE VAMPIRE NUMBERS ARE:
            1260 1395 1435 1530
            FREQUENCY OF VAMPIRE NUMBER IS: 4
    ```
    
    $Example 2→$
    
    ```java
    **Input: m=1810
           n=7800
    Output**: THE VAMPIRE NUMBERS ARE:
            1827 2187 6880
            FREQUENCY OF VAMPIRE NUMBER IS: 3
    ```
    
    $Example 3→$
    
    ```java
    **Input: m=8105
           n=9999
    Output**: THE VAMPIRE NUMBERS ARE:
            NIL
            FREQUENCY OF VAMPIRE NUMBER IS: 0
    ```
    
    $Example 4→$
    
    ```java
    **Input: m=174
           n=4500
    Output**: INVALID INPUT
    ```
    
    ### Algorithm
    
    1. Start
    2. Import `java.util.Scanner`
    3. Define `Vampire` class
    4. Define `isVampire(int num)` method to check if `num` is a vampire number
    5. Convert `num` to string `n` and get its length `l`
    6. If `l` is odd, return false
    7. Loop from `i = 10^(l/2-1)` to `10^(l/2)`
    8. Check if `num` is divisible by `i`, calculate quotient `q = num / i`
    9. If `q` has correct number of digits, check `EqualDigitChecker(n, i, q)`
    10. Define `EqualDigitChecker(String o, int p1, int p2)` method
    11. Concatenate `p1` and `p2` into string `com`
    12. If length of `com` matches `o`, call `areAnag(o, com)`; return its result
    13. Define `areAnag(String str1, String str2)` method
    14. If lengths of `str1` and `str2` match, initialize `count` array of size 10
    15. Loop through `str1` and `str2`, updating `count` based on digit frequencies
    16. If all elements in `count` are zero, return true; else, return false
    17. Define `main` method
    18. Prompt user for `m` and `n`, read using `Scanner`
    19. Initialize `vampireNumbers` array and `count`
    20. Loop from `m` to `n`, check each number with `isVampire`; if true, store in `vampireNumbers` and increment `count`
    21. Print "THE VAMPIRE NUMBERS ARE:" followed by vampire numbers or "NIL" if `count` is 0
    22. Print "FREQUENCY OF VAMPIRE NUMBER IS: " followed by `count`
    23. End
    
    ### Variable Description Table
    
    | Sr. No. | Variable Name | Data Type | Description |
    | --- | --- | --- | --- |
    | 1 | scanner | Scanner | Used to take input from the user. |
    | 2 | dayNumber | int | Stores the day number entered by the user (between 1 and 366). |
    | 3 | year | int | Stores the year entered by the user (format yyyy). |
    | 4 | N | int | Stores the value of N entered by the user (number of days to add). |
    | 5 | daysInMonths | int[] | Array containing the number of days in each month. |
    | 6 | monthNames | String[] | Array containing the names of the months. |
    | 7 | month | int | Stores the index of the month derived from the day number. |
    | 8 | day | int | Stores the day of the month derived from the day number and used to calculate the future date. |
    
    ### Program
    
    ```java
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
    ```
    
    ### Terminal Output
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/e0a6c71b-cc06-4418-a35a-f95437263df7/Untitled.png)
    
    # Question 28:
    
    Write a Program to accept a sentence which may be terminated by either “_”, ‘?’ or ‘!’ only. The words may be separated by a single blank spaces and are in UPPER CASE.
    
    Perform the following tasks:
    
    1. Count number of vowels and consonants present in each word.
    2. Generate the output of the frequency in form of a bar graph, where V denotes vowels and C consonants as shown below:
    
    Test your program for the following data and some random data:
    
    $Example→$
    
    ```java
    **Input:** HOW ARE YOU?
    **OUTPUT: WORD    COUNT**
    
            HOW      V
                     CC
                     
            ARE      VV
                     C
                     
            YOU      VV
                     C
    ```
    
    $Example 2→$
    
    ```java
    **INPUT:** GOOD DAY?
    **OUTPUT: WORD      COUNT**
    
    	      GOOD      VV
    	                CC
    	                
    	      DAY       V
    	                CC
    ```
    
    $Example 3→$
    
    ```java
    **INPUT:** LONG LIVE THE KING#
    **OUTPUT:** INCORRECT TERMINATING CHARACTER INVALID INPUT
    ```
    
    ### Algorithm
    
    1. Start.
    2. Import `java.util.Scanner`.
    3. Define `WordAnalyzer` class with `main` method.
    4. Create `Scanner` object to read input.
    5. Prompt the user to enter a sentence terminated by '_', '?', or '!'.
    6. Read and store the input sentence.
    7. Trim leading and trailing whitespaces from the input.
    8. Check if the input ends with '_', '?', or '!'.
    9. If true, split the input sentence into words using whitespaces.
    10. Print column headers "WORD" and "COUNT".
    11. Iterate over each word in the input sentence.
    12. Initialize counters for vowels and consonants for the current word.
    13. Iterate over each character in the word.
    14. Check if the character is a vowel using the `isVowel` method.
    15. If true, increment the vowel counter.
    16. If the character is a letter and not a vowel, increment the consonant counter.
    17. Print the current word followed by 'V' for each vowel and 'C' for each consonant.
    18. Print a new line after printing the counts for each word.
    19. If the terminating character is incorrect, print "INCORRECT TERMINATING CHARACTER. INVALID INPUT".
    20. End.
    
    ### Variable Description Table
    
    | Sr. No. | Variable Name | Data Type | Description |
    | --- | --- | --- | --- |
    | 1 | scanner | Scanner | Used to take input from the user. |
    | 2 | input | String | Stores the input sentence entered by the user. |
    | 3 | words | String[] | Array of words extracted from the input sentence. |
    | 4 | word | String | Used to iterate through each word in the words array. |
    | 5 | vowels | int | Counter for the number of vowel characters in a word. |
    | 6 | consonants | int | Counter for the number of consonant characters in a word. |
    | 7 | ch | char | Used to iterate through each character in a word to check if it is a vowel or consonant. |
    
    ### Program
    
    ```java
    import java.util.Scanner;
    
    public class WordAnalyzer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence (terminated by '_', '?' or '!'): ");
            String input = scanner.nextLine().trim();
    
            if (input.endsWith("_") || input.endsWith("?") || input.endsWith("!")) {
                String[] words = input.split("\\s+");
                System.out.println("WORD\tCOUNT\n");
    
                for (String word : words) {
                    int vowels = 0;
                    int consonants = 0;
    
                    for (char ch : word.toCharArray()) {
                        if (isVowel(ch))
                            vowels++;
                        else if (Character.isLetter(ch))
                            consonants++;
                    }
    
                    System.out.print(word + "\t");
    
                    for (int i = 0; i < vowels; i++) {
                        System.out.print("V");
                    }
                    for (int i = 0; i < consonants; i++) {
                        System.out.print("C");
                    }
    
                    System.out.println("\n");
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
    ```
    
    ### Terminal Output
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/518f4956-5f7b-466c-82ed-af9ac7de96eb/90865331-e924-468a-9d30-1215bb822de4/Untitled.png)
    
    ---
