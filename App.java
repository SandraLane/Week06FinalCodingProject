package week06final;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate a new deck, shuffle, and instantiate two new players
		Deck deck = new Deck();
		deck.shuffle();
		Player playerOne = new Player("Shirley");
		Player playerTwo = new Player("Dick");
		
		

	// splits deck after shuffle between two players	
		for(int i=1; i<=26; i++) {
			playerOne.hand.add(deck.draw());
			playerTwo.hand.add(deck.draw());
		}
			playerOne.describe();
			playerTwo.describe();
	
	//using a for loop, iterate over the cards 26 times and call the flip method for each player
	for (int i =0; i<26; i++) {
		Card playerOneCard = playerOne.flip();
		Card playerTwoCard = playerTwo.flip();
		playerOne.describe();
		playerTwo.describe();
		
		//compare the value of each card returned by player's flip method and increment the score
		
		if (playerOneCard.getValue()> playerTwoCard.getValue()) {
			playerOne.scoreIncrements();
			System.out.println("Shirley is the winner of this turn.  Her updated score is " + playerOne.score + ".");
		} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
			playerTwo.scoreIncrements();
			System.out.println("Dick is the winner of this turn.  His updated score is " + playerTwo.score + ".");
		} else {
			System.out.println();
		}
	}
		//Compare final score and print winner
		
		if(playerOne.score > playerTwo.score) {
			System.out.println("Shirley wins with a score of " + playerOne.score + " to " + playerTwo.score + "!");
		} else  if (playerTwo.score> playerOne.score) {
			System.out.println("Dick wins with a score of " + playerTwo.score + " to " + playerOne.score + "!");
		} else {
			System.out.println("It's a tie!!");
		}
	}	
	
}
