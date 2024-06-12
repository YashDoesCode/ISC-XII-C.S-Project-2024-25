package SamplePaper3;

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
