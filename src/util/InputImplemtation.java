package util;

public class InputImplemtation  {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What's your name");
        System.out.println(input.getString());
        System.out.println(input.getInt(1, 10));

        System.out.println(input.getDouble(1, 10));

        System.out.println(input.yesNo());
    }
}

