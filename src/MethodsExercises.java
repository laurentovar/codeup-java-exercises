import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        //addition
        System.out.println("Enter first num to add ");
        int numadd1 = scanner.nextInt();

        System.out.println("Enter second num to add ");
        int numadd2 = scanner.nextInt();

        System.out.println("Addition result is: ");
        System.out.println((addition(numadd1, numadd2)));

        //subtraction
        scanner.nextLine();
        System.out.println("Enter first num to subtract ");
        int numsub1 = scanner.nextInt();

        System.out.println("Enter second num to subtract ");
        int numsub2 = scanner.nextInt();

        System.out.println("Subtraction result is: ");
        System.out.println((substraction(numsub1, numsub2)));

        //multiplication
        scanner.nextLine();
        System.out.println("Enter first num to multiply ");
        int numMult1 = scanner.nextInt();

        System.out.println("Enter second num to multiply ");
        int numMult2 = scanner.nextInt();

        System.out.println("Multiplication result is: ");
        System.out.println((multiplication(numMult1, numMult2)));

        //division
        scanner.nextLine();
        System.out.println("Enter first num to divide ");
        int numDiv1 = scanner.nextInt();

        System.out.println("Enter second num to divide ");
        int numDiv2 = scanner.nextInt();


        System.out.println("Division result is: ");
        System.out.println((division(numDiv1, numDiv2)));

        //modulas
        scanner.nextLine();
        System.out.println("Enter first num to find modulus  ");
        int numMod1 = scanner.nextInt();

        System.out.println("Enter second num to find modulus ");
        int numMod2 = scanner.nextInt();


        System.out.println("Modulus result is: ");
        System.out.println((modulus(numMod1, numMod2)));


    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
    public static int getInteger(int min, int max) {

    }

}