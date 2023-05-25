package week06final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//new Array List for deck
	List<Card> deck = new ArrayList<Card>(); 
	
	//shuffle the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public Card playCard() {
		Card playedCard = this.deck.get(0);
		this.deck.remove(0);
		return playedCard;
	}
	//loop through values to add whole deck
	public Deck() {
		for(int i =0;i<4;i++) {
		for (int j=2; j <=14; j++) {
				deck.add(new Card(i,j));
			}
		}
	}
	//getters and setters for cards
	public List<Card> getCards() {
		return deck;
	}
	public void setCards(List<Card> deck) {
		this.deck = deck;
	}
	//new draw
	public Card draw() {
		if(deck.isEmpty()) {
			System.out.println("Deck is Empty");
			return null;
		} else {
			Card drawTopCard = deck.get(0);
			deck.remove(0);
			return drawTopCard;
		}
	}
}
