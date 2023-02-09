package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopsEx {

	public static void main(String[] args) {
		List<List<Integer>> numbers = new ArrayList<>();
		
		List<Integer> num =  Arrays.asList(1,2,3,4,5,6);
		List<Integer> num1 = Arrays.asList(7,8,9,10,11,12);
		List<Integer> num2 = Arrays.asList(13,14,15,16,17);
		numbers.add(num);
		numbers.add(num1);
		numbers.add(num2);
		
//		for(List<Integer> number : numbers) {
//			for(int nums:number) {
//				System.out.println(nums);
//			}
//		}

		Iterator<List<Integer>> iterate = numbers.iterator();
		
		while(iterate.hasNext()) {
		List<Integer> nums = iterate.next();
		Iterator<Integer> number = nums.iterator();
		
		while(number.hasNext()) {
			System.out.println(number.next());
		}
		}
		
	}

}
