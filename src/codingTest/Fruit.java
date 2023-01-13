package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fruit {

	public static void main(String[] args) {

		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		Arrays.sort(score);
		int answer = 0;
		String sScore = "";
		for(int i =0; i<score.length; i++) {
			sScore+= score[i];
		}
		
		/*StringBuilder sb = new StringBuilder(sScore);
		String reverseScore = sb.reverse().toString();
		for(int i =m-1; i<reverseScore.length(); i= i+m) {
			answer += Integer.parseInt(String.valueOf(reverseScore.charAt(i)));
		}
		System.out.println(answer*m);
		for(int i =score.length-1-m+1; i>=0; i=i-m) {
			answer += Integer.parseInt(String.valueOf(sScore.charAt(i)));
		}*/
		
		
		for(int i =score.length-1-m+1; i>=0; i=i-m) {
			System.out.println(score[i]);
			answer += score[i] *m;
		}
		System.out.println(answer);
	}
	// 4 4 2 1
	//12 12 6 3

}
