package javapractise;
 
class Multiplier{
	static int multiply(int a,int b) {
		return a*b;
	
	}
	
	static int multiply(int a,int b,int c) {
		return a*b*c;
}
}

public class Testoverloading {

	public static void main(String[] args) {
		System.out.println(Multiplier.multiply(5, 4));
		System.out.println(Multiplier.multiply(4, 5, 6));
	}
}






