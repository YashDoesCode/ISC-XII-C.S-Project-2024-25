package DDA;
/**
# Question 4:

A Circular Prime is a Prime number that is Prime under cyclic shelter it digits. When the left most digits is removed and replaced at the end of the remaining string of digits, The generated number is still prime. The process is repeated with the original number is reached again

Example

131, 311, 113 etc

Algorithm

1. Start
2. Define a Java class named `CircularPrime`.
3. Implement a method `isPrime` to check if a given number is prime.
4. Initialize a variable `c` to count the factors of the number.
5. Iterate from 1 to the given number to count the factors.
6. If the count `c` equals 2, return 1 indicating the number is prime; otherwise, return 0.
7. Implement a method `CircularCheck` to check if a number is a circular prime.
8. Initialize variables `f` and `m` to track the circular check and store the original number, respectively.
9. Convert the integer `m` to a string `S`.
10. Initialize an empty string `a` to store circular permutations.
11. Print the original number `m`.
12. Iterate through each character in the string `S`.
13. Extract the first character `ch` of `S`.
14. Create a substring `P` containing only the first character `ch`.
15. Create a circular permutation `a` by concatenating the substring `P` with the remaining characters of `S`.
16. Convert the circular permutation `a` back to an integer `m`.
17. Check if the integer `m` is prime using the `isPrime` method.
18. If `m` is not prime, set `f` to 1, reset the string `a`, and break the loop.
19. If `f` is 1, print "Not a Circular Prime !" and return.
20. If the loop completes without setting `f` to 1, print "Circular Prime !".
21. In the `main` method, prompt the user to input a number to check for circular prime. Then, call the `CircularCheck` method with the input number.
22. End
 */
import java.util.Scanner;

public class CircularPrime {
    int isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return 1;
        } else {
            return 0;
        }
    }
    void CircularCheck(int n) {
        int f = 0, m = n;
        String S = Integer.toString(m);
        String a = "";
        System.out.println(m);

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(0);
            String P = Character.toString(ch);
            a = S.substring(1).concat(P);
            System.out.println(a);
            m = Integer.parseInt(a);

            if (isPrime(m) == 0) {
                f = 1;
                a = "";
                if (f == 1) {
                    System.out.println("Not a Circular Prime !");
                    return;
                }
            }
        }
        System.out.println("Circular Prime !");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check for Circular Prime: ");
        int num = scanner.nextInt();

        CircularPrime circularPrime = new CircularPrime();
        circularPrime.CircularCheck(num);
    }
}
