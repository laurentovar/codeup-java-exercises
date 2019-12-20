package laurenWeek2;
//repeats the shortest string until its equal to the length of the longer string

public class Shortest {
    public static String lengthen(String str1, String str2) {
        String shorter = shorterString(str1, str2);
        String longer = longerString(str1, str2);
        String result = "";

        for (int i= 0; i<(longer.length()/shorter.length()); i++) {
            result += shorter;
        }

        result += shorter.substring(0, longer.length() % result.length());

        return result;
    }

    public static String shorterString(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return str1;
        } else return str2;
    }

    public static String longerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else return str2;
    }

    public static void main(String[] args) {
        System.out.println(lengthen("hellllloooo", "hello"));
        System.out.println(lengthen("coffee", "starbucks"));
        System.out.println(lengthen("buck", "buckero"));
    }
}
