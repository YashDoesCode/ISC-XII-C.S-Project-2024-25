package NumberBased;

import java.util.Scanner;

public class Mixer {
    int arr[];
    int n;
    Scanner sc = new Scanner(System.in);

    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }

    void accept() {
        System.out.println("Enter " + n + " unique elements in ascending order:");
        for (int i = 0; i < n; i++) {
            int input;
            while (true) {
                input = sc.nextInt();
                if (i == 0 || input > arr[i - 1]) {
                    arr[i] = input;
                    break;
                } else {
                    System.out.println("Please enter a number greater than " + arr[i - 1] + " to maintain ascending order without duplicates:");
                }
            }
        }
    }

    Mixer mix(Mixer A) {
        Mixer B = new Mixer(n + A.n);
        int x = 0, i = 0, j = 0;

        while (i < n && j < A.n) {
            if (arr[i] < A.arr[j]) {
                B.arr[x++] = arr[i++];
            } else if (arr[i] > A.arr[j]) {
                B.arr[x++] = A.arr[j++];
            } else {
                B.arr[x++] = arr[i++];
                j++;
            }
        }

        while (i < n) {
            B.arr[x++] = arr[i++];
        }
        while (j < A.n) {
            B.arr[x++] = A.arr[j++];
        }

        B.n = x;
        return B;
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("ENTER SIZE OF FIRST ARRAY: ");
        int sizeOfFirstArray = sc1.nextInt();
        Mixer P = new Mixer(sizeOfFirstArray);
        P.accept();

        System.out.print("ENTER SIZE OF SECOND ARRAY: ");
        int sizeOfSecondArray = sc1.nextInt();
        Mixer Q = new Mixer(sizeOfSecondArray);
        Q.accept();

        Mixer R = P.mix(Q);
        System.out.println("Merged array:");
        R.display();
    }
}
