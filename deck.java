package com.Brendon;

import java.util.LinkedList;
import java.util.Random;

public class deck {

    public static void main(String[] args) {

        System.out.println(suit());
        System.out.println(faceCards());



    }

    public static String faceCards() {

        LinkedList face = new LinkedList();
        face.add("Jack");
        face.add("Queen");
        face.add("King");
        face.add("Ace");

        Random random = new Random();

        Object selection = face.get(random.nextInt(face.size()));

        return selection.toString();


    }

    public static String suit() {

        LinkedList suits = new LinkedList();
        suits.add("Diamond");
        suits.add("Hearts");
        suits.add("Clubs");
        suits.add("Spades");

        Random random = new Random();

        Object selection = suits.get(random.nextInt(suits.size()));

        return selection.toString();

    }
}
