package javapractise;

class Animal1{
	void eat() {
		System.out.println("Animals are eating");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dogs are barking");
	
	}
}


class Babydog extends Dog1{
	void weep() {
		System.out.println("Weeping");
	}


}

public class TestInheritance2 {

	public static void main(String[] args) {
		
		Babydog df = new Babydog ();
		df.eat();
		df.bark();
		df.weep();

	}

}
