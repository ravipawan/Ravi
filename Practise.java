package javapractise;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("dabc"," ","bcd"," ","defg","");
		//System.out.println(strList.stream().filter(n -> n=="").count());
		System.out.println(strList.stream().filter(n->n.startsWith("d")).count());
		
		//1.Find no of empty strings
		//System.out.println(strList.stream().filter(n -> n.length()==0).count());
		
		//2.Find no of string starts with "a"
		//System.out.println(strList.stream().filter(n->n.startsWith("a")).distinct().collect(Collectors.toList()));
		
		//3.Find the length of string greater than zero
		//System.out.println(strList.stream().filter(n -> n.length()>0).distinct().collect(Collectors.toList()));
		
		//System.out.println(strList.stream().filter(n.startswith(a)).count());
		//4.Squares of numbers
		//List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
		//System.out.println(numbers.stream().map(n ->n*n).distinct().collect(Collectors.toList()));
		
		//5.change case to upperstring
//		List<String> cities = Arrays.asList("London","Hongkong","Paris","Newyork");
//		List<String> newCities = new ArrayList<>();
//		newCities.addAll(cities.stream().map(n ->n.toUpperCase()).collect(Collectors.toList()));
//		System.out.println(newCities);

	}

}
