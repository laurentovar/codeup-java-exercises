package practice;

//using a hashmap containing the answers  (months = strings and total)
//randomly quiz the user on how many days are in a given month (correct or not)
//ask the user if the want to continue every 3 questions
//total days for each month for 2019


import java.util.HashMap;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //set up hashmap
        HashMap <String,Integer> monthMap = new HashMap<>();

        monthMap.put("january", 31);
        monthMap.put("february", 29);
        monthMap.put("march", 31);
        monthMap.put("april", 30);
        monthMap.put("may", 31);
        monthMap.put("june", 30);
        monthMap.put("july", 31);
        monthMap.put("august", 31);
        monthMap.put("september", 30);
        monthMap.put("october", 31);
        monthMap.put("november", 30);
        monthMap.put("december", 31);

     //randomize the months using numbers

     int randomMonth = (int)(Math.random() * 12)+ 1;

     if (randomMonth ==1){
         System.out.println("How many days are in January?");
     }
     else if (randomMonth == 2){
         System.out.println("How many days are in February?");
     }
     else if (randomMonth == 3){
         System.out.println("How many days are in March?");
     }
     else if (randomMonth == 4){
         System.out.println("How many days are in April?");
     }
     else if (randomMonth == 5){
         System.out.println("How many days are in May?");
     }
     else if (randomMonth == 6){
         System.out.println("How many days are in June?");
     }
     else if (randomMonth == 7){
         System.out.println("How many days are in July?");
     }
     else if (randomMonth == 8){
         System.out.println("How many days are in August?");
     }
     else if (randomMonth == 9){
         System.out.println("How many days are in September?");
     }
     else if (randomMonth == 10){
         System.out.println("How many days are in October?");
     }
     else if (randomMonth == 11){
         System.out.println("How many days are in November?");
     }
     else if (randomMonth == 12){
         System.out.println("How many days are in December?");
     }


     int daysInput = scanner.nextInt();

//     if (randomMonth == 1 && daysInput )



    }//for main



}
