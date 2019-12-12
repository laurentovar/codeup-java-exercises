package practice.overloading;

public class CollegeStudent extends Human {
    public void eat(){
        System.out.println("College Student eats noodles");
    }

    public static void main(String[] args) {
        CollegeStudent kim = new CollegeStudent();
        Human billy = new Human();

        kim.eat();
        billy.eat();
    }

}
