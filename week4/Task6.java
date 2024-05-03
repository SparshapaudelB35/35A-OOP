package week4;

public class Task6 {
    public static void main(String[] args) {
        /*
         * 6. Write a program that reads the width and generates a corresponding
         * triangle of *. For example, if width = 5, output is:
         *
         **
         ***
         ****
         *****
         * Use a nested for loop to generate the above pattern.
         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
