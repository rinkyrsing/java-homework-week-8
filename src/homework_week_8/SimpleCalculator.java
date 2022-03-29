package homework_week_8;

public class SimpleCalculator {
    double firstNumber, secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }

    public double getFirstNumber() {

        return firstNumber;
    }

    public double getSecondNumber() {

        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double firstNumber) {

        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double add = this.firstNumber + this.secondNumber;
        return add;
    }

    public double getSubtractionResult() {
        double sub = this.firstNumber - this.secondNumber;
        return sub;
    }

    public double getMultiplicationResult() {
        double multiplication = this.firstNumber * this.secondNumber;
        return multiplication;
    }

    public double getDivisionResult() {
        double division = 0;
        if (this.secondNumber == 0)
         {
            this.firstNumber = 0;
            this.secondNumber = 0;
         }else {
            division = this.firstNumber / this.secondNumber;
        }
        return division;
    }
    }