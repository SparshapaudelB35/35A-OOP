package week3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a JAVA program to find the maximum between three numbers.
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter three different numbers");
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();
        int num3 = numbers.nextInt(); 
        if(num1>num2 && num1>num3){
            System.out.println("The greatest among three is "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The greatest among three is "+num2);
        }else{
            System.out.println("The greatest among three is"+num3);
        }
    }
    
}
