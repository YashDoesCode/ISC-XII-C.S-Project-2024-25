package StringBased.PreviousYearPracticalPaper;

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
