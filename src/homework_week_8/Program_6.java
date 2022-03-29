package homework_week_8;

import java.util.Scanner;

public class Program_6 {

    public static void main(String[] args) {
        // calling method
        patternTriangel();

    }

    // Scanner for user input
    public static void patternTriangel() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        // Using for loop for triangle
        for (int i = 1; i <= n; i++) {

            System.out.println("");

            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j);
            }
        }
    }

}
