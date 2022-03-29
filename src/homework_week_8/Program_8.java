package homework_week_8;

import java.util.Scanner;

public class Program_8 {

    public static void main(String[] args) {

        // Calling triangle method
        triangle();
    }

    public static void triangle(){
        // User Input Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        // Nested for loop

        for(int i = 0; i < n; i++ ){
            System.out.println("");
            for(int j=0; j <=i; j++){
                System.out.print(" " + "@");
            }
        }
    }
}
