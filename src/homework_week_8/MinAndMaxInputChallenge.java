package homework_week_8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
       // obj.minMax();
        minmax();
    }

   /* public void minMax() {
        // while loop
        int min = 0, max = 0, i = 0, j = 0, count = 0, num = 0;


        while (i == j) {
            int cnt = count++;
            System.out.println("Enter Number #" + (cnt + 1) + ":");
            Scanner scanner = new Scanner(System.in);
            boolean validNum = scanner.hasNextInt();
            if (validNum) {
                num = scanner.nextInt();
                min = max = num;
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid Number");
                //System.out.println(min);
                break;
            }
            scanner.nextLine();
        }
        System.out.println(min);
        System.out.println(max);
    } */
   public static void minmax() {
       Scanner obj = new Scanner(System.in);
       boolean a,b;
       System.out.println("Enter two numbers:");
       a = obj.hasNextInt();
       b = obj.hasNextInt();
       while (a&&b){
           int num1=obj.nextInt();
           int num2=obj.nextInt();
           if (num1>num2) {
               System.out.println("Maximum number: " + num1);
               System.out.println("Minimum number: " + num2);
           } else {
               System.out.println("Minimum number: " + num1);
               System.out.println("Maximum number: " + num2);
           }
       }
       System.out.println("Please enter valid input number");
//break;


//obj.close();
   }}





