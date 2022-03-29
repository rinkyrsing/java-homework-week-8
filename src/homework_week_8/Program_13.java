package homework_week_8;


public class Program_13 {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));//true
        System.out.println(hasSharedDigit(9, -99));//false
        System.out.println(hasSharedDigit(15,55));//true
    }

    public static boolean hasSharedDigit(int a, int b) {
        // Declaring variables
        int leftnumA = a % 10;
        int rightnumA = a / 10;

        int lefttnumB = b % 10;
        int rightnumB = b / 10;

        if (a <= 10 || a >= 99 || b <= 10 || b >= 99) {
            return false;
        }
        boolean shared = (leftnumA == lefttnumB || leftnumA == rightnumB || rightnumA == lefttnumB || rightnumA == lefttnumB);

        return shared;
    }
    }