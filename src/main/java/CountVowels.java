//Count Vowels and consonants from a word
//Input: Dhaka
//Output:
//Vowel: 2 Consonant: 3

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your word: ");
        String word = input.next();
        int v = 0, c = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                v++;
            }
            else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
            {
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonant: " + c);
    }
}
