package shapes;

 public class Rectangle extends Quadrilateral implements Measurable {

     //=====Inheritance=======//
     //change back to public and get rid of the extends and implements

//    protected double length;
//    protected double width;
//
//    public Rectangle(double lengthInp, double widthInp){
//        this.length = lengthInp;
//        this.width = widthInp;
//    }
//    public double getPerimeter(){
//        return 2 * (this.length + this.width);
//
//    }
//    public double getArea (){
//        return this.length * this.width;
//    }

     //=====Interfaces/Abstract=======//

     public Rectangle(double lengthInp, double widthInp){
         super(lengthInp, widthInp);
     }
     @Override
     public void setLength() {

     }

     @Override
     public void setWidth() {

     }

     @Override
     public double getPerimeter() {
         return 2 * (this.length + this.width);
     }

     @Override
     public double getArea() {
         return this.length * this.width;
     }
}
