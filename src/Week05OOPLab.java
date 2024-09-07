
import java.util.*;

public class Week05OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card firstCard = new Card("Ace", "Spades", 14);
		
		// Call the describe method on the newly instantiated card.
		firstCard.describe();
		
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck	
	    Deck firstDeck = new Deck();
	    
	    // Call the describe method on the newly instantiated deck.
	    firstDeck.describe();
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		firstDeck.shuffle();
		System.out.println("After shuffle:");
		
		
		
		// Call the describe method on the newly shuffled deck.
		firstDeck.describe();

		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here
		
		Card drawCard = firstDeck.draw();
		drawCard.describe();
	
			
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		int numOfPlayers = 3;
		Map<String, List<Card>> board = new HashMap<>();
		board = (startGame(numOfPlayers));

		for(int i = 1; i <= numOfPlayers; i++){
			String player = "Player " + i;
			System.out.println(player);
			for (Card card: board.get(player))
				card.describe();
			}

		}
		 
	
	// Method 5:
	static public Map<String, List<Card>> startGame(int players){
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		Map<String, List<Card>> hands = new HashMap<>();

		if (players * 6 <= gameDeck.getCards().size()){ //check that there are enough cards
			// Put named players and empty list in map
			for (int p = 1; p <= players; p++){
				String playerNum = "Player " + p;
				List<Card> playerHand = new ArrayList<>();
				hands.put(playerNum, playerHand);
			}
			//Deal 6 cards to each player
			for (int i = 1; i <= 6; i++ ){  // loop for cards
				for(int p = 1; p <= players; p ++){  // loop for players
					String player = "Player " + p;
					List<Card> hand = hands.get(player); // get players current hand
					hand.add(gameDeck.draw()); // add card to hand
					hands.put(player, hand); // puts players hand back in hands
				}
			}
		}
		else {
			System.out.println("Too many players for 6 cards each!");
		}

		return hands;
			

	}
		

}


