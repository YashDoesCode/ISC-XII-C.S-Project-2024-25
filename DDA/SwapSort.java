package DDA;
/**
Question 7:

A class SwapSort has been defined to perform string related operations on a word input:

Class Name: SwapSort

Data Members/Instance Variables

wrd :To store a word
len :To store length of the word inputted
swapwrd :To store the swapped word
sortwrd :To store the sorted word

Member Functions

SwapSort() :Default constructor to initialize data members with legal initial value.
void readword() :To accept a word in upper case.
void swapChar() :To swap the first and last character of the word in ‘wrd’ and stores the new word in “Swapwrd”
void sortword() :Sort the character of the original word in alphabetical order and stores it in ‘sortwrd’
void display() :Displays the original word, swapped word and the sorted word.

Specify the class SwapSort() giving the details of the constructor, void readword(), void swapChar(), void sortword() and void display(). Define the main function to create an object and call the functions accordingly to enable the task.

INPUT: Swapped Word: HELLO
OUTPUT: Sorted Word: EHILO


Algorithm

1. Start.
2. Define class `SwapSort`.
3. Declare instance variables `wrd`, `len`, `swapwrd`, `sortwrd`.
4. Define default constructor `SwapSort()` to initialize variables.
5. Define method `readword()` to read a word from user input and convert to uppercase.
6. Define method `swapChar()` to swap first and last characters of `wrd`.
7. Check if `len > 1`, assign `swapwrd` as last char + middle + first char, else assign `wrd`.
8. Define method `sortword()` to sort characters of `wrd`.
9. Convert `wrd` to `char` array, sort using `Arrays.sort()`, convert back to `String`.
10. Define method `display()` to print original, swapped, and sorted words.
11. Print "Original Word: " followed by `wrd`.
12. Print "Swapped Word: " followed by `swapwrd`.
13. Print "Sorted Word: " followed by `sortwrd`.
14. Define `main` method.
15. Create object `obj` of class `SwapSort`.
16. Call `readword()` on `obj` to input and store word.
17. Call `swapChar()` on `obj` to swap characters.
18. Call `sortword()` on `obj` to sort characters.
19. Call `display()` on `obj` to output original, swapped, and sorted words.
20. End.
 */
import java.util.Scanner;
import java.util.Arrays;

class SwapSort {
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    SwapSort() {
        wrd = "";
        len = 0;
        swapwrd = "";
        sortwrd = "";
    }
    void readword() {
        Scanner sc = new Scanner(System.in);
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }
    void swapChar() {
        if (len > 1) {
            swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
        } else {
            swapwrd = wrd;
        }
    }
    void sortword() {
        char[] chars = wrd.toCharArray();
        Arrays.sort(chars);
        sortwrd = new String(chars);
    }
    void display() {
        System.out.println("Original Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }
    public static void main(String[] args) {
        SwapSort obj = new SwapSort();
        obj.readword();
        obj.swapChar();
        obj.sortword();
        obj.display();
    }
}