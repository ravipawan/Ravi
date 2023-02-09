package javapractise;

public interface Interfac {
	
		void display();

		 void login(String username,String password);

		default void print() {
			login(null, null);
		}



	}


