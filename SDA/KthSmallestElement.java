package SDA;
/**
 # Question 3:

Write a program in Java, which contains methods to find the kth smallest and kth largest elements in an array, and to calculate the sum of the first k smallest elements.

Example

Original array: [12, 3, 5, 7, 19]
The 3th smallest element is: 5
The 3th largest element is: 7
Sum of the first 3 smallest elements: 20
Sorted array after finding kth smallest: [3, 5, 7, 12, 19]

Design a program to:

1. Accept an array of integers.
2. Prompt the user to enter a value for k.
3. Find and display the kth smallest element in the array.
4. Find and display the kth largest element in the array.
5. Calculate and display the sum of the first k smallest elements in the array.
6. Display the sorted array after finding the kth smallest element.

Ensure to handle invalid input appropriately and display informative messages.

Algorithm

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
 */
 import java.util.Arrays;

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
