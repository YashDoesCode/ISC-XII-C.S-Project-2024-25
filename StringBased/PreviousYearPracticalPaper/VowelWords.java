package StringBased.PreviousYearPracticalPaper;

import java.util.*;

public class VowelWords {
    static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }
    static int countVowelWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }
    static String reorderWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String vowels = "";
        String others = "";
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                vowels += words[i] + " ";
            } else {
                others += words[i] + " ";
            }
        }
        return vowels + others.trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence in uppercase terminated by '.', '?' or '!':");
        String input = scanner.nextLine().toUpperCase();
        
        int vowelWordCount = countVowelWords(input);
        String reorderedSentence = reorderWords(input);
        
        System.out.println("No. of words beginning and ending with a vowel = " + vowelWordCount);
        System.out.println(reorderedSentence);
            }
}