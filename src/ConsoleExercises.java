import javax.swing.text.Style;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        //.2f moves it 2 decimal places (you need the format)
        System.out.format("The value of pi is approximatley %.2f %n", pi);


       //sets up the scanner
        Scanner scanner = new Scanner(System.in);

       //ask user to enter a number
        System.out.print("Enter a number: ");
            //int and .nextInt will return it as a number
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        //reset the scanner
        scanner.nextLine();

        //prompt the user to enter 3 words
            String string = scanner.nextLine();

            System.out.print("Enter a word: ");
            String text = scanner.nextLine();

            System.out.print("Give me a second word: ");
            String secondText= scanner.nextLine();

            System.out.print("Enter a third word: ");
            String thirdText= scanner.nextLine();

//        System.out.print("All the text you entered was: "+ text + " " + secondText + " " + thirdText);
        System.out.printf("All the words you entered: %s %s %s %n", text, secondText, thirdText);
        //reset the scanner
        scanner.nextLine();

            System.out.println("Please enter a sentence: ");
            //if you do nextLine then you get the whole thing until they press enter
            String input = scanner.nextLine();

        System.out.println(input);//logs what they put
        System.out.printf("Your sentence was: %s %n", input);

        //calculate the perimeter and area of Codeups classroom

        //rest the scanner
        scanner.nextLine();

        System.out.print("Please enter a length: ");

//        String lengthStr = scanner.nextLine();
//        int length1= Integer.parseInt(lengthStr);
//        System.out.println(length1);

        //essentially doing what the above 3 lines are doing, but in 2 lines.
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println(length);

        System.out.print("Please enter a width: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println(width);

        //find the area
        int area = length * width;
        System.out.printf("This is the area: %d %n", area);

        //find the perimeter
        int perimeter = (length *2) + (width *2);
        System.out.printf("This is the perimeter: %d", perimeter);

    //changing the ints to a double or float would allow us to do decimals
        // (then %d would be %f or %.2f to limit the decimal places)


     //if you use .useDelimiter it always looks key to stop (sets up where you look until)
        //if scanner.useDelimiter("-"); and entered bob is the-tanner. You wont see tanner

    }
}
