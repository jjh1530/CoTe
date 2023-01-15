package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HalFame {

	public static void main(String[] args) {

		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		int[] answer =new int[score.length];
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i =0; i<score.length; i++) {
			if (temp.size() < k) {  
				temp.add(score[i]);
			}else {
				
			}
		}
		
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		
	}

}
