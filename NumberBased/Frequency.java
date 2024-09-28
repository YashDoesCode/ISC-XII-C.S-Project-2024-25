package NumberBased;

/**
 Question 28: 
Input a sentence from the user and count the number of times, the words “an” and “and” are present in the sentence. Design a class Frequency using the description given below:
Class name:                                                                                                             Frequency
Data members/variables:
Text                                                                                                            :stores the sentence
Countand                                                                                                    :to store the 
                                                                                                       frequency of the word “and”
len                                                                                            : stores the length of the string
Member functions/methods:
Frequency()                                                     : constructor to initialize the instance variables
void accept(String n)                                      : to assign n to text, where the value of the 
                                                                       parameter n should be in lower case.
void checkandfreq()                                        : to count the frequency of “and”
void checkanfreq()                                          : to count the frequency of “an”
void display()                                                  : to display the number of “and” and “an” with 
                                                                       appropriate messages.
Specify the class Frequency giving details of the constructor(), void accepts(String), void checkandfreq(), void checkanfreq() and void display(). Also, define the main() function to create an object and call methods accordingly to enable the task.
Algorithm
1. Start
2. Declare the `Frequency` class.
3. Declare instance variables: `String text`, `int countand`, `int countan`, `int len`.
4. Create a constructor for the `Frequency` class to initialize variables.
5. Define the `accept` method to set `text` to the input string.
6. Define the `checkAndFreq` method to initialize a temporary string `S`.
7. Set `countand` to 0 and `len` to the length of `text`.
8. Loop through each character of `text`.
9. If the character is a space, check if `S` equals "and".
10. If true, increment `countand` and reset `S` to an empty string.
11. Otherwise, append the character to `S`.
12. After the loop, check if `S` equals "and" and increment `countand` if true.
13. Define the `checkAnFreq` method to initialize a temporary string `S1`.
14. Set `countan` to 0 and `len` to the length of `text`.
15. Loop through each character of `text`.
16. If the character is a space, check if `S1` equals "an".
17. If true, increment `countan` and reset `S1` to an empty string.
18. Otherwise, append the character to `S1`.
19. Define the `display` method to print the frequencies of "and" and "an".
20. Define the `main` method to read user input and call the necessary methods.
21. End
 */
import java.util.Scanner;

class Frequency {
    String text;
    public int countand;
    public int countan;
    public int len;

    Frequency() {
        text = "";
        countand = 0;
        countan = 0;
        len = 0;
    }

    void accept(String n) {
        text = n;
    }

    void checkAndFreq() {
        String S = "";
        countand = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S.equals("and")) {
                    countand = countand + 1;
                }
                S = "";
            } else {
                S = S + b;
            }
        }
        if (S.equals("and")) {
            countand = countand + 1;
        }
    }

    void checkAnFreq() {
        String S1 = "";
        countan = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S1.equals("an")) {
                    countan = countan + 1;
                }
                S1 = "";
            } else {
                S1 = S1 + b;
            }
        }
        if (S1.equals("an")) {
            countan = countan + 1;
        }
    }

    void display() {
        System.out.println("Frequency of 'and' in the sentence is: " + countand);
        System.out.println("Frequency of 'an' in the sentence is: " + countan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frequency freq = new Frequency();

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        freq.accept(input);
        freq.checkAndFreq();
        freq.checkAnFreq();
        freq.display();

        scanner.close();
    }
}
