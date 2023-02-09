package javapractise;

class Multiplier1{
	static int multiply(int a,int b) {
		return a*b;
	
	}
	static double multiply(double a,double b) {
		return a*b;
}
}
	

public class Testoverloading2 {

	public static void main(String[] args) {
		System.out.println(Multiplier1.multiply(5, 4));
		System.out.println(Multiplier1.multiply(2.3, 8.4));

	

	}

}
