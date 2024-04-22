package week2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        /*Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
        And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator */
        Scanner inputMarks = new Scanner(System.in);
        System.out.println("Enter total full marks of four subject");
        int totalMarks = inputMarks.nextInt();
        System.out.println("Enter obtained marks of four subject each");
        float marks1 = inputMarks.nextFloat();
        float marks2 = inputMarks.nextFloat();
        float marks3 = inputMarks.nextFloat();
        float marks4 = inputMarks.nextFloat();
        float total = marks1+marks2+marks3+marks4;
        float percentage =(total/totalMarks)*100;
        String check = (percentage>=70)?"First class":(percentage>59)?"upper second class":(percentage>49)?"second class":(percentage>39)?"Third class":"fail";
        System.out.println(check);

    }
    
}
