package cylinder;

public class Circle {

    double radius;

    // Constructor
    Circle(double radius) {
    this.radius = radius;
        if (radius < 0) {
            this.radius = radius = 0;
        }
    }
public double getRadius(){

       return this.radius;
    }
    public double getArea(){
       double area =0;

    area = this.radius * this.radius * Math.PI;
            return area;
    }

}
