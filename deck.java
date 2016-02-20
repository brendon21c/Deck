package com.Brendon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class deck {

    public static void main(String[] args) {

        // this section of code is me just playing with my final shuffled deck.

        Stack deckTest = Deck();

        while (deckTest.size() > 0) {

            String card1 = deckTest.pop().toString();
            String card2 = deckTest.pop().toString();
            String card3 = deckTest.pop().toString();
            String card4 = deckTest.pop().toString();
            String card5 = deckTest.pop().toString();

            System.out.println(card1);
            System.out.println(card2);
            System.out.println(card3);
            System.out.println(card4);
            System.out.println(card5);
            System.out.println();
            System.out.println();

            if (deckTest.size() < 0) {
                break;
            }

        }

        Stack deck2 = Deck();

        System.out.println(deck2);


        //String separated[] = card.split(" ");
        //String sepNum = separated[0];
        //System.out.println(sepNum);


    }

    public static Stack Deck() {

        Random random = new Random();

        LinkedList deck = new LinkedList();
        LinkedList suit = new LinkedList();
        LinkedList deckRandom = new LinkedList();
        Stack deckFinal = new Stack(); // final shuffled deck


        for (int x = 0; x < 1 ; x++) { // Makes a list of suits.
            suit.add("Clubs");
            suit.add("Diamonds");
            suit.add("Spades");
            suit.add("Hearts");

        }

        for (int x = 0 ; x < 4 ; x++) { // Makes a list of 52 "cards" (no suits)
            deck.add("Ace");
            deck.add("King");
            deck.add("Queen");
            deck.add("Jack");
            deck.add(10);
            deck.add(9);
            deck.add(8);
            deck.add(7);
            deck.add(6);
            deck.add(5);
            deck.add(4);
            deck.add(3);
            deck.add(2);

        }

        /*
        This next block converts the deck list into a string, then concatenates that with the suits,
        then adds this to the final deck, so that you have a full deck of 52 cards with suits.
         */

        for (int x = 0 ; x < 13 ; x++) {

            String test = deck.get(x).toString();

            for (int y = 0 ; y < suit.size() ; y++) {

                deckRandom.add(test + " of " + suit.get(y));

            }
        }

        for (int x = 0 ; x < 52 ; x++) {

            String cardAdd = deckRandom.get(random.nextInt(deckRandom.size())).toString();
            deckFinal.push(cardAdd);
            deckRandom.remove(cardAdd);

        }

        return deckFinal;


    }


}
