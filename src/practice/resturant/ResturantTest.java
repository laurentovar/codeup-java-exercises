package practice.resturant;

public class ResturantTest {
    public static void main(String[] args) {
        //instantiate a dish called dish

        RestaurantDish dish = new RestaurantDish("dish" ,10, false);

        System.out.println("Your dish is: " + dish.getNameOfDish() + " " + "the cost $ " + dish.getCost() + " " + " \nI would recommend: " + dish.getWouldRecommend());

    }
}
