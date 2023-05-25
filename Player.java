package week06final;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Created a hand, score, and name, set the score to 0
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
// uses describe method and prints out player's name and hand
	
	public void describe() {
		System.out.println(name + " has the following cards: \n");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("*------*--------*");
	}
	//flip removes and returns top card of hand
	
	public Card flip() {
		Card drawTopCard = hand.get(0);
		hand.remove(0);
		return drawTopCard;
	}
	//draw method newCard called on deck
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	public void scoreIncrements() {
		this.score++;
	}
}
