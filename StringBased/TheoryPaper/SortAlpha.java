package StringBased.TheoryPaper;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlpha {

    String sent;
    int n;

    public SortAlpha() {
        this.sent = "";
        this.n = 0;
    }

    public void acceptSent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        this.sent = scanner.nextLine();
        this.n = this.sent.split(" ").length;
    }

    public void sort(SortAlpha P) {
        String[] words = P.sent.split(" ");
        Arrays.sort(words);
        this.sent = String.join(" ", words);
    }

    public void display(SortAlpha original) {
        System.out.println("Original sentence: " + original.sent);
        System.out.println("Sorted sentence: " + this.sent);
    }

    public static void main(String[] args) {
        SortAlpha original = new SortAlpha();
        original.acceptSent();

        SortAlpha sorted = new SortAlpha();
        sorted.sort(original);

        sorted.display(original);
    }
}
