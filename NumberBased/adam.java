package NumberBased;

/**
 Question 27: 
A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself.

Example: 2, 3, 5, 7 … etc.

Adam number: The square of a number and the square of its reverse are reverse to each other.

Example: If n = 13 and reverse of 'n' = 31, then,

(13)2 = 169

(31)2 = 961 which is reverse of 169

thus 13, is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. Display all Prime-Adam integers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format given below:

Test your program with the following data and some random data:

Example 1

INPUT:
m = 5
n = 100

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

Example 2

INPUT:
m = 100
n = 200

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
101 103 113
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

Example 3

INPUT:
m = 50
n = 70

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
NIL
FREQUENCY OF PRIME-ADAM INTEGERS IS: 0

Example 4

INPUT:
m = 700
n = 450

OUTPUT:
INVALID INPUT
Algorithm
1. Start
2. Declare the `PrimeAdam` class.
3. Define the `reverse(int num)` method to reverse a number.
4. Initialize `rev = 0` inside the `reverse()` method.
5. Loop to reverse the digits of the number.
6. Return the reversed number.
7. Define the `isAdam(int num)` method to check if a number is an Adam number.
8. Square the input number.
9. Reverse the original number.
10. Square the reversed number.
11. Reverse the square of the original number.
12. Compare the reversed square of the original with the square of the reversed number.
13. Return `true` if the two are equal, otherwise `false`.
14. Define the `isPrime(int num)` method to check for prime numbers.
15. Initialize a counter.
16. Loop to check divisibility from 1 to the number.
17. Return `true` if the counter equals 2, indicating it's prime.
18. In `main()`, take input for `m` and `n` from the user.
19. Loop through the numbers from `m` to `n`, checking for Prime-Adam numbers.
20. End
 */
import java.util.*;
class adam
{
    int reverse(int n)
    { int d=0,r=0;
        while(n>0)
        {
            d=n%10;
            r=10*r+d;
            n=n/10;
        }
        return r;
    }
    boolean isprime(int n)
    { int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    boolean isadam(int n)
    {
        int sq=n*n;
        int numrev=reverse(n);
        int sqrev=numrev*numrev;
        if(reverse(sq)==sqrev)
        return true;
        else
        return false;
    }
    void check(int m,int n)
    {
        int c=0;
        if(m<n)
        {
           System.out.println("The Prime Adam integers are: ");
           for(int i=m; i<=n; i++)
           {
               if(isprime(i) && isadam(i))
               {
                   System.out.println(i);
                   c++;
               }
           }
           System.out.println("Frequency: "+c);
        }
        else
        System.out.println("Invalid input");
    }
    public static void main()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter Start of range: ");
        int a=as.nextInt();
        System.out.println("Enter end of range: ");
        int b=as.nextInt();
        adam obj=new adam();
        obj.check(a,b);
    }
}
