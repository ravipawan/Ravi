package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
public static void main(String[] args) {
	
	List<Integer> num =new ArrayList<>(Arrays.asList(1,2,3,5,6,7));
	
	for(int i = 0; i<=num.size()-1;i++) {
		if(num.get(i)!=i+1) {
			System.out.println("Missing Number is " + (i+1));
			break;
			}	
	}
}
}

	
		
	


	

