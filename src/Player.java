
public class Player {
	CardList hand;
	int bid;
	int points;
	int numOfHandsWon;
	
	
	
	


	public Player(int bid, int points, int numOfHandsWon) {
		
		this.hand = new CardList();
		this.bid = bid;
		this.points = points;
		this.numOfHandsWon = numOfHandsWon;
	}
	
	public CardList getHand() {
		return hand;
	}

	public void setHand(CardList hand) {
		this.hand = hand;
	}

	public Player() {
		this.hand = new CardList();
		
	}


	


	//Getters and Setters
	
	public int getNumOfHandsWon() {
		return numOfHandsWon;
	}


	public void setNumOfHandsWon(int numOfHandsWon) {
		this.numOfHandsWon = numOfHandsWon;
	}
	
	public CardList getList() {
		return hand;
	}



	public void setList(CardList list) {
		this.hand = list;
	}



	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}
	
	//Plays the best card for Bots according to middle and bot's hand
	public static Card playTheBest(CardList pCards, CardList middleCards) {
		
		
		return null;
	}
	
	//add cards to players hand
	public void add(Card card) {
	   
	}
	
	//add cards to players hand in first index
	public void insertAtBeginning(Card newCard) {
	   
	}

}
