package homework_week_8;

import java.util.Scanner;

public class Program_15 {

    public static void main(String[] args) {
        // Calling method
        triangle();

    }

    public static void triangle(){
       // User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int tri = sc.nextInt();

        for(int i = 1; i <= tri; i++){
            System.out.println(""); // print row

            for (int j = 1; j <= i; j++ ){
                System.out.print(" "+ "*"); // print colum

            }
        }

    }
}
