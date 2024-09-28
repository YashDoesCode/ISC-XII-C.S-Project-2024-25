package StringBased;

/**
 Question 15:
A class Encode has been defined to replace only the vowels in a word by the next corresponding vowel and form a new word.
   i.e A -> E, E -> I, I -> O, O -> U, U -> A   and
       a -> e, e -> i, i -> o, o -> u, u -> a
   Example: Input: Institution
            Output: Onstotatoun
   Some of the members of the class are given below:
   
   Class name                                                                                                               : Encode
   Data members/instance variables:
        word                                                                                                          : to store a word
        length                                                                    : integer to store the length of the word
        new_word                                                                               : to store the encoded word
        
   Methods/Member functions:
        Encode()                         : default constructor to initialize data members with legal intitial values
        void acceptWord()               : to accept a word
        void nextVowel()                : to replace only the vowels from the word stored in the 'word' by the next corresponding vowel and to assign it to 'newword', with the remaining alphabets unchanged
        void display()                  : to display the original word along with the encrytped word
   
   Specify the class Encode giving details of the constructor(), void acceptWord(), void nextVowel(), and void display(). Define a main() function to create an object and call the functions accordingly to enable the task.
Algorithm
1.	Start
2.	Define class Encode.
3.	Declare data members: word, new_word, and length.
4.	Create constructor Encode() to initialize word and new_word as empty strings, and length as 0.
5.	Define method acceptWord() to accept a word from the user.
6.	Use Scanner to read input.
7.	Store the input word in word.
8.	Define method nextVowel() to encode the vowels in word.
9.	Set length to the length of word.
10.	Create string vowS with lowercase vowels.
11.	Create string vowC with uppercase vowels.
12.	Loop from 0 to length - 1.
13.	Get character x at the current index of word.
14.	Check if x is in vowS.
15.	If true, replace x with the next vowel using modulo operation.
16.	Check if x is in vowC.
17.	If true, replace x with the next vowel using modulo operation.
18.	Append the modified x to new_word.
19.	Define method display() to show original and encrypted words.
20.	End
 */
import java.util.Scanner;

public class Encode {
    String word, new_word;
    int length;

    Encode() {
        word = "";
        new_word = "";
        length = 0;
    }

    void acceptWord() {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = as.next();
    }
    
    void nextVowel() {
        length = word.length();
        String vowS = "aeiou";
        String vowC = "AEIOU";

        for (int i = 0; i < length; i++) {   
            char x = word.charAt(i);

            if (vowS.indexOf(x) != -1)
                x = vowS.charAt((vowS.indexOf(x) + 1) % 5);
            else if (vowC.indexOf(x) != -1)
                x = vowC.charAt((vowC.indexOf(x) + 1) % 5);
            
            new_word += x;
        }    
    }

    void display() {
        System.out.println("Original Word: " + word);
        System.out.println("Encrypted Word: " + new_word);
    }

    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.acceptWord();
        obj.nextVowel();
        obj.display();
    }   
}
