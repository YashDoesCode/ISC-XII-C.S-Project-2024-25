package SDA;
/**
Question 3: 
WAP to input the choice of sorting technique from the user (Bubble sort, Selection Sort, Insertion sort), initialize a SDA of 10 integers and sort them in ascending order using the selected technique.
Algorithm
1.	Start
2.	Define a class Sorting.
3.	Declare an integer array arr and an integer l for the array size.
4.	Create a constructor Sorting(int n) to initialize l and allocate memory for arr.
5.	Define the method input() to read user input.
6.	Inside input(), create a Scanner object.
7.	Prompt the user to enter array elements.
8.	Use a loop to read l integers into arr.
9.	Define the method bubbleSort() for bubble sorting.
10.	Use nested loops in bubbleSort() to compare and swap elements.
11.	Define the method insertionSort() for insertion sorting.
12.	In insertionSort(), loop through the array to insert elements in the correct position.
13.	Define the method selectionSort() for selection sorting.
14.	In selectionSort(), find and swap the minimum element with the first unsorted element.
15.	Define the method display() to print the sorted array.
16.	In display(), print "Sorted Array:" and loop to print each element.
17.	Define the main() method as the entry point.
18.	Inside main(), create a Scanner object and read the size of the array.
19.	Call input(), display sorting options, and read the user's choice.
20.	Based on the choice, call the corresponding sorting method and display the sorted array. End.
 */

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
