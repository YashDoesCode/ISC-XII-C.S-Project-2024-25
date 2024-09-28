package NumberBased;

/**
 Question 23:
 
An Evil Number is a positive whole number which has even number of 1’s in its Binary equivalent.
For Example: Binary Equivalent of 9 is 100, Which contains even number of 1’s. A few evil numbers are 3, 5, 6, 9. Design a program to accept a positive whole number and find the binary equivalent of the number and count the number of 1’s in it and display whether it is a Evil Number or not using Recursion, with an appropriate message.

Examples

INPUT: 15
       Binary Equivalent = 1111
       Number of 1's = 4
OUTPUT: Evil Number
----------------------------------------------------
INPUT: 26
       Binary Equivalent = 11010
       Nuumber of 1's = 3
OUTPUT: Not an Evil Number
----------------------------------------------------
Algorithm

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
 */
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
