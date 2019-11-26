public class PersonImplemtation {
    public static void main(String[] args) {
        Person scobby = new Person();
        scobby.firstName = "Scobby";
        scobby.lastName = "Doo";

        System.out.println(scobby.getName());
//        System.out.println(scobby.setName("Fred Jones"));
        System.out.println(scobby.sayHello());


//        System.out.println(scobby.setName("Shaggy"));

        //==2.1==
        Person person1 = new Person();
        person1.firstName = "Velma";
        person1.lastName = "Dinkley";
        System.out.println("Person 1 is: " + person1.firstName + " " + person1.lastName);

        Person person2 = new Person();
        person2.firstName = "Fred";
        person2.lastName = "Jones";
        System.out.println("Person 2 is: " + person2.firstName +  " " + person2.lastName);

        System.out.println("Its going to print out now:");
        System.out.println("does person 1 name .equals person 2? " + person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        //==2.2==
        Person personOne = new Person();
        personOne.firstName = "Shaggy";
        personOne.lastName = " Rodgers";
        Person personTwo = personOne;
        System.out.println(personOne == personTwo);

        //==2.3==
        Person personO = new Person();
        personO.firstName = "Daphne";
        personO.lastName =" Blake";
        Person personT = personO;
        System.out.println(personO.getName());
        System.out.println(personT.getName());

        person2.setName("Fred");
        System.out.println(personO.getName());
        System.out.println(personT.getName());
    }
}
