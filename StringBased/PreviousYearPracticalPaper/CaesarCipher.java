package StringBased.PreviousYearPracticalPaper;

/**
Question 13:
Caesar Cipher is an encryption technique which is implemented as ROT13 (rotate by 13 places). It is a simple letter substitution cipher that replaces a letter 13 places after it is in the alphabets, with the other character remaining unchanged.
Write a program in Java to accept a plain text of length ‘l’, where l must be greater than 3 and lesser than 100. Encrypt the text if valid as per the Caesar Cipher. Test your program with the sample data and some random data.
Example
INPUT: You
OUTPUT: Invalid Input

INPUT: Hello! How are you?
OUTPUT: Uryyb! Ubj ner lbh?

Algorithm
1.	Start
2.	Import java.util.Scanner.
3.	Define CaesarCipher class.
4.	Define main method for program entry.
5.	Create a Scanner object named scanner.
6.	Prompt user to input plaintext and trim whitespace.
7.	Read plaintext input into plainText.
8.	Check if plainText length is between 4 and 99 characters.
9.	If not, print "Invalid Input" and exit.
10.	Call encrypt method with plainText as parameter.
11.	Print "Encrypted text: " followed by the encrypted result.
12.	Define encrypt method to encrypt using Caesar cipher:
13.	End encrypt method.
14.	End main method.
15.	End CaesarCipher class.
16.	Handle input using Scanner.nextLine() and trim() to remove extra spaces.
17.	Validate input length using conditional checks.
18.	Use character manipulation (char, Character.isLetter(), arithmetic operations) for encryption.
19.	Ensure encrypted characters wrap around alphabet using modulo arithmetic.
20.	Print results using System.out.println() for output.
21.	End
 */
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plainText = scanner.nextLine().trim();

        int length = plainText.length();
        if (length <= 3 || length >= 100) {
            System.out.println("Invalid Input");
            return;
        }

        String encryptedText = encrypt(plainText);
        System.out.println("Encrypted text: " + encryptedText);
    }

    public static String encrypt(String text) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    c = (char) ('a' + (c - 'a' + 13) % 26);
                } else if (Character.isUpperCase(c)) {
                    c = (char) ('A' + (c - 'A' + 13) % 26);
                }
            }
            encrypted += c;
        }
        return encrypted;
    }
}
