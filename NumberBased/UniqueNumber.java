package NumberBased;
/**
Question 17:

A Unique Digit integer is a positive integer (without Leading-zeros) and with no duplicate digits. Given two positive integers ‘a’ and ‘b’. Write a program in Java to determine how many unique digit integer are there in the range between ‘a’ and ‘b’ and output them.

Example

INPUT: Enter the values of m and n :
       a=100 
       b=120 
OUTPUT: The Unique digit integers are:
        102, 103, 104, 105, 106, 107, 108, 109, 120
        Frequency = 9

Algorithm

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
 */
import java.util.Scanner;

public class UniqueNumber {
    static boolean hasUniqueDigits(int num) {
        String strNum = String.valueOf(num);
        boolean[] digitSeen = new boolean[10];

        for (char c : strNum.toCharArray()) {
            int digit = c - '0';
            if (digitSeen[digit]) {
                return false;
            }
            digitSeen[digit] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of m and n: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The Unique digit integers are:");
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (hasUniqueDigits(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Frequency = " + count);
    }
}
