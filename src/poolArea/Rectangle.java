package poolArea;

  public class Rectangle {
    double width;
    double length;

  public Rectangle(double width, double length){
    this.width = width;
    this.length = length;

       if(width < 0){
           this.width = 0;
       }
       if(length < 0){
           this.length = 0;
       }
  }
   public double getWidth(){

      return width;
  }
      public double getLength(){

          return length;
      }
      public double getArea(){
       double area = 0;

       area = this.length * this.width;
       return area;
      }
  }
