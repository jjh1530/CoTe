package codingTest;

import java.util.ArrayList;
import java.util.Collections;

public class TwoNumSum {

	public static void main(String[] args) {

		int[] numbers = {2,1,3,4,1};
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i =0; i<numbers.length; i++) {
			for(int j =i+1; j<numbers.length; j++)
				if (!arr.contains(numbers[i]+numbers[j])) {
					arr.add(numbers[i]+numbers[j]);
				}
				
		}
		Collections.sort(arr);
		for(int i =0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
