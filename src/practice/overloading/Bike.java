package practice.overloading;

public class Bike {
    //A field is a variable inside a class
    public static int wheels = 2; 		//<---- static fields
    private int speed; 				//<---- instance field
    private int gear;


    public void increaseSpeed() {      //<----  A method to increase speed
        this.speed++;
    }

    public void increaseSpeed(int multiplier) {   //<--- Overloaded method for IncreaseSpeed
        this.speed *= multiplier;
    }

}

