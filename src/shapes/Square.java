package shapes;

public class Square extends Rectangle {

    //this is one way1 (no need to make a var)
//    private double sides;

    //that accepts one argument (side)
        //calls the parent to set the length and width to value of side
    public Square (double side){
        //redefines length/width (way1)
        super(side, side);
//        this.sides = side; (way1)
    }

//    override the getArea/getPerimeter
    @Override
    public double getPerimeter(){
        //super.length makes it so that you dont need to define sides as a var.
            //the super.width relates to the parent class
        return 4 * super.width;

    }
    @Override
    public double getArea (){
//        double i = this.sides; (way1)
//        return Math.pow(i, 2); (way1)
        return Math.pow(super.length, 2);

    }

}
