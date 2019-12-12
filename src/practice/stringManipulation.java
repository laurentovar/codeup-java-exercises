package practice;

import java.util.Arrays;

public class stringManipulation {
    public static void main(String[] args) {
         String str1 = "rock";
         String str2 = "star";

        //concat

        String str3 = str1 + str2;
        String str4 = str1.concat(str2);


        //get the length of a string
        int length = str3.length();

        //find the index that a certain number is at
        int position = str1.indexOf("c");//gives you first occurrence (lastindexof gives you the last)


        //find the letter. input the index

        char letter = str1.charAt(3);

        System.out.println(letter);

        //if it equals that do something with it
        if (position != 1){
            System.out.println("Found");
        }
        else {
            System.out.println("Didnt find");
        }

        //compare to (returns 0 if matches)
        str1.compareTo(str2);


        //contains
        String str5 = "rockstar";

        System.out.println(str1.contains(str2));//false
        System.out.println(str5.contains(str2));//true

        //ends with same thing
        System.out.println(str1.endsWith("k"));//true

        //replacing apart of the string
            //change rock to bigStar
        //change the string (Modify)
        str5 = str5.replace("rock", "shinny");
//        String str5Replace = str5.replace("rock", "big");

        System.out.println(str5);

        //trim
        String str6= "  happy place  ";
        System.out.println(str6);
        str6 = str6.trim();
        System.out.println(str6);

        //substring (splice basically)
        String str7 = "sunnyside";
                //only want side
        String str8= str7.substring(5);//inclusive
        System.out.println(str8);

        String str9 = str7.substring(0,5);//exclusive
        System.out.println(str9);

    //split
        String str10 = "account, item, qty, price";

        System.out.println(str10.length());//25
        //create an array for each string
        String [] array = str10.split(",");
        String [] array2 = str10.split("," , 2);

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);//4

        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);//2


    }

}
