package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
   static Scanner reader = new Scanner(System.in);  // Reading from System.in

    public static void main(String[] args) {

        //give the user a list of options for viewing all the movies or viewing movies by category
        //use input class to get input from user (import your input class)
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        //put in the input
//        Input movieInput = new Input();
        int movieChoice = reader.nextInt(); // Scans the next token of the input as an int.


        if (movieChoice == 1){
            System.out.println("Here are all of the movies: ");

        }else if (movieChoice == 2){
            System.out.println("Here are all of the animated movies: ");
        } else if (movieChoice == 3 ) {
            System.out.println("Here are all of the drama movies: ");
        }else if (movieChoice == 4){
            System.out.println("Here are all of the horror movies: ");
        }else if(movieChoice == 5){
            System.out.println("Here are all of the scifi movies: ");
        }else {
            System.out.println("You exited");
        }


    }
}
