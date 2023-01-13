package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Knum {

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 60, 3, 7, 4};
		int[][] commands = {{2,5,4},{4,6,3},{1,7,5},{1,4,1}};
		String[] sarr = new String[commands.length]; //4
		for(int i =0; i<commands.length; i++) { // 0 1 2 3
			int[] arr = new int[commands[i][2]+1]; // 2
			String s = "";
			for(int k =commands[i][0]-1; k<commands[i][1]; k++) { // 2 ~5 
				if (k == commands[i][1]-1) {
					s += array[k];
				}else {
					s += array[k] + ",";
				}
				
				sarr[i] = s;
				
			}
		}
		int[] answer = new int[commands.length];
		for(int i =0; i<sarr.length; i++) {
			System.out.println(sarr[i]);
			String[] sarr2 = sarr[i].split(",");
			
			Arrays.sort(sarr2);
			String s ="";
			int index = commands[i][2]-1;
			for(int j =0; j<sarr2.length; j++) {
				if (j == index) {
					answer[i] = Integer.parseInt(String.valueOf(sarr2[j]));
				}
				
			}
		}

		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
