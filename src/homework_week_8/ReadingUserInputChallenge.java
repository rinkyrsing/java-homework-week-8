package homework_week_8;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    static int x;

    public static void main(String[] args) {
        sumUserInput();
    }

    public static void sumUserInput() {
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count++);
            Scanner sc = new Scanner(System.in);
            boolean validNum = sc.hasNextInt();
            if (validNum) {
                int i = sc.nextInt();
                sum = sum + i;
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
