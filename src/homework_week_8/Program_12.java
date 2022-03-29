package homework_week_8;

import java.util.Scanner;

public class Program_12 {

    public static void main(String[] args) {

        primeNum();
    }
    public static void primeNum(){
        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Prime Number: ");
        int num = scanner.nextInt();

        for(int i = num; i <= num; i++){
           // System.out.println(num +);

            if(i%2 != 0){
                System.out.println("It's a Prime Number:");
            }else {
                System.out.println("It's not a Prime Number:");
            }
        }

    }
}
