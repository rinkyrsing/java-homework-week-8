package carpetCalculator;

public class Floor{
    // Instance Variable
    double width, length;

    //1st Constructor with parameter
    Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            this.width = 0;

        }
        if (length < 0) {
            this.length = 0;
        }
    }

    // Instance Method
    public double getArea() {
        // Calculating area ==> w * l

        double area = 0;
        area = this.width * this.length;
        return area;
    }

}
