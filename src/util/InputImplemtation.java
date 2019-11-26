package util;
import java.util.Scanner;

public class InputImplemtation {
    public static void main(String[] args) {
        Input myInput = new Input();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a random sentence");
        String randomSentence = userInput.nextLine();


        userInput.nextLine();
        System.out.println("Enter yes or no");
        String yesNoanswer = userInput.nextLine();


        Boolean yesNo = yesNoanswer.equalsIgnoreCase("Y") || yesNoanswer.equalsIgnoreCase("yes") ? true : false;
        System.out.println(yesNo);







    }
}
