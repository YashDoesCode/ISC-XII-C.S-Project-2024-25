package SamplePaper3;

import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence (terminated by '_', '?' or '!'): ");
        String input = scanner.nextLine().trim();

        if (input.endsWith("_") || input.endsWith("?") || input.endsWith("!")) {
            String[] words = input.split("\\s+");
            System.out.println("WORD\tCOUNT\n");

            for (String word : words) {
                int vowels = 0;
                int consonants = 0;

                for (char ch : word.toCharArray()) {
                    if (isVowel(ch))
                        vowels++;
                    else if (Character.isLetter(ch))
                        consonants++;
                }

                System.out.print(word + "\t");

                for (int i = 0; i < vowels; i++) {
                    System.out.print("V");
                }
                for (int i = 0; i < consonants; i++) {
                    System.out.print("C");
                }

                System.out.println("\n");
            }
        } else {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
        }
    }
    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
