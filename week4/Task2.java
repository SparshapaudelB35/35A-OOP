package week4;

public class Task2 {
    public static void main(String[] args) {
        /*
         * 2. Write a program that displays the following table (note that 1 mile is
         * 1.609 kilometers):
         * Miles Kilometers
         * 
         * 1 1.609
         * 
         * 2 3.218
         * 
         * … ….
         * 
         * 9 14.481
         * 
         * 10 16.090
         */
        System.out.println("Miles\tKilometer");
        for(int i=1;i<11;i++){
            System.out.println(i+" \t"+(i*1.609));
        }
    }

}

