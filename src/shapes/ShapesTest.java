package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //======Inheritance==========//
        //new variable of type rectangle named box 1 and assign it a new instance of rectange
            //width 4, length 5
//
//        Rectangle box1 = new Rectangle(5, 4);
//        //verify that the getPerimeter returns 18
//        System.out.println(box1.getPerimeter());
//
//        //verify that the getArea returns 20
//        System.out.println(box1.getArea());
//
//
//        //new variable of type rectangle named box 2 and assign it a new instance of square
//            //side 5
//        Rectangle box2 = new Square(5);
//        //verify that the getPerimeter returns 20
//        System.out.println(box2.getPerimeter());
//
//        //verify that the getPerimeter returns 25
//        System.out.println(box2.getArea());
//
//
//        //check to see if the override is working
//        Square box3 = new Square(6);
//        System.out.println(box3.getArea());
//        System.out.println(box3.getPerimeter());
//
//

        //====== interfaces/abstract=====//
        Measurable myShape;
            //instances for square/rec and assign to myShape to display area/perim

        myShape = new Square(5);

        System.out.println(myShape.getArea());//returns 25
        System.out.println(myShape.getPerimeter());//returns 20

        myShape = new Rectangle(5,4);
        System.out.println(myShape.getArea());//return 20
        System.out.println(myShape.getPerimeter());//return 18


    }
}
