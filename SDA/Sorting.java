package SDA;


/*WAP to input the choice of sorting technique from user (Bubble sort, Selection Sort, Insertion sort), initialize a SDA of 10 integers 
 and sort them in ascending order using the selected technique. */

import java.util.*;

public class Sorting 
{
    int arr[],l;
    Sorting(int n)
    {
        l = n;
        arr = new int[l];
    }
    public void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i<l; i++)
            arr[i] = as.nextInt();
    }
    public void bubbleSort()
    {
        int t=0;
        for (int i=1; i<l; i++)
        {
            for (int j=0; j<l-i; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public void insertionSort()
    {
        for(int i=1; i<l; i++)
        {
            int j = i-1;
            int t = arr[i];
            while(j>=0 && t<=arr[j])
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = t;
        }
    }
    public void selectionSort()
    {
        int min=0,t=0;
        for(int i=0; i<l-1; i++)
        {   min = i;
            for(int j=i+1; j<l; j++)
            {
                 if(arr[j]<arr[min])
                  min = j;   
            }
            t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }
    public void display()
    {
        System.out.println("Sorted Array:");
        for(int i = 0; i<l; i++)
        System.out.print(arr[i] + " ");
    }
    public static void main() 
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = as.nextInt();
        Sorting obj = new Sorting(n);
        obj.input();
        System.out.println("Choose Sorting Technique: ");
        System.out.println("1. Bubble Sort ");
        System.out.println("2. Insertion Sort ");
        System.out.println("3. Selection Sort ");
        int ch = as.nextInt();
        switch(ch)
        {
            case 1: 
                obj.bubbleSort();
            break;
            case 2: 
                obj.insertionSort();
            break;
            case 3: 
                obj.selectionSort();
            break;
            default:
            System.out.println("Invalid Choice");
        }
        obj.display();
    }
}
