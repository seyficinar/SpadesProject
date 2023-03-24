
public class Player {
	CardList list;
	int bid;
	int points;
	int NumOfHandsWon;
	
	
	
	//Constructor
	public Player() {
		
	}


	//Getters and Setters
	public CardList getList() {
		return list;
	}



	public void setList(CardList list) {
		this.list = list;
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

}
