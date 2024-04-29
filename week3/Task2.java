package week3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //Write a JAVA program to check whether a number is negative, positive, or zero
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter a numbers");
        int num1 = numbers.nextInt();
        if(num1>0){
            System.out.println(num1+"is positive");
        }else if(num1<0){
            System.out.println(num1+"is negative");
        }else{
            System.out.println(num1+"is Zero");
        }
    }
}
