package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisionIntArr {

	public static void main(String[] args) {

		int[] arr = {2,36,1,3};
		int divisor = 1;
		ArrayList<Integer> answer = new ArrayList<>();
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % divisor ==0) {
				arr2[i] = arr[i];
			}
		}
		
		Arrays.sort(arr2);
		for(int i=0; i<arr2.length; i++) {
			if (arr2[i] !=0) {
				 answer.add(arr2[i]);
			}
		}
		if (answer.isEmpty()) {
			answer.add(-1);
		}
		
	}

}
