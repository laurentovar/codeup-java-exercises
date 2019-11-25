import java.util.Scanner;

public class adventureGame {
    //sets the scanner global
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
   //player properties
    static String userName;

    public static void main(String[] args) {

    }
    public static void startGame (){
        System.out.println("Welcome to title!! Ready to start the game? Y/N?");
       String input = scanner.nextLine();
       if (input.equalsIgnoreCase("Y")){
           //enter your name
           System.out.println("Hi hero what is your name?");
            userName = scanner.nextLine();

            //welcome user
           System.out.println("Welcome " + userName + "!" + "Lets go on an adventure!!");



       }else {
           System.out.println("Exited the game!");
       }



    }

}
