package week2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*task5
        Write a program to take two integer inputs from the user and print the sum and product of them. */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("the sum is"+(num1+num2));
        System.out.println("the product is"+(num1*num2));
    }
}
