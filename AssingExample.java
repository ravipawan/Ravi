package javapractise;
									//Find Largest Number
public class AssingExample {

	public static void main(String[] args) {
		
		double [] arr = { 23.4,-34.5,50.0,33.5,55.5,43.7,5.7,-66.5};
		
		double num = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>num) {
				
				num = arr[i];
				
			}
		}
		
		System.out.println(num);

	}

}
