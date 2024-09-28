package StringBased.TheoryPaper;
/**
# Question 14:

A class SortAlpha has been defined to sort the words in the sentence in alphabetical
order.

Example

Input: THE SKY IS BLUE
Output: BLUE IS SKY THE

Some of the members of the class are given below:

Class Name

Data Members/Instance Variables:

sent : to sotre a sentence
n : integer to store the number of words in a sentence

Methods/Member Functions:

SortAlpha() : default constructor to initialise data members with legal initial values
void Sort(SorAlpha P) : Sorts the words of the sentence of object P in alphabetical order and stores the sorted sentence in the current object.
void display() : Displays the original sentence along with the sorted sentence by invoking the method *sort()*

Specify the class SortAlpha giving details of the constructor(), void acceptsent( ),
void sort(SortAlpha) and void display(). Define a main() function to create an object
and call the functions accordingly to enable the task.

Algorithm

1. Start
2. Import `java.util.*`.
3. Define `SortAlpha` class.
4. Declare `String sent` and `int n` as instance variables.
5. Define a constructor to initialize `sent` and `n`.
6. Define `acceptSent` method.
7. Create `Scanner` object `sc`.
8. Prompt user to enter a sentence.
9. Read sentence into `sent`.
10. Create `StringTokenizer` object `st` with `sent`.
11. Set `n` to the number of tokens in `st`.
12. Define `sort` method.
13. Create `StringTokenizer` object `st` with `sent`.
14. Create `String[] words` array of size `n`.
15. Populate `words` array with tokens from `st`.
16. Implement nested loop to sort `words` using bubble sort.
17. Reconstruct `sent` from sorted `words` array.
18. Define `display` method and the sorted sentence,
19. In `main` method, create `SortAlpha` object, call `acceptSent`, `sort`, and `display` methods.
20. End
 */
import java.util.Scanner;
import java.util.StringTokenizer;

class SortAlpha {
    String sent;
    int n;
    public SortAlpha() {
        sent = "";
        n = 0;
    }
    public void acceptSent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sent);
        n = st.countTokens();
    }
    public void sort() {
        StringTokenizer st = new StringTokenizer(sent);
        String words[] = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = st.nextToken();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    words[j] = words[j] + words[j + 1];
                    words[j + 1] = words[j].substring(0, words[j].length() - words[j + 1].length());
                    words[j] = words[j].substring(words[j + 1].length());
                }
            }
        }
        sent = "";
        for (int i = 0; i < n; i++) {
            sent += words[i] + " ";
        }
        sent = sent.trim();
    }
    public void display() {
        System.out.println("Sorted Sentence: " + sent);
    }
    public static void main(String[] args) {
        SortAlpha obj = new SortAlpha();
        
        obj.acceptSent();
        obj.sort();
        obj.display();
    }
}
