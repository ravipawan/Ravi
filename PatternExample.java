package javapractise;

import java.util.Scanner;

public class PatternExample {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		 Scanner sc = new Scanner(System.in);
		 
		 int num = sc.nextInt();
		 
		 for (int i = 1; i <=num; i++) {
			for (int j = num-i; j>1 ; j--) {
				System.out.print(" "+j + " ");

			}
			for(int k=1;k<=i;k++) {
			 System.out.print(" "+k+" ");
		}
		 
		System.out.println();
		 }
	}
	
}

