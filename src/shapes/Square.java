package shapes;

public class Square extends Rectangle {

    private double sides;

    //that accepts one argument (side)
        //calls the parent to set the length and width to value of side
    public Square (double side){
        super(side, side);
        this.sides = side;
    }
    //override the getArea/getPerimeter
//    perimeter = 4 x side
//    area = side ^ 2
//    @Override
//    public double getPerimeter(){
//        return 4 * sides;
//    }
//    @Override
//    public double getArea (){
//        double i = sides;
//        return Math.pow(i, 2);
//    }

}
