import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Do you like pink Floyd?");

        String userInput = scanner.next();

        String answer = "Yes";
     if(userInput.equalsIgnoreCase(answer)){
         System.out.println("We don't need no education!");
     }else {
         System.out.println("We don't need no thought control!");
     }

        scanner.nextLine();
     System.out.println("Do you like pink cupcakes?");
        String inputCupcake = scanner.next();

        String answerCupcake = "No";

        if(inputCupcake.equalsIgnoreCase(answerCupcake)){
            System.out.println("Well you will, Check this out, cupcakes inside of cake!");

        }else {
            System.out.println("In, windows, the the main drive is usually better than cupcakes");

        }

        scanner.nextLine();
        System.out.println("Do you like backslashes");
        String inputBackslash = scanner.next();

        String answerBackslash = "No";
        if (inputBackslash.equalsIgnoreCase(answerBackslash)){
            System.out.println("I can do backslashes \\, double backslashes \\ and the amazing triple backslash\\\\");

        }





    }
}
