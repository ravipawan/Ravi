package javapractise;

import java.util.Scanner;

public class PrivateConstr {
	public PrivateConstr() {
		
	}
public PrivateConstr(int a) {
		pi=a;
	}
	
	int pi;
	
	public int temp(int b) {
		return pi*b;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pi=sc.nextInt();
		PrivateConstr abc = new PrivateConstr(pi);
		System.out.println(abc.pi);
		int num=sc.nextInt();
		System.out.println(abc.temp(num));
		System.out.println(abc.pi);
		int num1=sc.nextInt();
		System.out.println(abc.temp(num1));
	}

}



class CheckConstr{
	PrivateConstr abc = new PrivateConstr();

}
