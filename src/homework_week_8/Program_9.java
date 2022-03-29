package homework_week_8;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        fibonacci();

    }

    public static void fibonacci() {
        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int fib = scanner.nextInt();

        //int n = 10;
        int firstnum = 1;
        int secondnum = 1;
        System.out.println("Fibonacci series till "+ fib + " terms: ");

        for (int i = 1; i <= fib; i++) {
            System.out.print(firstnum + ", " );
            int nextnum = firstnum + secondnum; // adding i and 2 digit
            firstnum = secondnum;
            secondnum = nextnum;
        }

    }
}
