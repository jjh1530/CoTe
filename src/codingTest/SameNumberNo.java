package codingTest;

import java.util.ArrayList;

public class SameNumberNo {

	public static void main(String[] args) {

		int[] arr = {1,1,3,3,0,1,1};
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i =0; i<arr.length-1; i++) { // i 1 °ª 1 
			for(int j =i+1; j<=i+1; j++) { // j 2 °ª 3
				if (arr[i] != arr[j]) {
					answer.add(arr[i]);
				}
			}
		}
		answer.add(arr[arr.length-1]);
		
	}

}
