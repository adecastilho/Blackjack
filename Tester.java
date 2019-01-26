public class Tester{

public static void main(String[] args){

	Card kOfHearts = new Card("Hearts", "King");
	Card qOfHearts = new Card("Hearts", 12);
	Card jOfHearts = new Card();
	jOfHearts.setSuit("Hearts");
	jOfHearts.setValue(11);
	Card tenOfHearts = new Card();
	tenOfHearts.setSuit("Hearts");
	tenOfHearts.setValue("10");
	
	Card aOfClubs = new Card("Clubs", "Ace");
	Card fiveOfDiamonds = new Card("Diamonds", 5);
	Card kOfH = new Card("Hearts", 13);
	Card empty = new Card();
	
	System.out.println(kOfHearts);
	System.out.println(qOfHearts);
	System.out.println(jOfHearts);
	System.out.println(tenOfHearts);
	System.out.println(kOfH);
	System.out.println(aOfClubs);
	System.out.println(fiveOfDiamonds);
	System.out.println(empty);
	
	
	System.out.println("King of hearts get info:");
	String suitOfMyCard = kOfHearts.getSuit();
	int valOfCard = kOfHearts.getValue();
	String valName = kOfHearts.getValueName();
	
	System.out.println(suitOfMyCard);
	System.out.println(valOfCard);
	System.out.println(valName);
	
	
	System.out.println("kOfHearts equals aOfClubs: " + kOfHearts.equals(aOfClubs));
	System.out.println("kOfHearts equals kOfH: " + kOfHearts.equals(kOfH));
	
	Deck myDeck = new Deck();
	
	System.out.println(myDeck);
	
	myDeck.shuffle();
	
	System.out.println(myDeck);

}

}