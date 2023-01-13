package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class LowNum {

	public static void main(String[] args) {
		int[] A = {1,4,2,3};
		int[] B = {1,5,4,4};
		
		int answer =0;
		
		PriorityQueue<Integer> lowQ = new PriorityQueue<>();
		PriorityQueue<Integer> HighQ = new PriorityQueue<>(Collections.reverseOrder());
		Stack<Integer> ss = new Stack<>();
		for(int i=0; i<A.length; i++) {
			lowQ.add(A[i]);
			HighQ.add(B[i]);
			ss.add(B[i]);
	
		}
		

		
		while(!lowQ.isEmpty()) {
			answer += lowQ.poll() * HighQ.poll();
 		}
		
		System.out.println(answer);
		
		Arrays.sort(A);
		Arrays.sort(B);
		int aa = 0;
		for(int i=0; i<A.length; i++) {
			System.out.println(B[i]);
			aa += A[i] * B[B.length-1-i]; // 3 - 1 -0 // 2 1 0
		}
		System.out.println(aa);
		
	}
}


/*
[5]
[4, 5]
[4, 5, 4]
[3, 4, 4, 5]
[2, 3, 4, 5, 4]
reversOrder
[5]
[5, 4]
[5, 4, 4]
[5, 4, 4, 3]
[5, 4, 4, 3, 2]
*/