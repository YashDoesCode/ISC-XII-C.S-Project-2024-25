/*
1. Start
2. Define the `NumberBased` package.
3. Define the `DisariumNumber` class.
4. Define a static method `check` that takes an integer `n` as an argument.
5. Convert the integer `n` to a string to determine the number of digits and store the length in `DigitCounter`.
6. Initialize an integer variable `sum` to 0.
7. Initialize an integer variable `temp` to `n`.
8. Start a `while` loop that continues as long as `temp` is not equal to 0.
9. Inside the loop, calculate `r` as `temp` modulo 10 to get the last digit of `temp`.
10. Update `sum` by adding `r` raised to the power of `DigitCounter` to `sum`.
11. Decrement `DigitCounter` by 1.
12. Update `temp` by dividing it by 10 to remove the last digit.
13. End the `while` loop.
14. Return the result of the comparison between `sum` and `n`.
15. Define the `main` method in the `DisariumNumber` class.
16. Initialize an integer variable `n` with the value 89.
17. Call the `check` method with `n` and store the result.
18. Use a ternary operator to print "Disarium Number" if the result is true.
19. Otherwise, print "Not a Disarium Number".
20. End
 */
package NumberBased;

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
		int n = 89;
		
		System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
	}
}