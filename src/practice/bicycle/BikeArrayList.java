package practice.bicycle;

import java.util.ArrayList;

public class BikeArrayList {
    public static void main(String[] args) {
        //empty ArrayList (Import form bike)
        ArrayList<Bike> bikesArr = new ArrayList<>();

        //instance of bikes (new one)
        Bike purpleBike = new Bike(10, 5);


        //add bikes to ArrayList (adding purpleBike and the new ones)

        bikesArr.add(purpleBike);
        bikesArr.add(new Bike(20, 10));
        bikesArr.add(new Bike(50, 1));

        //call the method that takes in the arrayList
        getSpeed(bikesArr);
    }
    public static void getSpeed (ArrayList<Bike> bikesArr){
        //print out all the speeds and gears for the new bikes

        for (Bike bike: bikesArr){
            System.out.println(bike.getSpeed());
        }
    }


}
