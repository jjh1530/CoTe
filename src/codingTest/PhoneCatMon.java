package codingTest;

import java.util.ArrayList;

public class PhoneCatMon {

	public static void main(String[] args) {

		int[] nums = {3,1,2,3};
		int answer = 0;
		int max = nums.length/2; // 최대 2마리
		ArrayList<String> arr =new ArrayList<>();
		
		for(int i =0; i<nums.length; i++) {
			if (!arr.contains(String.valueOf(nums[i]))) {
				arr.add(String.valueOf(nums[i])); // 3 1 2
			}
		}
		if (arr.size() == max) {
			answer = max;
		}else if(arr.size()< max) {// max개수가 arr 개수보다 많음
			answer = arr.size();
		}else if (arr.size() >max) { // arr의 개수가 max보다 많음
			answer = max;
		}
		System.out.println(answer);
		
	}

}
