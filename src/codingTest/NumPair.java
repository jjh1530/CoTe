package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class NumPair {

	public static void main(String[] args) {
		//겹치는 수 3 2 1
		String X = "100";
		String Y ="203045";
		int[] a = new int[10];
		int[] b = new int[10];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i< X.length(); i++) {
			int index = X.charAt(i) -'0';
			a[index]++;
			
		}
		for(int i =0; i<Y.length(); i++) {
			int index = Y.charAt(i) -'0';
			b[index]++;
		}
		
		for(int i =0; i< a.length; i++) {
			if (a[i] != 0 && b[i]!=0) {
				arr.add(i); // 번호
				if (a[i] > b[i]) {
					arr.add(b[i]);
				}else {
					arr.add(a[i]);
				}
			}
		}
		String answer = "";
		for(int i =0; i<arr.size(); i+=2) {
			for(int j =0; j<arr.get(i+1); j++) {
				answer +=arr.get(i);
			}
		}
		answer = new StringBuilder(answer).reverse().toString();
		System.out.println(answer);
		if (answer.equals("")) {
			answer = "-1";
		}
	}

}
