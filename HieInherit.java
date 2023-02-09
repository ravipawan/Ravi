package javapractise;

class Bird{
	void fly() {
		System.out.println("Birds are flying");
	}
}
class Parrot extends Bird{
	void screech() {
		System.out.println("Parrots are screeching");
		
	}
}
class Peacock extends Bird{
	void scream() {
		System.out.println("Peacocks are screaming"); 
	}
}

public class HieInherit {

	public static void main(String[] args) {
	Peacock c = new Peacock();
	c.fly();
	c.scream();
	

	}

}
