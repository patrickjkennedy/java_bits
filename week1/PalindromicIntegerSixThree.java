package java_bits.week1;

import java.util.Scanner;

public class PalindromicIntegerSixThree {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for a letter
        System.out.println("Please enter a number to check: ");

        if(isPalindrome(input.nextInt())){
            System.out.println("Number is a palindrome!");
        } else {
            System.out.println("Number is not a palindrome, too bad :(");
        }
    }

    public static int reverse(int number) {
        // Convert int to string
        String stringNumber = Integer.toString(number);

        // We now need an empty string to 'build up' our result into
        String result = "";

        // Loop backwards over stringNumber
        for(int i = stringNumber.length() - 1; i >= 0; i--){
            result += stringNumber.charAt(i);
        }

        // Convert the string result back into an integer and return
        return Integer.parseInt(result);
    }

    public static boolean isPalindrome(int number){
        if(number == reverse(number)){
            return true;
        } else {
            return false;
        }

        // You can also use this simplified expression instead:
        //return number == reverse(number);
    }
}
