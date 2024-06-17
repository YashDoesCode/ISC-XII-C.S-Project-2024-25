package SamplePaper3;
/**
A Vampire number is a composite natural number with an even number of digits that can be factored into two natural numbers  each with half as many digits as the original number and not both with trailing zeros, where the two factors contain precisely all the digits of the original number, in any order of counting multiplicity.
Example ? 1260 = 21*60 (Where, 21 and 60 contain precisely all the digits of the number)
Thus, 1260 Is a Vampire number.
Accept two positive integers m and n, where m is less than n and the values of both ‘m’ and ‘n’ must be greater than or equal to 1000 and less than or equal to 9999 as user input. Display all Vampire numbers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format specified below:
Test your program for the following data and some random data.

Examples

Input: m=1002
       n=1640
Output: THE VAMPIRE NUMBERS ARE:
        1260 1395 1435 1530
        FREQUENCY OF VAMPIRE NUMBER IS: 4
----------------------------------------------------
Input: m=1810
       n=7800
Output: THE VAMPIRE NUMBERS ARE:
        1827 2187 6880
        FREQUENCY OF VAMPIRE NUMBER IS: 3
----------------------------------------------------
Input: m=8105
       n=9999
Output: THE VAMPIRE NUMBERS ARE:
        NIL
        FREQUENCY OF VAMPIRE NUMBER IS: 0
----------------------------------------------------
Input: m=174
       n=4500
Output: INVALID INPUT
----------------------------------------------------
Algorithm

1. Start
2. Import `java.util.Scanner`
3. Define `Vampire` class
4. Define `isVampire(int num)` method to check if `num` is a vampire number
5. Convert `num` to string `n` and get its length `l`
6. If `l` is odd, return false
7. Loop from `i = 10^(l/2-1)` to `10^(l/2)`
8. Check if `num` is divisible by `i`, calculate quotient `q = num / i`
9. If `q` has correct number of digits, check `EqualDigitChecker(n, i, q)`
10. Define `EqualDigitChecker(String o, int p1, int p2)` method
11. Concatenate `p1` and `p2` into string `com`
12. If length of `com` matches `o`, call `areAnag(o, com)`; return its result
13. Define `areAnag(String str1, String str2)` method
14. If lengths of `str1` and `str2` match, initialize `count` array of size 10
15. Loop through `str1` and `str2`, updating `count` based on digit frequencies
16. If all elements in `count` are zero, return true; else, return false
17. Define `main` method
18. Prompt user for `m` and `n`, read using `Scanner`
19. Initialize `vampireNumbers` array and `count`
20. Loop from `m` to `n`, check each number with `isVampire`; if true, store in `vampireNumbers` and increment `count`
21. Print "THE VAMPIRE NUMBERS ARE:" followed by vampire numbers or "NIL" if `count` is 0
22. Print "FREQUENCY OF VAMPIRE NUMBER IS: " followed by `count`
23. End
 */
import java.util.Scanner;

public class Vampire {
    public static boolean isVampire(int num) {
        String n = Integer.toString(num);
        int l = n.length();
        if (l % 2 != 0) {
            return false;
        } else {
            for (int i = (int)Math.pow(10, l / 2 - 1); i < Math.pow(10, l / 2); i++) {
                if (num % i == 0) {
                    int q = num / i;
                    if (q >= Math.pow(10, l / 2 - 1)) {
                        if (EqualDigitChecker(n, i, q)) {
                            return true;
                        } else {
                            continue;
                        }
                    }
                }
            }
            return false;
        }
    }
    public static boolean EqualDigitChecker(String o, int p1, int p2) {
        String com = Integer.toString(p1) + Integer.toString(p2);  
        if (com.length() != o.length()) {
            return false;
        } else {
            return areAnag(o, com);
        }
    }
    public static boolean areAnag(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int[] count = new int[10];
            
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - '0']++;
                count[str2.charAt(i) - '0']--;
            }
            for (int i = 0; i < 10; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        if (m < 1000 || m > 9999 || n < 1000 || n > 9999 || m >= n) {
            System.out.println("INVALID INPUT");
            return;
        } else {
            int[] vampireNumbers = new int[n - m + 1];
            int count = 0;
            for (int i = m; i <= n; i++) {
                if (isVampire(i)) {
                    vampireNumbers[count++] = i;
                }
            }
            System.out.println("THE VAMPIRE NUMBERS ARE:");
            if (count == 0) {
                System.out.println("NIL");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.print(vampireNumbers[i] + " ");
                }
                System.out.println();
            }
            System.out.println("FREQUENCY OF VAMPIRE NUMBER IS: " + count);
        }
    }
}
