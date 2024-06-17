package SDA;
/**
 # Question 2:

A University has implemented a specific sorting system to arrange the final percentage marks scored by students from highest to lowest. 
Write a Java program that allows the user to input the names and percentage marks of students as printed on their University report cards. Utilize the insertion sort technique within your program to sort the students based on their percentage marks. After sorting, segregate the 'Top scorers'—students with the highest marks above the students who scored lower.

Algorithm

1. Start.
2. Import `java.util.Scanner`.
3. Define `Student` class with `name` and `score` as instance variables.
4. Define constructor `Student(name, score)` to initialize `name` and `score`.
5. Define `getName()` method to return `name`.
6. Define `getScore()` method to return `score`.
7. Define `toString()` method to return `name` and `score` as a formatted string.
8. Define `StudentScoreSort` class with `main` method.
9. Create a `Scanner` object to read input.
10. Prompt the user to enter the number of students.
11. Read and store the number of students.
12. Create an array `students` of `Student` objects with size `n`.
13. Iterate to input details for each student:
a. Prompt the user to enter details for each student.
b. Read and store the name of the student.
c. Read and store the score of the student.
d. Create a new `Student` object with the entered name and score.
e. Store the `Student` object in the `students` array.
14. Call `insertionSort(students)` to sort the `students` array based on scores.
15. Print "Sorted list of students:".
16. Iterate over the `students` array:
a. Print each `Student` object using its `toString()` method.
17. Define `insertionSort(students)` method:
a. Initialize `n` to the length of `students`.
b. Iterate from index 1 to `n - 1`:
i. Assign `students[i]` to `key`.
ii. Initialize `j` to `i - 1`.
iii. Iterate while `j` is greater than or equal to 0 and `students[j].getScore()` is greater than `key.getScore()`:
A. Shift `students[j]` to `students[j + 1]`.
B. Decrement `j` by 1.
iv. Assign `key` to `students[j + 1]`.
18. End.
 */
import java.util.Scanner;

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public String toString() {
        return name + ": " + score;
    }
}
public class StudentScoreSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            students[i] = new Student(name, score);
        }
        insertionSort(students);
        System.out.println("\nSorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
