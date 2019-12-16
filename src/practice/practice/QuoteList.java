package practice.practice;

import java.util.ArrayList;

public class QuoteList {
    public static void main(String[] args) {
        ArrayList <String> quotes = new ArrayList<>();

        //add the random quotes
        quotes.add("Random1");
        quotes.add("Random2");
        quotes.add("Random3");
        quotes.add("Random4");
        quotes.add("Random5");
        quotes.add("Random6");
        quotes.add("Random7");
        quotes.add("Random8");

        //generate random index using Math.random method

        int randomIndex = (int)(Math.random() * quotes.size());
        System.out.println(quotes.get(randomIndex));
    }
}
