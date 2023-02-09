package javapractise;

import java.util.Arrays;
import java.util.List;
			//NormaList into Arrayist
public class NormalArray {

	public static void main(String[] args) {
		String []text = {"rst","hut","nyt","kill","pin"};
		List<String> arraytext = Arrays.asList(text);
		String[] text2 = arraytext.stream().toArray(String[]::new);
		System.out.println(text2[0]);
		System.out.println(text2[1]);
		System.out.println(text2[2]);
		System.out.println(text2[3]);
		System.out.println(text2[4]);
	}

}
