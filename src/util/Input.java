
package util;

        import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Type: yes/y");
        String input = getString();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){

        int number = getInt();

        if(number < min){
            return getInt(min, max);
        } else if (number > max) {
            return getInt(min, max);
        }

        return number;
    }

    public int getInt(){
        //make sure the value returned is actually an int
        System.out.println("Give me a number");
        return Integer.parseInt(getString());

//        Integer.valueOf(String s);

    }

    public double getDouble(double min, double max){
        //make sure the value returned is actually an int
        double number = getDouble();

        if(number < min){
            return getDouble(min, max);
        } else if (number > max) {
            return getDouble(min, max);
        }

        return number;
//        Double.valueOf(String s);

    }

    public double getDouble(){
        System.out.println("Give me a decimal");
        return Double.parseDouble(getString());
    }

}