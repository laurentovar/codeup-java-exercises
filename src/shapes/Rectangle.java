package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double lengthInp, double widthInp){
        this.length = lengthInp;
        this.width = widthInp;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.width);

    }
    public double getArea (){
        return this.length * this.width;
    }
}
