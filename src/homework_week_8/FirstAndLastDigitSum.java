package homework_week_8;

import jdk.nashorn.internal.ir.WhileNode;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int number = sc.nextInt();
        System.out.println("Entered Number is " + number);
        sumFirstAndLastDigit(number);
    }

    public static int sumFirstAndLastDigit(int number) {//254
        // Declaring two intiger type variables and initialize 0
        int firstD = 0;
        int lastD = 0;
        // Identify last digit
        lastD = number % 10;
        if (number < 0)
        {
            System.out.println("Which is invalid");
            return -1;
        }

       // Identify First digit
        while (number != 0 )
        {
            int rem = number%10;//4
            firstD = rem;
            number = number/10;//0
        }

        System.out.println("First Digit is " +firstD);
        System.out.println("Last Digit is " + lastD);
        int sum = firstD + lastD;
        System.out.println("Sum of the first and last digit is " + sum);

        return 0;
        }



    }

