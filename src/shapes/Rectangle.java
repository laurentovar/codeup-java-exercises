package shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double lengthInp, double widthInp){
        this.length = lengthInp;
        this.width = widthInp;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    public double getArea (){
        return length * width;
    }
}
