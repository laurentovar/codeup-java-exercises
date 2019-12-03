package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //new variable of type rectangle named box 1 and assign it a new instance of rectange
            //width 4, length 5

        Rectangle box1 = new Rectangle(5, 4);
        //verify that the getPerimeter returns 18
        System.out.println(box1.getPerimeter());

        //verify that the getArea returns 20
        System.out.println(box1.getArea());
    }
}
