package SDA;

/*
 * Write a program that inputs the names of people into 2 different arrays, 'a' and 'b'. Array 'a' has N names while array 'b' has M names, with no duplicates in either of them. Merge the aarray 'a' and 'b' such that the resultant array is sorted alphabeticaally. Display all 3 arrays sorted alphabetically.
 */
import java.util.*;
public class Names {
    String a[],b[];
    int n,m;

    Names(int mm,int nn)
    {
        n = nn;
        m = mm;
        a = new String[n];
        b = new String[m];
    }

    void input()
    {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter names for array \"A\"");
        
        for(int i=0; i<n; i++)
            a[i] = as.nextLine();

        System.out.println("Enter names for array \"B\"");
        for(int i = 0; i<m; i++)
            b[i] = as.nextLine();
        
        as.close();
    }

    String[] merge(String arr1[], String arr2[])
    {
        String c[] = new String[m+n];
        int k = 0, i = 0, j = 0;

        while (i < n)
            c[k++] = arr1[i++];
 
        while (j < m)
            c[k++] = arr2[j++];

        return c;
    }

    void sort(String arr[])
    {
        String t = "";
        for(int i = 0; i<arr.length-1; i++)
            for(int j = 0; j<arr.length-i-1; j++)
                if(arr[j].compareTo(arr[j+1]) > 0)
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
    }

    void display1()
    {
        int l = a.length;
        System.out.println("Names in 1st Array: ");
        for(int i =0; i<l; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    void display2()
    {
        int l = b.length;
        System.out.println("Names in 2nd Array: ");
        for(int i =0; i<l; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
    void display3(String c[])
    {
        int l = c.length;
        System.out.println("Names in Merged Array: ");
        for(int i =0; i<l; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter size of array A and B : ");
        Names obj = new Names(as.nextInt(), as.nextInt());

        obj.input();
        String c[] = obj.merge(obj.a,obj.b);
        obj.sort(c);
        
        obj.display1();
        obj.display2();
        obj.display3(c);
    }
}
