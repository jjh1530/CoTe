package programmers;

import java.util.Arrays;

public class NumGame {

	public static void main(String[] args) {

		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		int answer =0;
		Arrays.sort(A); // 1 3 5 7  
		Arrays.sort(B); // 2 2 6 8
		
		int Indexb = B.length-1;  // 3 2 1 0
		for (int i =A.length-1; i >=0; i--) { // 뒤에서 부터  7 5 3 1
			System.out.println(B[Indexb]);
			System.out.println(A[i]+"@");
			if (B[Indexb] > A[i]) { // 만약 8 >7
				
				answer ++;
				Indexb--;
			}
		}
		System.out.println(answer);
	}

}
