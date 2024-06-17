package NumberBased;
/**
Design a class “RecursivePrimePalindrome” to generate prime palindrome numbers. 
For Example: 11 (where 11 is a Prime number and a palindrome number)
Some of the members of the class are given below:

Class Name: RecursivePrimePalindrome

Data Members/Instance Variables

Start :To store the start of range
end :To store the end of range

Member Methods/Functions

PrimePalinGen (int a, int b) :Parameterized constructor to initialize the data members ‘a’ and end=b
int isPrime (int i) :Return 1 if the number is Prime other return 0
int isPalin (int i) :Return 1 if the number is a palindrome otherwise return 0
void generate () :Generate all Prime Palindrome number between start and end by invoking the function and isPrime() and isPalin()

Specify the class “RecursivePrimePalindrome” giving details of the constructor(), int isPrime (int), int isPalin (int) and void generate(). Define a main() function to create an object and call the functions accordingly to end the task.

Algorithm

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
 */
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