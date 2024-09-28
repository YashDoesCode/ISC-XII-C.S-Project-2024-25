package NumberBased;
/**
A composite Magic number is a positive integer which is composite as well as a Magic Number.
Write a Java program to accept two positive integers ‘m’ and ‘n’, where m is less than n. Display the number of composite magic integers that are in the range between m and n (both inclusive) and output them along with frequency, in the format specified below.

Examples

INPUT: m=10
       n=100
OUTPUT:The Composite magic numbers are: 10, 28, 46, 55, 64, 82, 91, 100
       Frequency of Composite magic numbers : 8**
----------------------------------------------------
INPUT: m=120
       n=90
OUTPUT: Invalid Input 
----------------------------------------------------
Algorithm

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
 */
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