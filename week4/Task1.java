package week4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("hello "+name);
        }
    }
    
}
