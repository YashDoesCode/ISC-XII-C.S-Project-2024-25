package DDA;

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
