package javapractise;

public class string {

	public static void main(String[] args) {
		String name="ravi";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			
			reverse= reverse + name.charAt(i);
			
		}
		System.out.println(reverse);
		

	}
//		for(int i=0;i<=name.length()-1;i++) {
//			System.out.println(name.charAt(i));
//
//		}
	}

	


