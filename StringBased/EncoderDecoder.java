package StringBased;

/**
Question 9:

An encoded text can be decoded by finding the actual character for the ASCII code in the encoded message. Write a program to input an encoded text having only sequence of ASCII values without any spaces. Any code or value which is not in the range of 65 to 90 or 97 to 97 to 122 (a-2) or 32 ( ) will be ignored and should not appear in the output message. Write a program to accept a code which contains only digit (0 to 9). Display an error message if it contains any character. Perform the following tasks :`
1. Decode the encoded text as per the above instructions.
2. The first letter of each word must be changed to uppercase and remaining to lowercase.
3. Any consecutive sets of code 32 will be taken as only one black space.
4. Display it in the form of a sentence.

Example

Input : 10665771011153266797868
Output : James Bond

Input : 667685693232837589
Output : Blue Sky

Input : 22-768#5693232375889
Output : Invalid Code

Algorithm

1. Start
2. Initialize the scanner to read input from the user.
3. Prompt the user to enter the encoded text.
4. Read the encoded text entered by the user.
5. Call the `isValid` function with the encoded text as an argument.
6. In `isValid`, loop through each character in the encoded text.
7. For each character in `isValid`, check if it's a digit (between '0' and '9').
8. If a character is not a digit, return `false` from `isValid`.
9. If all characters are digits, return `true` from `isValid`.
10. Check the return value of `isValid`.
11. If the return value is `false`, print "Invalid Code".
12. If the return value is `true`, call the `Decoder` function with the encoded text as an argument.
13. In `Decoder`, initialize an empty string `d` to store decoded output and an index `i` starting from 0.
14. While `i` is less than the length of the encoded text, check if three-digit substrings can be converted to ASCII characters (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to `d`, and increment `i` by 3.
15. If a three-digit substring does not represent a valid character, check if a two-digit substring can be converted to an ASCII character (between 65 and 90, or 97 and 122, or is a space (32)). If it can, add the corresponding character to `d`, and increment `i` by 2.
16. If neither three-digit nor two-digit substrings yield a valid character, increment `i` by 1.
17. Once all characters are processed, return the decoded string `d` from `Decoder`.
18. Call the `Caser` function with the decoded text `d` as an argument.
19. In `Caser`, split the decoded text into words and initialize an empty string `sx` to store formatted text. Loop  and capitalize the first letter and finally print `sx`
20. End
 */

import java.util.Scanner;

public class EncoderDecoder {
    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false; 
            }
        }
        return true; 
    }
    public static String Decoder(String s) {
        String d = "";
        int i = 0;
        while (i < s.length()) {
            if (i + 3 <= s.length()) {
                int c = Integer.parseInt(s.substring(i, i + 3));
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32) {
                    d += (char) c;
                    i += 3;
                    continue;
                }
            }
            if (i + 2 <= s.length()) {
                int c = Integer.parseInt(s.substring(i, i + 2));
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32) {
                    d += (char) c;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return d;
    }
    public static String Caser(String st) {
        String[] w = st.split(" ");
        String sx = "";
        for (int i = 0; i < w.length; i++) {
            String word = w[i];
            if (word.length() > 0) {
                sx += Character.toUpperCase(word.charAt(0));
                sx += word.substring(1).toLowerCase();
                if (i < w.length - 1) {
                    sx += " "; 
                }
            }
        }
        return sx;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encoded text: ");
        String s = scanner.nextLine();
        if (!isValid(s)) {
            System.out.println("Invalid Code");
        } else {
            String d = Decoder(s);
            String sxt = Caser(d);
            System.out.println("Decoded Output: " + sxt);
        }
    }
}
