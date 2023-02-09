package javapractise;

class Aeroplane{
	//Method Overriding 
	void fly() {
		System.out.println("Aeroplane is flying");
	}
}

public class FighterJets {
	void fly() {
		System.out.println("Fighterjets are flying at speed");
	}

	public static void main(String[] args) {
		FighterJets flob = new FighterJets();
		flob.fly();
		
		

	}

}
