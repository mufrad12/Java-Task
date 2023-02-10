//Encrypt word when A=F
//Input: Apple
//Output: Fuuqj

import java.util.Scanner;
public class EncryptWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your word: ");
        String word = input.next();
        String cipherWord = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
                cipherWord = cipherWord + (char) ((ch - 'A' + 5) % 26 + 'A');
            }
            else if (ch >= 'a' && ch <= 'z')
            {
                cipherWord = cipherWord + (char) ((ch - 'a' + 5) % 26 + 'a');
            }
            else
            {
                cipherWord = cipherWord + ch;
            }
        }
        System.out.println("Encrypted word: " + cipherWord);
    }
}
