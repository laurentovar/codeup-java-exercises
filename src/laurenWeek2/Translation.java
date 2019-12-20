package laurenWeek2;

import java.util.Scanner;

public class Translation {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word you would like to translate to Pig Latin?: ");
    String input = scanner.next();
    System.out.println("You entered: " + input);
    System.out.println("Translation: " + translate(input));
}


    public static String translate (String word) {

        word = word.substring(1);

        String transition = word.toLowerCase();

        //array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        //This will return the first char of the string
        char first = transition.charAt(0);


        for (int i = 0; i < vowels.length; i++) {
            if (first == vowels[i]) {
                return word + "way";
            }
        }
        word += first + "ay";

        return word;
    }
}
