package SamplePaper2;

/**
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
1.	Start
2.	Import java.util.Scanner.
3.	Define LuckyNumbers class.
4.	Define remove method with int[] arr and int step parameters.
5.	Return arr if step is greater than arr.length.
6.	Initialize index j to 0.
7.	Create new array newArr with reduced length.
8.	Loop through arr with index i.
9.	Copy elements to newArr if not at step position.
10.	Return newArr.
11.	Define Calculator method with int N parameter.
12.	Create int[] numbers from 1 to N-1.
13.	Loop from 2 to N.
14.	Call remove method to update numbers.
15.	Print "LUCKY NUMBERS LESS THAN N ARE: ".
16.	Loop through numbers to print each element.
17.	Define main method.
18.	Create Scanner object scanner.
19.	Check if N is out of range and print error message or call Calculator.
20.	End
 */
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
