package NumberBased;

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
