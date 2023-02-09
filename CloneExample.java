package javapractise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneExample {

	public static void main(String[] args) {
	
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> array2 = (List<Integer>) array1.clone();		
		   //array2 = (List<Integer>) array1.clone();
		System.out.println(array2);
		

	}

}
