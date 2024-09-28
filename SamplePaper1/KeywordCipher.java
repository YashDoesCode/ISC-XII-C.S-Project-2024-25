package SamplePaper1;

/**
 Question 17: 
Keyword cipher is a form of encryption technique. A keyword is used as the key, and it determines the letter matching the cipher alphabet to the plain alphabet. Repeats of letters in the word are removed, then the cipher alphabet is generated with the keyword matching to A, B, C etc. until the keyword is used up, whereupon the rest of the cipher text letters are used in alphabetical order, excluding those already used in the key.
Encryption: The first line of input contains the keyword which you wish to enter. The second line of input contains the string which you have to encrypt.
Plaintext: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Encrypted: K R Y P T O S A B C D E F G H I J L M N Q U V W X Z
Example ?
Encrypting the message: KNOWLEDGE IS POWER when, Keyword is KRYPTOS
Decoded Message ? DGHVETPST BM IHVTL
Write a program to accept a Coded text in upper case and a Keyword. Using the above technique, decrypt the text and display. Note: All the messages are encoded in uppercase. Whitespace, special characters, and numbers remains unchanged.
Test your program for the following inputs:
Example 1?
INPUT: ENTER KEYWORD: SECRET
       ENTER TEXT TO BE DECODED: ZLJEFT DTOT
OUTPUT: DECODED TEXT: ZOMBIE HERE

Example 2 ?
INPUT: ENTER KEYWORD: STAR WARS
       ENTER TEXT TO BE DECODED: SPPSAG SP RSVJ
OUTPUT: DECODED TEXT: ATTACK AT DAWN

Example 3?
INPUT: ENTER KEYWORD: PLAYERS
       ENTER TEXT TO BE DECODED: Haln de yokl
OUTPUT: INVALID INPUT**

Algorithm
1.	Start
2.	Import java.util.Scanner.
3.	Define KeywordCipher class.
4.	Define DuplicateRemover method with String keyword parameter.
5.	Initialize result to an empty string.
6.	Loop through keyword characters.
7.	Append character to result if not already present.
8.	Return result.
9.	Define CipherAdder method with String keyword parameter.
10.	Call DuplicateRemover and store result in Dup.
11.	Initialize Alpha with "ABCDEFGHIJKLMNOPQRSTUVWXYZ".
12.	Initialize cAlpha to an empty string.
13.	Loop through Dup characters and append to cAlpha if in Alpha.
14.	Loop through Alpha characters and append to cAlpha if not in cAlpha.
15.	Return cAlpha.
16.	Define decryptMessage method with String encoded and String keyword parameters.
17.	Call CipherAdder and store result in cAlpha.
18.	Initialize decoded to an empty string.
19.	Loop through encoded characters.
20.	For each character, find its index in cAlpha and append corresponding 'A' + index character to decoded.
21.	End
 */
import java.util.Scanner;

public class KeywordCipher {
    public static String DuplicateRemover(String keyword) {
        String result = "";
        for (int i = 0; i < keyword.length(); i++) {
            if (!result.contains(String.valueOf(keyword.charAt(i)))) {
                result += String.valueOf(keyword.charAt(i));
            }
        }
        return result;
    }
    public static String CipherAdder(String keyword) {
        String Dup = DuplicateRemover(keyword);
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cAlpha = "";
        for (int i = 0; i < Dup.length(); i++) {
            if (Alpha.indexOf(Dup.charAt(i)) != -1) {
                cAlpha += Dup.charAt(i);
            }
        }
        for (int i = 0; i < Alpha.length(); i++) {
            if (cAlpha.indexOf(Alpha.charAt(i)) == -1) {
                cAlpha += Alpha.charAt(i);
            }
        }
        return cAlpha;
    }
    public static String decryptMessage(String encoded, String keyword) {
        String cAlpha = CipherAdder(keyword);
        String decoded = "";
        for (int i = 0; i < encoded.length(); i++) {
            char c = encoded.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int cAlphaIndex = cAlpha.indexOf(c);
                decoded += (char) ('A' + cAlphaIndex);
            } else {
                decoded += c;
            }
        }
        return decoded;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER KEYWORD: ");
        String keyword = scanner.nextLine().toUpperCase().replaceAll("\\s+", "");
        System.out.print("ENTER TEXT TO BE DECODED: ");
        String textToDecode = scanner.nextLine().toUpperCase();        
        String decoded = decryptMessage(textToDecode, keyword);
        System.out.println("DECODED TEXT: " + decoded);
    }
}
