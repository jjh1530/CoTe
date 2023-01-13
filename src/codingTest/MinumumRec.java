package codingTest;

import java.util.Arrays;

public class MinumumRec {

	public static void main(String[] args) {

		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		int weight = -9999;
		int height = -9999;
		int answer = 0;
		for(int i =0; i<sizes.length; i++) {
			Arrays.sort(sizes[i]);
			for(int j =0; j<sizes[i].length; j++) {
				if (sizes[i][0] > weight) {
					weight = sizes[i][0];
				}
				if (sizes[i][1] > height) {
					height = sizes[i][1];
				}
			}
		}
		answer = weight * height;
		System.out.println(weight + "@" +height);
		
	}

}
