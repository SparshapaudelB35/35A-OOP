package week4;
 
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
         * 5. Modify the above program by using a do..while loop so that it provides the
         * user with the option to continue running the program and enter more inputs.
         * For example:
         * 
         * Sample Run:
         * 
         * Enter a positive non-zero integer 4
         * 
         * Sum of 1 to 4 is 10
         * 
         * Do you want to continue? Enter ‘y’ for yes or any other character for no.
         * 
         * y
         * 
         * Enter a positive non-zero integer 3
         * 
         * Sum of 1 to 3 is 6
         * 
         * Do you want to continue? Enter ‘y’ for yes and any other character for no.
         * 
         * n.
         */
        
        int sum = 0;
        char character;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive non-Zero integer");
            int number = input.nextInt();
            for(int i=1;i<=number;i++){
                sum = sum+i;
            }    
            System.out.println("sum of 1 to "+number+" is "+sum);
            Scanner c = new Scanner(System.in);
            System.out.println("Do you want to continue Enter 'y' for yes and other character for no");
            character = c.next().charAt(0);
        }while(character =='y'||character =='Y');
        


    }

}
