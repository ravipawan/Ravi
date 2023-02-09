package javapractise;

public class ExcEx {
			//Exception Handling
	public static void main(String[] args) {
		try {
			int data = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		//remaining program
		System.out.println("Rest of the code......");
		}

	}


