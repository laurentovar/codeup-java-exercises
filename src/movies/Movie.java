package movies;

public class Movie {
    //private fields for name and category and a constructor that sets both of these
        //change them (getters and setter)
    private String title;
    private String category;

    //make the constructor
    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }
    // returns the movies name
    public String getTitle(){
        return this.title;
    }

    // changes the name property to the passed value
    public void setTitle(String title){
        this.title = title;
    }
    // returns the category name
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }


}
