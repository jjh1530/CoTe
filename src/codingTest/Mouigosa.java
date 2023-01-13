package codingTest;

import java.util.ArrayList;

public class Mouigosa {

	public static void main(String[] args) {

		int[] answers= {1,2,3,4,5,1,2,3,4,5,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		int onen =0;
		int twon =0;
		int threen =0;
		for(int i=0; i<answers.length; i++) {
			if (one[i%one.length]== answers[i]) {  
				onen ++;
			}
			if (two[i%two.length]== answers[i]) {
				twon ++;
			}
			if (three[i%three.length]== answers[i]) {
				threen ++;
			}
		}
		
		int[] value= {onen,twon,threen};
		ArrayList<Integer> answer = new ArrayList<>();
		int max = -9999;
		
		for(int i=0; i<value.length; i++) {
			if (max < value[i]) {
				max = value[i];
			}
		}
		
		for(int i =0; i<value.length; i++) {
			if (max ==value[i]) {
				answer.add(i+1);
			}
		}
		
	}

}
