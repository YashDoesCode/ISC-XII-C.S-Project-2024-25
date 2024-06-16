package DDA;

import java.util.Scanner;
import java.util.Arrays;

class SwapSort {
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    SwapSort() {
        wrd = "";
        len = 0;
        swapwrd = "";
        sortwrd = "";
    }
    void readword() {
        Scanner sc = new Scanner(System.in);
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }
    void swapChar() {
        if (len > 1) {
            swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
        } else {
            swapwrd = wrd;
        }
    }
    void sortword() {
        char[] chars = wrd.toCharArray();
        Arrays.sort(chars);
        sortwrd = new String(chars);
    }
    void display() {
        System.out.println("Original Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }
    public static void main(String[] args) {
        SwapSort obj = new SwapSort();
        obj.readword();
        obj.swapChar();
        obj.sortword();
        obj.display();
    }
}