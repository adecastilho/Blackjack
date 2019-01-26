import java.util.Random;

public class Deck{

	private Card[] deck;
	
	private static final int DECK_SIZE = 52;
	private static final int SUIT_SIZE = 13;
	private static final int NUM_SUITS = 4;
	private static final String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
	
	public Deck(){
		
		deck = new Card[DECK_SIZE];
		initDeck();
	}
	
	public void initDeck(){
		
		for (int i = 0; i<NUM_SUITS; i++){
			
			for (int j = 0; j<SUIT_SIZE; j++){
		
				deck[(i*SUIT_SIZE)+j] = new Card(suits[i], j+1);
			}		
		}
		
	}
	
	public void shuffle(){
		
		Card[] temp = new Card[DECK_SIZE];
		Random rand = new Random();
		int n = -1;
		
		for (int i = 0; i<DECK_SIZE; i++){
			
			do{
				n = rand.nextInt(DECK_SIZE);				
			} while(temp[n] != null);
		
			temp[n] = deck[i];
		}
		
		deck = temp;
		
	}
	
	
	public String toString(){
		
		String s = "";
		
		for (int i = 0; i< DECK_SIZE; i++){
			
			s += deck[i].toString() + "\n"; 
			
		}
		
		return s;
	}

}