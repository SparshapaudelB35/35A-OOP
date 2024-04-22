package week2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        /*Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest,
         Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Enter sides of square,principal,rate,time,base nad height of triangle,lengthn of cube and breadth and height of cuboid");
        int sidesSquare = inputUser.nextInt();
        int principal = inputUser.nextInt();
        int rate = inputUser.nextInt();
        int time = inputUser.nextInt();
        int baseLength = inputUser.nextInt();
        int heightLength = inputUser.nextInt();
        int lengthCube = inputUser.nextInt();
        int lengthCuboid = inputUser.nextInt();
        int breadthCuboid = inputUser.nextInt();
        int heightCuboid = inputUser.nextInt();
        System.out.println("Area of square is "+sidesSquare*sidesSquare);
        System.out.println("perimeter of square is "+(4*sidesSquare));
        System.out.println("The simple intrest is "+(principal*rate*time)/100);
        System.out.println("The area of triangle is "+(1/2)*baseLength*heightLength);
        System.out.println("The volume of cube is "+(lengthCube*lengthCube*lengthCube));
        System.out.println("The volume of cuboid is "+(lengthCuboid*breadthCuboid*heightCuboid));




    }
}
