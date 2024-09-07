import java.util.*;

public class Deck {
    List<Card> cards = new ArrayList<Card>();


    public Deck (){
        this.cards = cards;

        String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};

        for (String suit: suits){
            int value = 2;
            for (String name: names){
                cards.add(new Card(name, suit, value));
                value ++;
            }
        }
        
    
    }
    public List<Card> getCards(){
        return cards;
    }
    public void describe(){

        System.out.println("Contains the following cards:");
        for(Card card: this.cards){
            card.describe();
        }
    }

    public void shuffle() {
		Collections.shuffle(this.cards);
	}

    public Card draw(){
        Card card = this.cards.remove(0);
        return card;


    }
}
