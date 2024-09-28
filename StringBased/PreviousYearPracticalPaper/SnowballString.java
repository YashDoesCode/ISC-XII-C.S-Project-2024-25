package StringBased.PreviousYearPracticalPaper;

/**
  Question 14: 
A snowball string is a sentence where each word is arranged in ascending order of their length and is also consecutive.

For example "I am the Lord" is a snowball string as
Length of word 'I' is 1
Length of word 'am' is 2
Length of word 'the' is 3
Length of word 'Lord' is 4

The length of each word is one more than the previous word. Hence they are consecutive and in ascending order.

Write a program to enter any sentence and check if it is a snowball string or not. The words in the sentence may be separated by one or more spaces and terminated by '.' or '?' only. The program will generate appropriate error message for any other terminating character.

Test your program for the following data and some random data:

Example 1
Input: He may give bonus
Output: IT IS A SNOWBALL STRING

Example 2
Input: Is the cold water frozen?
Output: IT IS A SNOWBALL STRING

Example 3
Input: Look before you leap
Output: IT IS A SNOWBALL STRING

Example 4
Input: The child is the father of the man!
Output: INCORRECT TERMINATING CHARACTER. INVALID INPUT
Algorithm
1.	Initialize the class SnowballString.
2.	Declare a string variable sent.
3.	Create a method input() to read a sentence from the user.
4.	Use a Scanner object to read input.
5.	Prompt the user to enter a sentence.
6.	Store the input in the variable sent.
7.	Create a method isSnowball(String s) to check the snowball condition.
8.	Tokenize the string s using delimiters ".? " to extract words.
9.	Initialize an integer variable c to store the length of the first word.
10.	If there are no tokens, return false.
11.	In a loop, for each subsequent word, check its length.
12.	Increment c by 1 for the expected length of the next word.
13.	If the length of the current word does not match c, return false.
14.	If all words match the condition, return true.
15.	In the main method, create an instance of SnowballString.
16.	Call the input() method to get user input.
17.	Check the length of sent to ensure proper termination.
18.	Validate the terminating character to be . or ?.
19.	Call the isSnowball() method and store the result.
20.	Print whether the input is a snowball string or not based on the result.

 */
import java.util.*;

public class SnowballString 
{
    String sent;

    void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = as.nextLine();
    }

    boolean isSnowball(String s)
    {
        StringTokenizer st = new StringTokenizer(sent, ".? ");
        String x = st.nextToken();
        int c = x.length();

        while(st.hasMoreTokens())
        {
             x = st.nextToken();
            if(++c != x.length())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SnowballString obj = new SnowballString();
        String check = "abcdefghijklmnopqrstuvwxyz.? ";
        
        obj.input();

        int l = obj.sent.length();

        for(int i = 0; i<l; i++)
        {   char x = Character.toLowerCase(obj.sent.charAt(i));
            if(check.indexOf(x) == -1)
            {
                System.out.println("Incorrect Terminating Character. Invalid Input");
                System.exit(0);
            }
        }
            if(obj.isSnowball(obj.sent))
                System.out.println("It is a Snowball String");
            else
                System.out.println("It is not a Snowball String");
}
}