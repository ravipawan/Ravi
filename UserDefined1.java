package javapractise;

import java.util.Scanner;

public class UserDefined1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int age = 0;
		String num = null;
		
		do {
			System.out.println("Enter the age");
			age = sc.nextInt();
			try {
				if(age<18) {
					throw new UserDefined("Not Eligible for voting");
				}else {
					System.out.println("Eligible for voting");
				}
			} catch (UserDefined e) {
				System.out.println(e.getMessage());
			}
			catch(NullPointerException ne){
				System.out.println("Null pointer Exception");
			}
			finally {
				System.out.println("Success the program");
			}
		} while (age<100);
		
	}

}
