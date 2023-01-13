package codingTest;

import java.util.ArrayList;

public class HarshadNumber {

	public static void main(String[] args) {

		int x = 14;
		int sum = 0;
		boolean answer =false;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i<=x; i++) {
			if (x%i ==0) {
				arr.add(i);
			}
		}
		
		while(x !=0) {
			sum+= x%10;
			x = x/10;
		}
		
		for(int i =0; i<arr.size(); i++) {
			if (arr.get(i) == sum) {
				answer =true;
			}
		}
		System.out.println(answer);
		
		
	}

}
