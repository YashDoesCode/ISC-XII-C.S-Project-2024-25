package NumberBased;

import java.util.Scanner;

class Frequency {
    String text;
    public int countand;
    public int countan;
    public int len;

    Frequency() {
        text = "";
        countand = 0;
        countan = 0;
        len = 0;
    }

    void accept(String n) {
        text = n;
    }

    void checkAndFreq() {
        String S = "";
        countand = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S.equals("and")) {
                    countand = countand + 1;
                }
                S = "";
            } else {
                S = S + b;
            }
        }
        if (S.equals("and")) {
            countand = countand + 1;
        }
    }

    void checkAnFreq() {
        String S1 = "";
        countan = 0;
        len = text.length();
        for (int i = 0; i < len; i++) {
            char b = text.charAt(i);
            if (b == ' ') {
                if (S1.equals("an")) {
                    countan = countan + 1;
                }
                S1 = "";
            } else {
                S1 = S1 + b;
            }
        }
        if (S1.equals("an")) {
            countan = countan + 1;
        }
    }

    void display() {
        System.out.println("Frequency of 'and' in the sentence is: " + countand);
        System.out.println("Frequency of 'an' in the sentence is: " + countan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frequency freq = new Frequency();

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        freq.accept(input);
        freq.checkAndFreq();
        freq.checkAnFreq();
        freq.display();

        scanner.close();
    }
}
