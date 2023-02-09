package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		
		List<Integer> Integers = Arrays.asList(1,2,3,4,5,6,2,3,4,7);
		List<Integer> dupInt = new ArrayList<>();
		for(int numbers : Integers) {
			if(! dupInt.contains(numbers)) {
				dupInt.add(numbers);
			}
		}
		System.out.println(dupInt);
	//	System.out.println(Integers.stream().distinct().collect(Collectors.toList()));
	//	System.out.println(Integers.stream().map(t->t*t*t).filter(n->n>=27).collect(Collectors.toList()));
	}

}
