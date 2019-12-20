package laurenWeek2;

public class Rhyme {
    public static boolean doesRhyme(String str1, String str2) {

        //build a string
        StringBuilder last1 = new StringBuilder(), last2 = new StringBuilder();

            //set the strings to lowercase
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            //======Last word STR1=======
            for (int i = str1.length()-1; i >=0;i--) {
                // returns the char of the string at that specific index(i)
                char word = str1.charAt(i);

                // isSpaceChar(char) is only for checking unicode space character (SPACE_SEPARATOR,LINE_SEPARATOR, PARAGRAPH_SEPARATOR)
                   //ex char ch='\t';
                if (!Character.isSpaceChar(word)){
                    last1.append(word);
                }
                    //appends the lastWord1 to the StringBuilder

                else break;
            }
            //======Last word STR2=======
            for (int i = str2.length()-1;i >=0;i--) {
                char word = str2.charAt(i);
                if (!Character.isSpaceChar(word)){
                    last2.append(word);
                }
                else break;
            }
            //====Does Word2 contains Word1?=======
            String vowels = getVowels(last1.toString());

            for (int i =0; i < vowels.length(); i++) {

                char words = vowels.charAt(i);

                if (!last2.toString().contains(Character.toString(words))){
                    return false;
                }
            }
            //====Does Word1 contains Word2?=======
            vowels = getVowels(last2.toString());
            for (int i=0; i<vowels.length(); i++) {

                char word = vowels.charAt(i);

                if (!last1.toString().contains(Character.toString(word))) {
                    return false;
                }
            }

            return true;
        }
            // returns a string containing found vowels
        public static String getVowels(String str) {
            String vowels = "aeiou";
            StringBuilder result = new StringBuilder();

            for (char words : str.toCharArray()) {
                if (vowels.contains(Character.toString(words))) {
                    result.append(words);
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));//true
        System.out.println(doesRhyme("Hello nice day", "We are having."));//false
        System.out.println(doesRhyme("Hickory, dickory, dock!", "The mouse ran up the clock"));//true

    }
}