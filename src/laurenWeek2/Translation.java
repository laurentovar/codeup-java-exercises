package laurenWeek2;

public class Translation {
    public static String pigLatin(String str) {
        char ch = str.charAt(str.length()-1);
        str = str.toLowerCase().substring(0, str.length()-1);
        String parts[] = str.split(" ");
        String res = "";
        for(int i=0;i<parts.length;i++) {
            if("AEIOUaeiou".indexOf(parts[i].charAt(0)) != -1) {
                res = res + parts[i] + "way" +" ";
            }
            else {
                res = res + parts[i].substring(1) + parts[i].substring(0, 1) + "ay"+" ";
            }
        }
        res = res.substring(0, 1).toUpperCase() + res.substring(1);
        return res.trim()+ch;

    }

    public static void main(String[] args) {

        System.out.println(pigLatin("Cats are great pets"));
        System.out.println(pigLatin("Tom got a small piece of pie"));
        System.out.println(pigLatin("He told us a very exciting tale"));
    }
}
