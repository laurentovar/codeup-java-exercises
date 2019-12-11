package practice.resturant;

public class BurgerTools {
    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;


    //constructor

    public BurgerTools (String topping, int expiration, int temp){
        this.mostPopularTopping = topping;
        this.averageDaysBeforeExpiration = expiration;
        this.temperatureWhenCooked = temp;
    }

    public String getMostPopularTopping (){
        return mostPopularTopping;
    }
    public int getAverageDaysBeforeExp (){
        return averageDaysBeforeExpiration;
    }
    public int getTemp (){
        return temperatureWhenCooked;
    }

    public void setMostPopularTopping (String topping){
        this.mostPopularTopping = topping;
    }
    public void  setAverageDaysBeforeExpiration (int expiration){
        this.averageDaysBeforeExpiration = expiration;
    }
    public void setTemperatureWhenCooked (int temp) {
        this.temperatureWhenCooked = temp;
    }
        public static void grill (){
        System.out.println("Grilling burger");
    }

}
