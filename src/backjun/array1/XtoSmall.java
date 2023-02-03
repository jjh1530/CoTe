package backjun.array1;

import java.util.ArrayList;
import java.util.Scanner;

public class XtoSmall {
	
	public ArrayList<Integer> solution(int n,int k ,int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i =0 ; i<n; i++) {
			if (arr[i] < k) {
				 answer.add(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		XtoSmall T = new XtoSmall();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		int k = kb.nextInt();
		for(int i = 0; i< n; i++) {
			arr[i] = kb.nextInt();
		}
	
		System.out.println(T.solution(n, k,arr));
		
	}

}
