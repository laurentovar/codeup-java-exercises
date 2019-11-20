public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello World!!!!!!");
        //int var named myFavoriteNumber
        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);
        //string var named myString
        String myString = "Hello String";
        System.out.println(myString);
        //declare an long var named myNumber
        float mynumber = (float) 3.14;
        System.out.println(mynumber);
//        int x = 5;
//        System.out.println(x++); gives 5
//        System.out.println(x); gives 6

//        int x = 5;
            //++adding to the number first
//        System.out.println(++x); gives 6
//        System.out.println(x); gives 6

        //this wont work
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //this doesnt work either
//        int three = (int) "three";

        //rewrite:
//        int x = 4;
//        x = x + 5;
        int x = 4;
        x += 5;
        System.out.println(x);
        

    byte number = 127;
    System.out.println(number);

    }


}
//long number use L after number
//float use f after number
//char needs to be single quotes (EX.$, m)
//boolean no triple equals (ex. boolean inRoom = (classroom == "M")