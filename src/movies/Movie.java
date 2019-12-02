package movies;

public class Movie {
    //private fields for name and category and a constructor that sets both of these
        //change them (getters and setter)
    private String name;
    private String category;

    //make the constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    // returns the movies name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // returns the category name
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }

}
