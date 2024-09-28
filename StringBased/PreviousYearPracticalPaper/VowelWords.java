package StringBased.PreviousYearPracticalPaper;

/**
Question 11: 
Write a Program in Java to accept a sentence which may be terminated by either ‘.’,’?’ or ‘!’ only. The words may be separated by more than one blank space and are in Upper case. Perform the following operations :
1.	Find the number of words beginning and ending with a vowel.
2.	Place the words which begin with a vowel at the beginning, followed by the remaining words as they occur in the sentence.
Example
INPUT: ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE
OUTPUT: No. of words beginning and ending with a vowel = 3
        ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL

Algorithm
1.	Start
2.	Import java.util.Scanner.
3.	Define the VowelWords class.
4.	Define the isVowel method to check if a character is a vowel.
5.	In the isVowel method, return true if the character exists in the string "AEIOU"; otherwise, return false.
6.	Define the countVowelWords method to count words starting and ending with vowels.
7.	In the countVowelWords method, trim the input sentence and split it into words using whitespace as delimiter.
8.	Initialize count to 0 for counting vowel words.
9.	Loop through each word in the words array:
?	Check if the first and last characters of the word are vowels using isVowel method.
?	If both characters are vowels, increment count.
10.	Return count.
11.	Define the reorderWords method to reorder words in the sentence.
12.	In the reorderWords method, trim the input sentence and split it into words using whitespace as delimiter.
13.	Initialize vowels and others as empty strings for storing reordered words.
14.	Loop through each word in the words array:
?	If the first character of the word is a vowel, concatenate the word with a space to vowels.
?	Otherwise, concatenate the word with a space to others.
15.	Concatenate vowels and trimmed others to reorderedSentence.
16.	Return reorderedSentence.
17.	Define the main method to execute the program.
18.	Create a Scanner object scanner to read user input.
19.	Prompt the user to enter a sentence terminated by '.', '?' or '!'; convert input to uppercase.
20.	Calculate vowelWordCount using countVowelWords method and reorder the sentence using reorderWords method.
21.	Print the number of vowel words and the reordered sentence.
22.	End
 */
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