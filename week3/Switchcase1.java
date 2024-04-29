package week3;

import java.util.Scanner;

public class Switchcase1 {
    public static void main(String[] args) {
        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value.
        Use a switch case statement to handle different grades. */
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your grade");
        String check = grade.nextLine();
        switch (check) {
            case "A":
                System.out.println("3.6");
                break;
            case "B":
                System.out.println("2.8");
                break;
            case "C":
                System.out.println("2.4");
                break;
            case "D":
                System.out.println("2.0");
                break;
            case "E":
                System.out.println("1.6");
                break;
            default:
                System.out.println("fail");
                break;
        }
    }
}
