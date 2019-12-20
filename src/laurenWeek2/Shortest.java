package laurenWeek2;

//repeats the shortest string until its equal to the length of the longer string
public class Shortest {
    public static String lengthenStr(String str1, String str2) {

        //Make shortStr = to the shorterString Method
        String shortStr = shorterString(str1, str2);
        //Make longStr = to the longerString Method
        String longStr = longerString(str1, str2);

        String strResult = "";

        for (int i= 0; i < (longStr.length() / shortStr.length()); i++) {

            //puts the shortStr into the empty result
            strResult += shortStr;
        }

        //start at beginning of shortStr and go to the longStr length
        strResult += shortStr.substring(0, longStr.length() % strResult.length());

        System.out.println("Short str length: " + shortStr.length() + " Long str length: " + longStr.length());
        return strResult;
    }

    //method for shortStr
    public static String shorterString(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return str1;
        }
        else {
            return str2;
        }
    }

    //method for longStr
    public static String longerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        }
        else {
            return str2;
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthenStr("christmas", "holiday"));//should return holidayho
        System.out.println(lengthenStr("coffee", "starbucks"));//should return coffeecof
        System.out.println(lengthenStr("buck", "buckero"));//should return buckbuc
    }
}
