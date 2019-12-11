package practice.bicycle;

import java.util.HashMap;

public class BikeHashMap {
    public static void main(String[] args) {
        //empty hashMap with the keys and values
            //Bike is from the Bike class
        HashMap<String, Bike> bikeHash = new HashMap<String, Bike>();

        //new instance of bikes
        Bike greenBike = new Bike(30, 2);

        //add bikes to the hashMap
        bikeHash.put("greenBike", greenBike);
        bikeHash.put("redBike", new Bike(50, 20));
        bikeHash.put("orangeBike", new Bike(12, 7));

        //call the method that will show all the speeds

        getSpeeds(bikeHash);
    }
    //method that takes in the hashMap
    public static void getSpeeds (HashMap<String, Bike> bikeHash){

        //print out the speed of specific bikes

        System.out.println("Red bikes speed: " + bikeHash.get("redBike").getSpeed());
    }
}
