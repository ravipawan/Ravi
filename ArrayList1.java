package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
	List<String> array1 = new ArrayList<>(Arrays.asList("abc","def","ghi"));
	List<String> array2 = new ArrayList<String>();
	
	array1.forEach(System.out::println);
	
	Collections.reverse(array1);
	array1.forEach(System.out::println);
	
//	int i=1;
//	array1.forEach(t->{
//		array2.set(array1.size() - array1.indexOf(t)-1,t);
//	}
//	);

	
	
	

		
		

	

	}

}
