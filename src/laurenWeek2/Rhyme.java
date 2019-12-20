package laurenWeek2;

public class Rhyme {
    public static boolean doesRhyme(String str1, String str2) {
        StringBuilder last1 = new StringBuilder(), last2 = new StringBuilder();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // get last word from str1
        for (int i=str1.length()-1;i>=0;i--) {
            char c = str1.charAt(i);
            if (!Character.isSpaceChar(c)) last1.append(c);
            else break;
        }
        // get last word from str2
        for (int i=str2.length()-1;i>=0;i--) {
            char c = str2.charAt(i);
            if (!Character.isSpaceChar(c)) last2.append(c);
            else break;
        }
        // ensure word2 contains all words from word1
        String vowels = getVowels(last1.toString());
        for (int i=0; i<vowels.length(); i++) {
            char c = vowels.charAt(i);
            if (!last2.toString().contains(Character.toString(c))){
                return false;
            }
        }
        // ensure word1 contains all words from word2
        vowels = getVowels(last2.toString());
        for (int i=0; i<vowels.length(); i++) {
            char c = vowels.charAt(i);
            if (!last1.toString().contains(Character.toString(c))){
                return false;
            }
        }

        return true;
    }
    // returns a string containing found vowels
    public static String getVowels(String str) {
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.contains(Character.toString(c))) result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("Hello nice day", "We are having."));
        System.out.println(doesRhyme("Hickory, dickory, dock!", "The mouse ran up the clock"));

    }
}