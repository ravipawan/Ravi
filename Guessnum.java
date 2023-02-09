package javapractise;

public class Guessnum {
	static int age;
	static String name;
	String college;
	
	Guessnum(){
		System.out.println("Default Constructor!!!");
		college="Joseph";
	}
	
	static{
		System.out.println("STATIC BLOCK");
		age=10;
		 name="Microcare";
	}
	
	static void display() {
		
		
		nondisplay();
		
	}
 static void nondisplay() {
	 
	 System.out.println(age);
 }
 
 void run() {
	 System.out.println(college);
 }
}
