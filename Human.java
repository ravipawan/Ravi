package javapractise;
						//constructors
public class Human { 
	int age;
	String name;
	Human(int a,String n){
		age = a;
		name = n;
		
	}
void display() {
	System.out.println(age+" "+ name);
}
	public static void main(String[] args) {
		Human h1 = new Human(20,"mala");
		Human h2 = new Human(22,"babu");
		h1.display();
		h2.display();

	}

}
