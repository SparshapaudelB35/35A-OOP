package week2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*task7 Take the name, roll number, and field of interest from the user and print in the format below:
         Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner inputUser = new Scanner(System.in);
        System.err.println("Enter your name,roll number and field of intrest");
        String name=inputUser.nextLine();
        String intrest=inputUser.nextLine();
        int rollNo=inputUser.nextInt();
        System.out.printf("Hey, my name is %s and my roll number is %d.My field of intrest are %s",name,rollNo,intrest);


    }
    
}
