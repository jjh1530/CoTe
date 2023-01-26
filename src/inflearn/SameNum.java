package inflearn;

import java.util.ArrayList;
import java.util.Arrays;

public class SameNum {

	public static void main(String[] args) {
		int[] arr = {1,3,9,5,2};
		int[] arr2 = {3,2,5,7,8};
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr);  // 1 2 3 5 9
		Arrays.sort(arr2); // 2 3 5 7 8
		int p1 = 0;
		int p2 = 0;
		while(p1<arr.length && p2 <arr2.length) {
			if (arr[p1] == arr2[p2]) {
				answer.add(arr[p1]);
				p1++;
				p2++;
			}else if(arr[p1] > arr2[p2]) {
				p2++;
			}else {
				p1++;
			}
		}
		for(int x : answer) {
			System.out.println(x);
		}
		
	}

}
