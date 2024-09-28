package NumberBased;

/**
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

 */
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
