import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        //addition
        System.out.println("Addition result of 3 + 5 =  " + addition(3, 5));

        //subtraction
//        System.out.println("Enter first num to subtract ");
//        int numsub1 = scanner.nextInt();

//        System.out.println("Enter second num to subtract ");
//        int numsub2 = scanner.nextInt();
//
//        System.out.println("Subtraction result is: ");
//        System.out.println((substraction(numsub1, numsub2)));
        System.out.println("Subtraction result of 8 - 4 =  " + substraction(8, 4));

//
//        //multiplication
        System.out.println("Multiplication result of 10 * 10 =  " + multiplication(10, 10));

//
//        //division
        System.out.println("Division result of 10 / 5 =  " + division(10, 5));
//
//        //modulas
        System.out.println("Modulas result of 8 % 4 =  " + modulus(8, 4));

        //integer
        scanner.nextLine();
        int inRange = getInteger(1, 10);
        if (inRange != -1) {
            System.out.println("You are in Range");
        }


        //Factorial
        calculateFactorial();



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

    public static float division(float num1, float num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int minValue, int maxValue) {
        System.out.println("Enter a number between 1 and 10");

        //Instantiate new scanner class
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        //store the input
        int num = scanner.nextInt();

        //if its inrange than just return the number

        if (num >= minValue && num <= maxValue) {
            return num;
        }
        //if its not then return -1. Just using -1 to signify it's not in range, but it could be any number thats not between 1 and 10
        else {
            System.out.println(" Invalid number. Please enter a number 1-10!!!!");
            getInteger(minValue, maxValue);
            return -1;

        }//for else
    }
    public static void calculateFactorial (){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter a number between 1 -10 to calculate a factorial");
        int num = scanner.nextInt();
        //check to see if valid number
        if (num >= 1 && num <= 10){
            //display what they entered
            System.out.println("You entered " + num + "!");

            //ask
            System.out.println("Do you want to calculate the factorial? Y/N");
            scanner.nextLine();
            String yesNo = scanner.nextLine();

            if (yesNo.equalsIgnoreCase("y")){
                //calculate
                int factorial = 1;
                for (int i= 2; i <= num; i++){
                    factorial = factorial * i;
                }
                System.out.println("It equals: " + factorial);
            } else if (yesNo.equalsIgnoreCase("n")){
                //exit
                System.out.println("I hit no");

            }else {
                System.out.println("Invalid. You entered a wrong character.");
                calculateFactorial();

            }
        }
        else{
            System.out.println("Your number is outside the range. Try again.");
            calculateFactorial();
        }



    }

}