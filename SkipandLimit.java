package javapractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipandLimit {

	public static void main(String[] args) {
		List<Integer> Integers = Arrays.asList(1,2,3,4,5,6,2,3,4,7);
		System.out.println(Integers.subList(5, 7));
		System.out.println(Integers.stream().skip(2).limit(9).distinct().collect(Collectors.toList()));

	}

}
