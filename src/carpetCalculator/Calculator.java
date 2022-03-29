package carpetCalculator;

public class Calculator {

    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Instance Variable
    public double getTotalCost() {

        return floor.getArea() * carpet.getCost();
    }
}
