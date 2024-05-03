package week4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
         * 10. Write a program that asks the user for a positive nonzero integer value.
         * The program should use a loop to get the sum of all the integers from 1 up to
         * the number entered. For example, if the user enters 50, the loop will find
         * the sum of 1+2+3+4+….+50.
         */
        int sum = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive non-Zero integer");
            int number = input.nextInt();
            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }
            System.out.println("sum of 1 to " + number + " is " + sum);

        } while (sum<0);

    }
}
