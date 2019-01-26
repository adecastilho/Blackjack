public class Card{

	private String suit;
	private int value;
	private String valueName;
	
	
	/*******************************
		CONSTRUCTORS
	*******************************/
		
	/*	
		params: none
		purpose: creates an empty card
	*/
	public Card(){
		suit = "";
		value = 0;
		valueName = "";
	}
		
	/*	
		params: (String) suit, (int) value
		purpose: sets the suit and value for the card
	*/
	public Card(String suit, int value){
		this.suit = suit;
		this.value = value;
		this.valueName = valToString(value);
	}

	/*	
		params: (String) suit, (String) valueName
		purpose: sets the suit and value for the card
	*/
	public Card(String suit, String valueName){
		this.suit = suit;
		this.valueName = valueName;
		this.value = valToInt(valueName);
	}	
	
	/*******************************
		Setter & Getter methods
	*******************************/

	public void setSuit(String suit){
		this.suit = suit;
	}
	
	public void setValue(int value){
		this.value = value;
		this.valueName = valToString(value);
	}
	
	public void setValue(String valueName){
		this.valueName = valueName;
		this.value = valToInt(valueName);
	}
	
	public String getSuit(){
		return suit;
	}
	
	public int getValue(){
		return value;
	}
	
	public String getValueName(){
		return valueName;
	}

	
	/*******************************
		toString method
	*******************************/

	public String toString(){		
		return valueName + " of " + suit + " value: " + value;
	}

	
	/*******************************
		equals method
	*******************************/

	public boolean equals(Card otherCard){
		if (suit.equals(otherCard.suit) && value == otherCard.value){
			return true;
		} else{
			return false;
		}
	}
	
	/*
		params: (int) value
		purpose: convert value to to a String
		return: (String)
	*/
	public String valToString(int val){
		
		String s = "";
		
		switch(val){
			case 1: 
				s = "Ace";
				break;
			case 11:
				s = "Jack";
				break;
			case 12:
				s = "Queen";
				break;
			case 13: 
				s = "King";
				break;
			default:
				s = Integer.toString(val);
				break;
		}
		
		return s;
		
	}
	/*
		params: (String) valName
		purpose: converts valName String to an int 
		return: (int)
		assumption: valName belongs to set [Ace, 1, 2, ..., 9, 10, Jack, Queen, King] 
					*** case sensitive
	*/
	public int valToInt(String valName){
		
		int i = 0;
		
		switch(valName){
			case "Ace":
				i = 1;
				break;
			case "King":
				i = 13;
				break;
			case "Queen":
				i = 12;
				break;
			case "Jack":
				i = 11;
				break;
			default:
				i = Integer.parseInt(valName);
				break;
		}
		
		return i;
	}
		
}