package practice.resturant;

public class RestaurantDish {
    public String nameOfDish;
    public double cost;
    public boolean wouldRecommend;


    //constructor
    public RestaurantDish (String nameOfDish, double cost, boolean wouldRecommend){
        this.nameOfDish = nameOfDish;
        this.cost = cost;
        this.wouldRecommend = wouldRecommend;
    }

    public String getNameOfDish (){
        return nameOfDish;
    }
    public double getCost (){
        return cost;
    }
    public boolean getWouldRecommend (){
        return wouldRecommend;
    }

    public void setNameOfDish (String dish){
        this.nameOfDish = dish;
    }
    public void  setCost (double cost){
        this.cost = cost;
    }
    public void setWouldRecommend (boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }
    public  void eat (){
        System.out.println("Nom Nom Nom!");
    }
}
