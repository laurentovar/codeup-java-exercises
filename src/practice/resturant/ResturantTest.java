package practice.resturant;

public class ResturantTest {
    public static void main(String[] args) {
        //instantiate a dish called dish

        RestaurantDish dish = new RestaurantDish("Cheesy bread sticks" ,10, true);

        System.out.println("Your dish is: " + dish.getNameOfDish()+"\n"  + "Dish cost $ " + dish.getCost() + " " + " \nI would recommend: " + dish.getWouldRecommend());
        //call them eating the dish
        dish.eat();
    }
}
