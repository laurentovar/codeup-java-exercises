package practice.practice;

import java.util.ArrayList;

public class QuoteList {
    public static void main(String[] args) {
        ArrayList <String> quotes = new ArrayList<>();

        //add the random quotes
        quotes.add("Doggo ipsum heckin good boys and girls aqua doggo borkf woofer, what a nice floof wow very biscit.");
        quotes.add("Sleep in the bathroom sink howl uncontrollably for no reason for cats are fats i like to pets them they like to meow back");
        quotes.add("Boudin tongue picanha ham. Spare ribs boudin ham hock kevin jowl chuck cupim, shankle biltong capicola venison sausage.");
        quotes.add("Donut cupcake danish caramels icing jujubes danish chupa chups croissant.");
        quotes.add("Liquorice brownie cupcake croissant carrot cake sweet roll apple pie.");
        quotes.add("Sweet gummies icing sweet roll jelly-o. Candy canes marshmallow lollipop");
        quotes.add("Chocolate bar powder carrot cake gummi bears oat cake chocolate cookie candy fruitcake. ");
        quotes.add(" Muffin chocolate bar macaroon oat cake. Halvah carrot cake gummi bears icing.");

        //generate random index using Math.random method

        int randomIndex = (int)(Math.random() * quotes.size());
        System.out.println(quotes.get(randomIndex));
    }
}
