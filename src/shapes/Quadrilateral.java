package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //constructor that accepts 2 numbers for length and width
    public Quadrilateral(double lengthInp, double widthInp){
        this.length = lengthInp;
        this.width = widthInp;
    }

    //method to get length/ width
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    //abstract methods for setting the length and width
    public abstract void setLength();
    public abstract void setWidth();


}
