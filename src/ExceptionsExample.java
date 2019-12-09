public class ExceptionsExample {
    public static void main(String[] args) {
        int num1, num2;
    try {
        num1 = 0;
        num2 = 62 /num1;
        System.out.println(num2);
        System.out.println("Im at the end of the try");
    }
    catch (ArithmeticException e){

        System.out.println("You should not divide a number by zero");
    }
    catch (Exception e){
        System.out.println("An Exception occurred");
    }
        System.out.println("Im out of the try-catch");

    }
}
