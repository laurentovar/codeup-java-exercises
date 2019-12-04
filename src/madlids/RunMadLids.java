package madlids;

public class RunMadLids {
    public static void main(String[] args) {
        String[] words = {"Fer", "Pink", "Shirt", "The shirt Store"};

        VersionOne versionOne = new VersionOne(words);

        System.out.println("Once upon a time...");
        System.out.println("There was a person named...");
        System.out.println(versionOne.name);
        System.out.println(versionOne.goToLocation());
        System.out.println("He saw the manager and said...");
        System.out.println(versionOne.greeting());
        System.out.println("\"I would like to buy that \"");
        System.out.println(versionOne.color + " " + versionOne.randomObject);
        System.out.println(versionOne.pickUpRandomObject());
        System.out.println("Then he left!");
    }
}
