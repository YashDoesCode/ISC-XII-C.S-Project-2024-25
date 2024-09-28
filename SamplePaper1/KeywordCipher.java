package SamplePaper1;

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
