package javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		List<Integer> Integers = Arrays.asList(1,2,3,4,5,6,2,3,4,7,8);
		
		List<Integer> evenIntegers = 
				Integers.stream().filter(n -> n%2==0).distinct().collect(Collectors.toList());
		System.out.println(evenIntegers);
		List<String> Strings = 
				Arrays.asList("asd","ders","ghi","hijkde","Microcare","Micro");
		System.out.println(Strings.stream().filter( s -> s.length()>4).collect(Collectors.toList()));
		

	}
}
