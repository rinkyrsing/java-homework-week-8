package carpetCalculator;

public class Carpet {

    double cost;

    //Constructor with one parameter
    Carpet(double cost){

        this.cost = cost;

        if(cost < 0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }
    public double getCost(){

        return this.cost;
    }

}
