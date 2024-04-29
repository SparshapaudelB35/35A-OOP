package week3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // Write a JAVA program to input any alphabet and check whether it is vowel or consonant
        Scanner alpha = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        String check = alpha.nextLine();
        switch(check){
            case "a":
                System.out.println("It is vowel");
                break;
            case "e":
                System.out.println("It is vowel");
                break;
            case "i":
                System.out.println("It is vowel");
                break;
            case "o":
                System.out.println("It is vowel");
                break;
            case "u":
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");
                break;
        }
    }

}
