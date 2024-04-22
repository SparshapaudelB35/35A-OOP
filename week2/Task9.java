package week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*Task 9 Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle in double");
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        double areaD = length*breadth;
        System.out.println("The area is"+(int)areaD);


    }
}
