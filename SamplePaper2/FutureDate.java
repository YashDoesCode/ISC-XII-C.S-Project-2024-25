package SamplePaper2;
/*
1. Start.
2. Import `java.util.Scanner`.
3. Define `FutureDate` class with `main` method.
4. Create `Scanner` object to read input.
5. Read and store day number (1-366).
6. Read and store year (yyyy).
7. Read and store N (1-100).
8. Validate day number (1-366).
9. If invalid, print "INCORRECT DAY NUMBER" and exit.
10. Validate N (1-100).
11. If invalid, print "INCORRECT VALUE OF 'N'" and exit.
12. Define arrays `daysInMonths` and `monthNames`.
13. Initialize `month` and `day` to 0.
14. Iterate to find month for entered day.
15. Calculate remaining day in month.
16. Print entered date.
17. Add N days to entered day.
18. Handle month and year change if necessary.
19. Print date N days later.
20. End.
 */
import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (between 1 and 366): ");
        int dayNumber = scanner.nextInt();

        System.out.print("Enter year (yyyy): ");
        int year = scanner.nextInt();

        System.out.print("Enter value of N (1 <= N <= 100): ");
        int N = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 366) {
            System.out.println("INCORRECT DAY NUMBER");
            return;
        }
        if (N < 1 || N > 100) {
            System.out.println("INCORRECT VALUE OF 'N'");
            return;
        }

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

        int month = 0;
        int day = dayNumber;
        for (int i = 0; i < 12; i++) {
            if (day > daysInMonths[i]) {
                day -= daysInMonths[i];
            } else {
                month = i;
                break;
            }
        }

        System.out.println("ENTERED DATE: " + monthNames[month] + " " + day + ", " + year);

        day += N;
        while (day > daysInMonths[month]) {
            day -= daysInMonths[month];
            month++;
            if (month == 12) {
                month = 0;
                year++;
            }
        }

        System.out.println(N + " DAYS LATER: " + monthNames[month] + " " + day + ", " + year);
    }
}
