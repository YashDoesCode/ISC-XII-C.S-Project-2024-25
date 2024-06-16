package DDA;

import java.util.Scanner;

public class MirrorInage {
    static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int[][] arrMirrorer(int[][] arr) {
        int n = arr.length;
        int[][] ModdedArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ModdedArray[i][j] = arr[i][n - j - 1];
            }
        }
        return ModdedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        
        System.out.println("Enter the elenents of the arr:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original arr:");
        Display(arr);

        int[][] ModdedArray = arrMirrorer(arr);
        System.out.println("Modified arr:");
        Display(ModdedArray);
    }
}