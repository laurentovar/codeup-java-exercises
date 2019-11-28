package shapes;
import java.util.Scanner;
//circumference = 2 x pi x radius
//area = pi x (radius ^ 2)

class math
{
    double math;
    math(double radius)
    {
        math = (Math.PI * radius * radius);

    }

}
class math2
{
    double math2;
    math2(double radius)
    {
        math2 = (Math.PI * 2 * radius);

    }

}
class Circle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double rad = scanner.nextDouble();

        math Circlearea = new math(rad);
        System.out.println("Area of Circle is: " + Circlearea.math);

        System.out.println("Enter another the radius:");
        double rad2 = scanner.nextDouble();
        math2 CircleCircumference = new math2(rad2);
        System.out.println("Circumference  of Circle is: " + CircleCircumference.math2);






    }
}
