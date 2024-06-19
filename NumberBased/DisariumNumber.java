/**
Question 16:

A Disarium Number is a number in which the sum of digits to the powers of this repetetive position is qual to the number itself.

For example: 135 = 1¹ + 3² + 5²

Design a class “Disarium” to check if a given number is a Disarium number or not. Some of the details of the class are given below:

Class Name: Disarium

Data Members/Instance Variable**

int num :Stores the number
int size :Store the size

Member Functions

Disarium (int nn) :Parameterized constructor to initialize the data members n=nn and size=0
void countDigit() :Count the total number of digits and assign it to size
int sumOfDigits (int n, int p) :Returns the sum of the digits to the power of this repetitive points using recursive technique.
void check() :Checks whether the number is a Disarium number and displays the result with appropriate message.

Create the main method and perform function calling.

Examples

INPUT: 135
OUTPUT: Disarium Number
----------------------------------------------------
INPUT: 111
OUTPUT: Not a Disarium Number
----------------------------------------------------
*/
package NumberBased;

import java.util.Scanner;

public class DisariumNumber
{
      static boolean check(int n)
    {
        int DigitCounter = Integer.toString(n).length();
        int sum = 0; 
        int temp = n;
        while (temp!=0)
        {
            int r = temp%10;
            sum = (int) (sum + Math.pow(r, DigitCounter--));
            temp = temp/10;
        }
    
        return (sum == n);
    }
      public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
    }
}