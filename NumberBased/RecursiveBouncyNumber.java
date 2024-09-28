package NumberBased;

/**
Question 19:

A number is said to be Bouncy Number if the digits of the number are unsorted. For example:
> 22344, Is not a bouncy number because the digits are sorted in Ascending order.
> 774410, Is not a Bouncy number because the digits are unsorted.
> 155349, Is a bouncy number because the digits are unsorted.

NOTE: A number below 100 can never be a Bouncy number. 
Write a program in Java using Recursion to accept a number. Check and display whether it is a Bouncy number or not.

Examples

INPUT: 155349
OUTPUT: It is a Bouncy Number
------------------------------------------------------
INPUT: 123456
OUTPUT: It is not a Bouncy Number
------------------------------------------------------
INPUT: 4321
OUTPUT: It is not a Bouncy Number
------------------------------------------------------
INPUT: 98
OUTPUT: A number below 100 can never be a Bouncy Number
-------------------------------------------------------
Algorithm

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
 */
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
