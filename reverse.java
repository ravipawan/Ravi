package javapractise;

public class reverse {

	public static void main(String[] args) {
		String name="ravi";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			
		}System.out.println(reverse);
		

	}

}
