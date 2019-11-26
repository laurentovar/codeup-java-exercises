public class Person {

    public String firstName;
    public String lastName;
//    public static boolean liveOnEarth = true;


    public String getName() {
        return ("Your name is " + this.firstName + this.lastName);
    }
    public  void  setName (String name){
        System.out.println(name + " is your best friend");

    }
    public String sayHello() {
        return ("Hello from "+ this.firstName + this.lastName + "!");
    }


}