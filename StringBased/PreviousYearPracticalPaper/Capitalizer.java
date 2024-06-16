package StringBased.PreviousYearPracticalPaper;

import java.util.Scanner;

public class Capitalizer {
    static String sent;
    static int frequency;

    public Capitalizer() {
        sent = "";
        frequency = 0;
    }
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to analyze: ");
        sent = scanner.nextLine();
    }
    public static boolean isCapital(String w) {
        char c = w.charAt(0);
        return Character.isUpperCase(c);
    }
    public static void display() {
        System.out.println("Sentence = " + sent);
        String b = " " + sent;
        char c;
        for (int i = 0; i < b.length(); i++) {
            c = b.charAt(i);
            if (c == ' ' && i + 1 < b.length()) {
                if (Character.isUpperCase(b.charAt(i + 1))) {
                    frequency++;
                }
            }
        }
        System.out.println("Frequency of the title word = " + frequency);
    }
    public static void main(String[] args) {
        Capitalizer obj = new Capitalizer();
        obj.input();
        obj.display();
    }
}
