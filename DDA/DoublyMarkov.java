package DDA;

import java.util.Scanner;

public class DoublyMarkov
{   
    double m[][];
    int n;
    
    public void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = as.nextInt();
        n = size;
        if (n >= 3 && n <= 9)
        {
            m = new double[n][n];
            System.out.println("Enter " + (n * n) + " Elements: ");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    m[i][j] = as.nextDouble();
            }
        }
        else
            System.out.println("Invalid Input");
    }
    
    public boolean element()
    {  
        int f = 0;
        for (int i = 0; i < n; i++)
        { 
            int t = 0;
            for (int j = 0; j < n; j++)
            {
                if (m[i][j] < 0)
                {
                    t = 1;
                    break;
                }
            }
            if (t == 1)
            {
                f = 1;
                break;
            }
        }
        if (f == 0)
            return true;
        else
            return false;
    }
    
    public boolean sumrow()
    { 
        int t = 0;
        for (int i = 0; i < n; i++)
        { 
            double s = 0;
            for (int j = 0; j < n; j++)
            {
                s = s + m[i][j];
            }
            if (s != 1)
            {
                t = 1;
                break;
            }
        }
        if (t == 0)
            return true;
        else
            return false;
    }
    
    public boolean sumcolumn()
    { 
        int t = 0;
        for (int i = 0; i < n; i++)
        { 
            double s = 0;
            for (int j = 0; j < n; j++)
            {
                s = s + m[j][i];
            }
            if (s != 1)
            {
                t = 1;
                break;
            }
        }
        if (t == 0)
            return true;
        else
            return false;
    }
    
    public void display()
    {
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        if (element() && sumrow() && sumcolumn())
        {
            System.out.println("Doubly Markov Matrix");
        }
        else
        {
            System.out.println("Not a Doubly Markov Matrix");
        }
    }
    
    public static void main()
    {
        DoublyMarkov obj = new DoublyMarkov();
        obj.input();
        obj.display();
    }
}
