import java.util.*;

public class Deck {
    List<Card> cards = new ArrayList<Card>();


    public Deck (){
        this.cards = cards;

        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "jack", "queen", "king", "ace"};

        for (String suit: suits){
            for (String name: names){
                int value = 2;
                cards.add(new Card(name, suit, value));
                value ++;
            }
        }


        
    }
}
