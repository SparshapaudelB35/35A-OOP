package week3;
import java.util.Scanner;

public class Switchcase2 {
    public static void main(String[] args) {
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding 
        arithmetic operation using a switch case statement. */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter operator (+, -, *, /) to perform required task");
        String check = operator.nextLine();
        switch(check){
            case "+":
                System.out.println("The output is "+(num1+num2));
                break;
            case "-":
                System.out.println("The output is"+(num1-num2));
                break;
            case "*":
                System.out.println("The output is "+(num1*num2));
                break;
            case "/":
                System.out.println("The output is"+(num1/num2));
                break;
            default:
                System.out.println("No such operators");
                break;  
        }

        

    }
    
}
