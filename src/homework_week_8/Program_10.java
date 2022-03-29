package homework_week_8;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        armstrong();

    }
    public static void armstrong(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        // 153==> (1*1*1) + (5*5*5) + (3*3*3) ==> 1 + 125 + 27 = 153
        // Getting 1, 2, and 3 number

       // int n = 153;
        int num, remainder, result = 0;
         num = n;

         while (num != 0) {
             remainder = num % 10;  // last digit
             result += Math.pow(remainder, 3);
             num /= 10;

         }
         if (result == n)
         {

            System.out.println(n + " is an Armstrong number.");
        }
       else{
          System.out.println(n + " is not an Armstrong number");
       }

    }

}
