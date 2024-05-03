package week4;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*
         * 9. Write a program that reads ten integer numbers and outputs the number of
         * inputs which are greater than 50, less than 50 or equal to 50. The program
         * should also display the average of all numbers greater than 50 and the
         * average of all numbers less than 50.
         */
        int[] greater=new int[100];
        int[] less=new int[100];
        int[] equal=new int[100];
        int i;
        int greatCount = 0;
        int lessCount = 0;
        int equalCount = 0;
        int greatSum = 0;
        int lessSum = 0;
        int[] number = new int[100];
        for(i = 0;i<10;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any integer");
            number[i] = input.nextInt(); 
        }
        for(i=0;i<10;i++){
            if(number[i]>50){
                greater[greatCount++]=number[i];

            }else if(number[i]<50){
                less[lessCount++]=number[i];
            }else{
                equal[equalCount++]=number[i]; 
            }

        }
        System.out.print("The numbers greater than 50:");
        for(i=0;i<greatCount;i++){
        
            System.out.print(greater[i]+" ");
            
        }
        System.out.println();
        System.out.print("The number less than 50:");
        for(i=0;i<lessCount;i++){
            System.out.print(less[i]+" ");
            
        }
        System.out.println();
        System.out.print("The number equal to 50:");
        for(i=0;i<equalCount;i++){
            System.out.print(equal[i]+" ");
        }
        for(i=0;i<greatCount;i++){
            greatSum = greatSum+greater[i];
        }
        System.out.println();
        System.out.print("The average of all numbers greater than 50:"+(greatSum/greatCount));
        for(i=0;i<greatCount;i++){
            lessSum = lessSum+less[i];
        }
        System.out.println();
        System.out.print("The average of all numbers greater than 50:"+(lessSum/lessCount));


        
    }

}
