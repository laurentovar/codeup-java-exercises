package practice.bicycle;

public class Riding {
    public static void main(String[] args) {
        //make a new bike

        Bike blueBike = new Bike(30, 2);
        Bike tricycle = new Bike(20, 4);

        //if the unicycle is slower than bike increase the speed
        if (tricycle.getSpeed() < blueBike.getSpeed()){
            System.out.println("Old speed: " + tricycle.getSpeed());
                //increase the speed of the unicycle
            tricycle.increaseSpeed();

            System.out.println("New speed: " + tricycle.getSpeed());
        }
    }
}