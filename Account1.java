package javapractise;

public class Account1 {

	public static void main(String[] args) {
		Account a1 = new Account("11G31A039","Abdul Nabirasool",25000);
		Account a2 = new Account("11gf4357","Ravi Shankar",0);
		System.out.println(a1.debit(5000));
		System.out.println(a1.debit(25000));
		System.out.println(a1.transferTo(a2, 15000));
		System.out.println(a1.toString());
		System.out.println(a2.toString());

	}

}
