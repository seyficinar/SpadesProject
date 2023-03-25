
public class CardList {

	Card head;
	Card tail;

	public CardList() {
		head = null;
		tail = null;

	}

	public Card getHead() {
		return head;
	}

	public void setHead(Card head) {
		this.head = head;
	}

	public Card getTail() {
		return tail;
	}

	public void setTail(Card tail) {
		this.tail = tail;
	}
	
	//Insert first
	public void insertAtBeginning(Card newCard) {
	   
	}

	// Insertion
	public void insert(int index, Card newCard) {
		

	}
	
	//remove the card in index
	public Card remove(int index) {

	   

	    return null; 
	}
	
	//Returns the number of elements
		public int numOfElements() {
			
		}


		
	//return the card in index i
	public Card getCardI(int i) {
		
	}

	

	// Remove card according to card
	public void remove(Card c) {
		if (head == c) {
			head = head.next;
		}

		else {
			Card current = head.next;
			Card previous = head;
			while (current != c) {
				current = current.next;
				previous = previous.next;
			}
			previous.next = current.next;

		}

	}

	// add the element to the end of the list
	
	public void add(Card card) {
	    
	}

	public void output() {
		

	}
	
	//shuffles the deck
	public void shuffle() {
	   
	}
	
	//changes the value of two cards
	private void swapCards(Card card1, Card card2) {
	    
	}

}
