package week3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Write a JAVA program to check whether a number is even or odd.
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter any number");
        int num1 = numbers.nextInt();
        if(num1%2==0){
            System.out.println(num1+" is even number");
        }else{
            System.out.println(num1+" is not even number");
        }
        
    }
    
}
