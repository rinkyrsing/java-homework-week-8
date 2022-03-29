package homework_week_8;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        diamond();
    }

    public static void diamond() {
        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        // Variables
        // printing upper pyramid
        int i, j, k;
        for (i = 1; i <= n; i++) {// this will print row

            for (j = n; j > i; j--) {
                System.out.print(" "); // This will print colum
            }
            for (k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Revers the same program to print lower pyramid

        for (i = 1; i <= n-1; i++) { // this will print row
            for (j = 0; j < i; j++) {
                System.out.print(" "); // This will print colum
            }
            for ( k = (n - i) * 2 - 1 ; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


