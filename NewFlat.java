package javapractise;
					//Flat map i.e Multiple arrays into single array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NewFlat {

	public static void main(String[] args) {
//		List<List<String>> nestedarr = Arrays.asList(
//				Arrays.asList("jeff","bezoff"),
//				Arrays.asList("Ravi","shankar"),
//				Arrays.asList("abdul","nabi"));
		
//		
//		System.out.println(nestedarr.stream().flatMap(Collection::stream).collect(Collectors.toList()));
//		
//		List<List<Integer>> number = Arrays.asList(Arrays.asList(1,2,3,4),
//				        Arrays.asList(11,12,13,14),
//						Arrays.asList(21,22,23,24),
//						Arrays.asList(31,32,33,34));
//		
//		List<Integer> num = number.stream().flatMap(Collection::stream).collect(Collectors.toList());
//		System.out.println(num);
		List<List<String>> namesNested = Arrays.asList(
										Arrays.asList("Ravi","Sekhar"),
										Arrays.asList("Raja","Sekhar"),
										Arrays.asList("Jabde","Babu"));
		List<String> nest = new ArrayList<>();
		
//		for(List<String> names : namesNested) {
//			for(String name : names) {
//				nest.add(name);
//			}
//		}
		
		for(int i=0;i<=namesNested.size()-1;i++) {
			
				nest.addAll(namesNested.get(i));
		}
		
		System.out.println(nest);
		
//		List<String> namesFlatStream = 
//				namesNested.stream().flatMap(Collection::stream)
//				.collect(Collectors.toList()));
//		
		
		
		
		
	}
	
}
