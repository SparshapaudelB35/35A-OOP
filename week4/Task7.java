package week4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Write a program to calculate the HCF of Two given numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();
        int hcf = 0;
        for(int i = 1;i<=num1||i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF of two number is "+hcf);
    }
    
}
