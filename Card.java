package week06final;

public class Card {
	
		
	//value for higher cards
	int Jack = 11;
	int Queen = 12;
	int King = 13;
	int Ace = 14;
	//value for suits
	int Clubs = 0;
	int Spades = 1;
	int Hearts = 2;
	int Diamonds = 3;
	
	private int name;
	private int value;
	
	public Card(int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);
	}
	
private void setCardName(int newCardName) {
	if (newCardName >= 0 && newCardName <=3) {
		this.name = newCardName;
	} 
}
	
private void setCardValue(int newCardValue)	{
	if(newCardValue <2 || newCardValue > 14) {
	}
	this.value = newCardValue;
}
//get card name and value and return it
public int getCardName() {
	return name;
}

public int getValue() {
	return value;
}
//Evaluates card value and name and assigns it
public String toString() {
	String card = "";
	if(value ==2) {
		card += "2";
	} else if (value ==3) {
		card +="3";		
	}
	else if (value ==4) {
		card +="4";		
	}
	else if (value ==5) {
		card +="5";		
	}
	else if (value ==6) {
		card +="6";		
	}
	else if (value ==7) {
		card +="7";		
	}
	else if (value ==8) {
		card +="8";		
	}
	else if (value ==9) {
		card +="9";		
	}
	else if (value ==10) {
		card +="10";		
	}
	else if (value ==Jack) {
		card +="Jack";		
	}
	else if (value ==Queen) {
		card +="Queen";		
	}
	else if (value ==King) {
		card +="King";		
	}
	else if (value ==Ace) {
		card +="Ace";		
	} else {
		card += value;
	}
	card += " of ";
	if (name == Clubs) {
		card += "Clubs";
	} else if (name == Spades) {
		card += "Spades";
	} else if (name == Hearts) {
		card += "Hearts";
	} else if (name == Diamonds) {
		card += "Diamonds";
	}
	return card;
}
//Prints out information about card
public void describe() {
	System.out.println(this.toString() + "\n");
}

}
