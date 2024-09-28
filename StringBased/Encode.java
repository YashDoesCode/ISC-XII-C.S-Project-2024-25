package StringBased;

import java.util.Scanner;

public class Encode {
    String word, new_word;
    int length;

    Encode() {
        word = "";
        new_word = "";
        length = 0;
    }

    void acceptWord() {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = as.next();
    }
    
    void nextVowel() {
        length = word.length();
        String vowS = "aeiou";
        String vowC = "AEIOU";

        for (int i = 0; i < length; i++) {   
            char x = word.charAt(i);

            if (vowS.indexOf(x) != -1)
                x = vowS.charAt((vowS.indexOf(x) + 1) % 5);
            else if (vowC.indexOf(x) != -1)
                x = vowC.charAt((vowC.indexOf(x) + 1) % 5);
            
            new_word += x;
        }    
    }

    void display() {
        System.out.println("Original Word: " + word);
        System.out.println("Encrypted Word: " + new_word);
    }

    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.acceptWord();
        obj.nextVowel();
        obj.display();
    }   
}
