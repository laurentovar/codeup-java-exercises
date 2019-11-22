import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {


        int i = 100;
        //while loop
        //while loop that runs as long as i <= 15 and increment i by one
//        while (i <= 15){
////            System.out.println("i is " + i);
////            i++;
////        }


        //do while loop
        //count by 2's stating with 0 and ending at 100. Follow each num with a new line
//        int i = 0;
//        do {
//            i = i + 2;
//            System.out.println("i is: " + i);
//        }while (i <= 100);


        // count backwards by 5's starting from 100 to -10
        //int i = 0;
//        do {
//            i = i - 5;
//            System.out.println("i is now: " + i);
//        }while (i >= -10);


        //create a do-while loop that starts at 2 and displays the number squared on each line
            //while new number is less than 1,000,000
//            // long y = 2L;
//            do {
//
//              System.out.println(y);
                //y *= y;
//            }while (i < 1000000L);

        //do a for loop now
//        for (double y = 2; i <= 1000000; i++){
//            if (i <= 1000000){
//                Double xy = (Double) Math.sqrt(i);
//                System.out.println("i is: " + xy);
//            }
//        }
        //fizzbuzz prints the numbers from 1-100
            //multiples of three print fizz/ five = buzz/ both = fizzbuzz
//        for (int x = 1; x <= 100; x++) {
//            if (x % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (x % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (x % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(x);
//            }
//        }
        //display a table of powers prompt the user to enter an integer

        //ask user to enter a number
        //int and .nextInt will return it as a number (display table from 1 - value entered)
//        System.out.println();
//
        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        do
//        {
//            // Get input from the user
//            System.out.print("Enter an integer: ");
//            int integer = sc.nextInt();
//
//            // Create a header
//            String header = "Number  " + "Squared " + "Cubed   " + "\n"
//                    +   "======  " + "======= " + "=====   ";
//            System.out.println(header);
//
//            int square = 0;
//            int cube = 0;
//
//            String row = "";
//            for (int x = 1; x <= integer; x++)
//            {
//
//                square = x * x;
//                cube = x * x * x;
//
//                row = x + "       |" + square + "      |" + cube;
//                System.out.println(row);
//            }
//
//            // See if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//
//        }
//        while (!choice.equalsIgnoreCase("n"));

        //convert number grades into letter grades (From 0-100)
        System.out.println("Would you like to look at your letter grades?");
        String confirm = sc.next();

        while (confirm.equalsIgnoreCase("YES")) {
            System.out.println("What was your numeric grade?");
            int grade = sc.nextInt();

            char letterGrade;
            if (grade > 100)  {
                System.out.println("That's impossible. No one can give more than one hundred percent. By definition that is the most anyone can give.");
                continue;
            } else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Congratulations you got a %c.%n", letterGrade);

            System.out.println("Would you like to look at your letter grades?");
            confirm = sc.next();
        }


    }
}

