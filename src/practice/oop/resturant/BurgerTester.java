package practice.oop.resturant;

public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools cheeseburger = new BurgerTools("cheese", 3, 450);
        BurgerTools greenChiliBurger = new BurgerTools("green chili", 2, 475);
        BurgerTools hamburger = new BurgerTools("tomato", 3, 445);
        BurgerTools mushroomSwissBurger = new BurgerTools("mushrooms", 4, 320);
        BurgerTools veggieBurger= new BurgerTools("corn", 1, 275);

        //print out all the averageDaysBeforeExpiring

        System.out.println("Cheeseburger info: \n"  + "Days before expired: " + cheeseburger.getAverageDaysBeforeExp() + "\nMost popular topping: " + cheeseburger.getMostPopularTopping() + "\nTemp when cooked: " + cheeseburger.getTemp());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Green Chili Burger info: \n"  + "Days before expired: " + greenChiliBurger.getAverageDaysBeforeExp() + "\nMost popular topping: " + greenChiliBurger.getMostPopularTopping() + "\nTemp when cooked: " + greenChiliBurger.getTemp());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hamburger info: \n"  + "Days before expired: " + hamburger.getAverageDaysBeforeExp() + "\nMost popular topping: " + hamburger.getMostPopularTopping() + "\nTemp when cooked: " + hamburger.getTemp());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Mushroom Swiss Burger info: \n"  + "Days before expired: " + mushroomSwissBurger.getAverageDaysBeforeExp() + "\nMost popular topping: " + mushroomSwissBurger.getMostPopularTopping() + "\nTemp when cooked: " + mushroomSwissBurger.getTemp());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Veggie Burger info: \n"  + "Days before expired: " + veggieBurger.getAverageDaysBeforeExp() + "\nMost popular topping: " + veggieBurger.getMostPopularTopping() + "\nTemp when cooked: " + veggieBurger.getTemp());

    }
}
