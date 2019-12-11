package practice.interfaces;

public class mainInterface {
    public static void main(String[] args) {
    //Create an instance of DemoClass
        DemoClass myObj = new DemoClass();

    //Calling myMethod, defined in DemoClass but originates from FirstInterface
        myObj.myMethod();

    //Calling myOtherMethod, defined in DemoClass but originates from SecondInterface
        myObj.myOtherMethod();
    }

}


interface FirstInterface {
    public void myMethod(); // interface method is abstract(Notice No Body)
}

interface SecondInterface {
    public void myOtherMethod(); // interface method abstract (Notice No Body)
}

class DemoClass implements FirstInterface, SecondInterface {    //Notice this implements both interfaces

    public void myMethod(){
        System.out.println("Some text..");
}
    public void myOtherMethod() { //<-- defining abstract methods
        System.out.println("Some other text...");
    }

}

