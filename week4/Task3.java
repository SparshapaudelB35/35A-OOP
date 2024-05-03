package week4;

public class Task3 {
    public static void main(String[] args) {
        /*
         * 3. Write a program that generates the following table:
         * 
         * Number Square
         * 
         * 10 100
         * 
         * 9 81
         * 
         * .. ….2 4
         * 
         * 1 1
         */
        System.out.println("Number\tSquare");
        for(int i=10;i>0;i--){
            System.out.println(i+"\t"+(i*i));
        }
    }

}
