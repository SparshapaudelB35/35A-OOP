package week3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        System.out.println("Enter a numbers");
        Scanner numbers = new Scanner(System.in);
        int num1 = numbers.nextInt();
        if(num1%5==0 && num1%11==0){
            System.out.println(num1+" is divisibble by 5 and 11 ");
        }else{
            System.out.println(num1+" is not divisible by 5 and 11");
        }
    }
}
