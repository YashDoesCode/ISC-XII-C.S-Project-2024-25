package SamplePaper2;

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
