
package javapractise;
			//Interface class

interface drinking {
	void drink();
}
public class A1 implements drinking{
	public void drink() {
		System.out.println("Drinking water"); 	
	}



public static void main(String[] args) {
	A1 obj = new A1();
	obj.drink();
 }
}

