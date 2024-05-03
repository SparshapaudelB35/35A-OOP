package week4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
         * Write a program that prompts the user to input an integer and then outputs
         * the number with the digits reversed. For example, if the input is 12345, the
         * output should be 54321.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a long positive integer");
        int longPos = input.nextInt();
        int reverse = 0;
        while(longPos!=0){
            int lastNumber = longPos%10;
            reverse = reverse*10+lastNumber;
            longPos/=10;
        }
        System.out.println("The reverse is "+reverse);
    }
}
