package programmers;

import java.util.Arrays;

public class NumGame {

	public static void main(String[] args) {

		int[] A = {5,1,3,7,4,8};
		int[] B = {2,2,6,8,9,3};
		int answer =0;
		Arrays.sort(A); // 1 3 4 5 7 8
		Arrays.sort(B); // 2 2 3 6 8 9
		
		int Indexb = B.length-1; // 4-1
		for (int i =A.length-1; i >=0; i--) { // 뒤에서 부터  7 5 3 1
			if (B[Indexb] > A[i]) { // 만약 8 >7
				answer ++;
				Indexb--;
			}
		}
		System.out.println(answer);
	}

}
