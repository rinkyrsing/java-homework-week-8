package homework_week_8;

public class EvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number) {

        int i = number;
        int sum = 0;
        if (i > 0) {
            while (i != 0) {
                int even = i % 10;

                if ((even % 2) == 0)
                    sum = sum + even;

                i /= 10;
            }
            System.out.println("Sum of even number: " + sum);
        } else{
            System.out.println("-1");}
        return i;
    }
}


