package week3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        //Write a JAVA program to check whether a year is a leap year or not. 
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter any year");//if year%4==0; if year%100!==0 ; year%400==0;
        int year = numbers.nextInt();
        if(year%4==0){
            if(year%100!=0||year%400==0){
                System.out.println("The year is leap year");
            }        
        }else{
            System.out.println("The year is not leap year");
        }
        


        
    }
}
