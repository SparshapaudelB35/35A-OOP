package week2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        /*Task 6
         * Take two integer inputs from the user. First, calculate the sum of two,
         *  then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        float sum = num1+num2;
        float product = num1*num2;
        System.out.println("the division of sum and product is "+(product/sum));
    }
}
