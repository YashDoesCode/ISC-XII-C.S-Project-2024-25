package SDA;

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
