package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallIntRemove {

	public static void main(String[] args) {

		int[] arr = {10};
		int min = 9999;
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i =0; i<arr.length; i++) {
			if (min > arr[i] ) {
				min= arr[i];
			}
		}
		for(int i =0; i<arr.length; i++) {
			if (arr[i] != min) {
				answer.add(arr[i]);
			}
			if (arr.length == 1) {
				answer.add(-1);
			}
		}
		for(int i =0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

}
