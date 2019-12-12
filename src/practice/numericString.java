package practice;

public class numericString {
    public static void main(String[] args) {

        String s1 = "400";
        int int1 = 200;

        System.out.println(s1);
        System.out.println(int1);

        String s2 =  Integer.toString(int1);
        int int2 = Integer.parseInt(s1);

        System.out.println(s2);
        System.out.println(int2);


    }
}
