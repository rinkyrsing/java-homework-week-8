package homework_week_8;

import java.util.Scanner;

public class DigitSumChallenge {

    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();
        sumDigits(num);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number != 0) { // executes until the condition become false
                int rem = number % 10; // last digit
                sum = sum + rem; // addition of number
                number = number / 10; //remove last digit
            }
            System.out.println("Sum of all digits are: "+sum);
            return 0;
        }
        else
        {
            if (number <= 0)
            {

                return -1;
            }

        }
        System.out.println("Invalid Number");
        return -1;
    }
}





