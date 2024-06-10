package NumberBased;
/*
1. Start
2. Import the `java.util.Scanner` package.
3. Define the `UniqueNumber` class.
4. Define the `main` method.
5. Create a `Scanner` object to read input from the user.
6. Print the message "Enter the Number to check".
7. Read the input number using `scanner.nextInt()`.
8. Convert the input number `n` to a string and store it in the variable `con`.
9. Initialize a boolean variable `ch` to `true`.
10. Start a `for` loop with an integer `i` initialized to 0, running while `i` is less than the length of `con`.
11. Inside the loop, get the character at index `i` in `con`.
12. Use the `indexOf` method to check if this character appears again in `con` starting from index `i + 1`.
13. If the character appears again, set `ch` to `false`.
14. Break out of the loop.
15. End the `for` loop.
16. Check the value of `ch`.
17. If `ch` is `true`, print "Unique".
18. Otherwise, print "Sorry, Not Unique".
19. Close the `Scanner` object.
20. End
 */
import java.util.Scanner;

public class UniqueNumber
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Number to check");
        int n = scanner.nextInt();
        String con = n +"";
        boolean ch =true;
        for (int i=0; i<con.length();i++)
        {
            if (con.indexOf(con.charAt(i),i+1) > -1)
            {
                ch = false;
                break;
            }
        }
        if (ch == true){
            System.out.println("Unique");
        }
        else {
            System.out.println("Sorry, Not Unique");
        }
    }
}