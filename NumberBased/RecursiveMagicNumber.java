package NumberBased;
/*
1. Start
2. Import `java.util.Scanner`
3. Define the `RecursiveMagicNumber` class
4. Define the `digitSum` method with parameter `n`
5. If `n` is 0, return 0
6. Otherwise, return the sum of the last digit of `n` and the result of `digitSum(n / 10)`
7. Define the `isMagicNumber` method with parameter `num`
8. Calculate the sum of the digits of `num` using `digitSum` and store it in `sum`
9. Start a `while` loop with the condition `sum >= 10`
10. Inside the loop, update `num` with `sum` and recalculate `sum` using `digitSum`
11. End the loop when `sum` becomes less than 10
12. Check if `sum` is equal to 1 or 7 and return `true` if either condition is met
13. Otherwise, return `false`
14. Define the `main` method
15. Create a `Scanner` object
16. Print "Enter a number to check if it's a Magic Number: "
17. Read input number `number` using `scanner.nextInt()`
18. Check if `number` is a magic number using `isMagicNumber`
19. Print the result indicating whether `number` is a magic number or not
20. Close the `Scanner` object
21. End
 */
import java.util.Scanner;

public class RecursiveMagicNumber {
    public static int digitSum(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + digitSum(n / 10);
    }
    public static boolean isMagicNumber(int num) {
        int sum = digitSum(num);
        while (sum >= 10) {
            num = sum;
            sum = digitSum(num);
        }
        return (sum == 1 || sum == 7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Magic Number: ");
        int number = scanner.nextInt();

        if (isMagicNumber(number))
            System.out.println(number + " is a Magic Number.");
        else
            System.out.println(number + " is not a Magic Number.");
    }
}
