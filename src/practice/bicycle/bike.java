package practice.bicycle;

public class bike {
    public static int wheels = 2; //static field
    private int speed; //instance field
    private int gear;

    //constructor

    public bike(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    //speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //gear
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    //increase the speed
    public void increaseSpeed(){
        this.speed++;
    }


}
