package javapractise;
						//Instance Variables
public class Bike {
	String Color;
	String name;
	public void drive(){
		System.out.println("Driving Bike");
		
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.Color = "Red";
		b.name = "Pulsar";
		System.out.println(b.Color+" "+b.name);
		b.drive();
	}
	}


