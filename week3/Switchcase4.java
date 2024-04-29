package week3;

import java.util.Scanner;

public class Switchcase4 {
    public static void main(String[] args) {
        /*
         * Implement a Java program that calculates the area of different shapes
         * (circle, rectangle, square, triangle)
         * based on the user's choice using a switch case.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a shape(circle, rectangle, square, triangle)");
        String shape = input.nextLine();
        switch (shape) {
            case "circle":
                Scanner circle = new Scanner(System.in);
                System.out.println("Enter radius of circle");
                int radius = circle.nextInt();
                System.out.println("The area of circle is " + (3.14 * radius * radius));
                break;
            case "rectangle":
                Scanner rectangle = new Scanner(System.in);
                System.out.println("Enter length and breadth of rectangle");
                int length = rectangle.nextInt();
                int breadth = rectangle.nextInt();
                System.out.println("The area of rectangle is " + (length * breadth));
                break;
            case "square":
                Scanner square = new Scanner(System.in);
                System.out.println("Enter length of square");
                int squareLength = square.nextInt();
                System.out.println("The area of square is " + (squareLength * squareLength));
                break;
            case "triangle":
                Scanner triangle = new Scanner(System.in);
                System.out.println("Enter base and height of triangle");
                int base = triangle.nextInt();
                int height = triangle.nextInt();
                System.out.println("The area of triangle is "+0.5*base*height);
                break;
            default:
                System.out.println("Spelling Wrong");
                break;
        }

    }

}
