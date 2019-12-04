package madlids;

public class VersionOne extends FillThisIn{
    //pass in array of strings
    public VersionOne(String[] words){
        this.name  = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];



    }
    public String greeting(){
        return "Hello There";
    }
    public String goToLocation(){
        return "He went to the" + location;
    }
    public String pickUpRandomObject(){
        return "He grabbed the " + randomObject;
    }
}
