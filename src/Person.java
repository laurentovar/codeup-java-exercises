//public class Person {
////
////    public String firstName;
////    public String lastName;
//////    public static boolean liveOnEarth = true;
////
////
////    public String getName() {
////        return ("Your name is " + this.firstName + this.lastName);
////    }
////    public  void  setName (String name){
////        System.out.println(name + " is your best friend");
////
////    }
////    public String sayHello() {
////        return ("Hello from "+ this.firstName + this.lastName + "!");
////    }
////
////
////}

public class Person {

    // The class has a private name property that is a string
    private String name;

    //The class should have a constructor that accepts a String value and sets the person's name to the passed string.
    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hi, my name is: " + this.name);
    }

    // Create a main method on the class that creates a new Person object and tests the above methods.
    public static void main(String[] args) {
        Person elsa = new Person("Elsa");
        // Rewrite name to add last name, this allows us to test getName() and setName()
        elsa.setName(elsa.getName() +  " Agnarr");
        // Test new name
        elsa.sayHello();

        // 2. Understanding references
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1 == person2);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}