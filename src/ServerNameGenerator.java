public class ServerNameGenerator {
    //create two arrays whose elements are string (adjectives, nouns 10)
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(noun() + "-" + adjective());

    }

    public static String getRandomString(String[] listOfStrings) {
        //goes through the array length to get a random object
        int index = (int) (Math.random() * (listOfStrings.length));
        return listOfStrings[index];
    }

    public static String noun() {
        String[] nouns = {"Puppy", "Popcorn", "Ghost", "Shop", "Farmhouse", "Forest", "Power", "Money", "Art", "Paper"};
        //get the random noun from the nouns array
        return getRandomString(nouns);
    }

    public static String adjective() {
        String[] adjectives = {"Dreary", "Scary", "Funny", "Happy", "Brainy", "Wild", "Nifty", "Charming", "Peaceful", "Flaky"};
        //get the random noun from the nouns array
        return getRandomString(adjectives);
    }

}

