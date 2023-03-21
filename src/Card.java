
public class Card {
	
	int value;
	String type;
	String face;
	public Card(int value, String type, String face) {
		super();
		this.value = value;
		this.type = type;
		this.face = face;
		
		if(face.equals("Jack")) {
			this.value = 11;
		}
		else if(face.equals("Queen")) {
			this.value = 12;
		}
		if(face.equals("King")) {
			this.value = 13;
		}
		if(face.equals("Ace")) {
			this.value = 14;
		}
	}
	
	
	
	
	
	

}
