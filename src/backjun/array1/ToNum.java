package backjun.array1;

import java.util.Scanner;

public class ToNum {
	
	public int solution(int n,int[] arr,int k ) {
		int answer = 0;
		for(int i =0 ; i<n; i++) {
			if (arr[i] == k) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		ToNum T = new ToNum();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i< n; i++) {
			arr[i] = kb.nextInt();
		}
		int k = kb.nextInt();
		System.out.println(T.solution(n, arr,k));
		
	}

}
