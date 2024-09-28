package SamplePaper3;
/**
Question 18:
Write a Program to accept a sentence which may be terminated by either “_”, ‘?’ or ‘!’ only. The words may be separated by a single blank space and are in UPPER CASE.
Perform the following tasks:
1.	Count the number of vowels and consonants present in each word.
2.	Generate the output of the frequency in form of a bar graph, where V denotes vowels and Consonants as shown below:
Test your program for the following data and some random data:
Example?
INPUT: HOW ARE YOU?
OUTPUT: WORD    COUNT

        HOW      VCC
                 
        ARE      VVC
                 
        YOU      VVC
Example 2?
INPUT: GOOD DAY?
OUTPUT: WORD      COUNT

	      GOOD      VVCC
	                
	      DAY       VCC
Example 3?
INPUT: LONG LIVE THE KING
OUTPUT: INCORRECT TERMINATING CHARACTER INVALID INPUT

Algorithm
1.	Start.
2.	Import java.util.Scanner.
3.	Define WordAnalyzer class with main method.
4.	Create a Scanner object to read input.
5.	Prompt the user to enter a sentence terminated by '_', '?', or '!'.
6.	Read and store the input sentence.
7.	Trim leading and trailing whitespaces from the input.
8.	Check if the input ends with '_', '?', or '!'.
9.	If true, split the input sentence into words using whitespaces.
10.	Print column headers "WORD" and "COUNT".
11.	Iterate over each word in the input sentence.
12.	Initialize counters for vowels and consonants for the current word.
13.	Iterate over each character in the word.
14.	Check if the character is a vowel using the isVowel method.
15.	If true, increment the vowel counter.
16.	If the character is a letter and not a vowel, increment the consonant counter.
17.	Print the current word followed by 'V' for each vowel and 'C' for each consonant.
18.	Print a new line after printing the counts for each word.
19.	If the terminating character is incorrect, print "INCORRECT TERMINATING CHARACTER. INVALID INPUT".
20.	End.
 */
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
