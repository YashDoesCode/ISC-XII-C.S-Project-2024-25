package NumberBased;

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