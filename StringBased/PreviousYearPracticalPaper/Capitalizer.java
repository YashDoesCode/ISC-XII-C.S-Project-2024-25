package StringBased.PreviousYearPracticalPaper;
/**
Question 11:

A class Capital has been defined to check whether a sentence has words beginning with a capital letter or not.

Class Name: Capital

Data Members/Instance Variables

sent :To store a sentence 
frequency: To store the frequency of the words beginning with a letter.

Member Functions

Capital() :Default Constructor
void input() :To accept a sentence
boolean isCapital(String w) :Checks and returns true if the word begins with a capital letter otherwise returns false.
void display() :Displays the sentence along with the frequency of the words beginning with a capital letter.

Specify the class Capital, giving the details of the constructor(), void input(), boolean isCapital(String) and void display(). Define the main function to create an object and call the functions accordingly to enable the task.

Examples

INPUT: The Quick Brown Fox Jumps Over the lazy Dog.
OUTPUT: Frequency: 7
----------------------------------------------------
INPUT: The Man walks Over To The Edge Of the Cliff.
OUTPUT: Frequency: 8
----------------------------------------------------
INPUT: The branches of the Trees are gnarled and Twisted.
OUTPUT: 3

Algorithm

1. Start 
2. Import `java.util.Scanner`.
3. Define the `Capitalizer` class.
4. Declare static variables `sent` (for the sentence) and `frequency` (for counting title words).
5. Define the `Capitalizer` constructor to initialize `sent` and `frequency`.
6. Define the `input` method to read the sentence from the user.
7. In the `input` method, create a `Scanner` object for input.
8. Prompt the user to enter a sentence.
9. Store the entered sentence in the `sent` variable.
10. Define the `isCapital` method to check if the first character of a word is uppercase.
11. In the `isCapital` method, get the first character of the word.
12. Return `true` if the character is uppercase; otherwise, return `false`.
13. Define the `display` method to show the sentence and the frequency of title words.
14. Print the sentence.
15. Add a space before the sentence to handle the first word uniformly.
16. Loop through each character of the modified sentence.
17. Check if the character is a space and the next character exists.
18. If the next character is uppercase, increment the `frequency`.
19. Print the frequency of title words.
20. In the `main` method, create an instance of `Capitalizer`, call `input` method, and then call `display` method. End the program.
21. End
 */
import java.util.Scanner;

public class Capitalizer {
    static String sent;
    static int frequency;

    public Capitalizer() {
        sent = "";
        frequency = 0;
    }
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to analyze: ");
        sent = scanner.nextLine();
    }
    public static boolean isCapital(String w) {
        char c = w.charAt(0);
        return Character.isUpperCase(c);
    }
    public static void display() {
        System.out.println("Sentence = " + sent);
        String b = " " + sent;
        char c;
        for (int i = 0; i < b.length(); i++) {
            c = b.charAt(i);
            if (c == ' ' && i + 1 < b.length()) {
                if (Character.isUpperCase(b.charAt(i + 1))) {
                    frequency++;
                }
            }
        }
        System.out.println("Frequency of the title word = " + frequency);
    }
    public static void main(String[] args) {
        Capitalizer obj = new Capitalizer();
        obj.input();
        obj.display();
    }
}
