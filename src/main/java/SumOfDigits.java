//Find out sum of digits of a number
// Input: 152
//Output: 8

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your digits: ");
        int number = input.nextInt();
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of digits of the number: " + sum);
    }
}
