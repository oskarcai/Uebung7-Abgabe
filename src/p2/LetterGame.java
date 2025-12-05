package p2;

import java.util.Arrays;

public class LetterGame {
    public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
    public String word = "";
    public int[] a;

    public LetterGame() {   // Konstruktor
    }

    // keyString.charAt(12) returns the character at index 12
    // keyString.indexOf("C") returns the index of the first occurence of "c" in the String

    public void setWord(int[] a) {
        for(int i = 0; i < a.length; i++) {
            word += keyString.charAt(a[i]);
        }

        // Debugging:
        System.out.println(word);
    }

    public void findCode(String s) {
        a = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            a[i] = keyString.indexOf(s.charAt(i));
        }

        // Debugging:
        System.out.println(Arrays.toString(a));
    }
}