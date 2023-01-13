package inflearn;

import java.util.Scanner;

public class Lv2_08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i =0; i<n; i++) {
			answer[i] = 1;
			int count = 0;
			for(int j=0; j<n; j++) {
				if (arr[i] < arr[j]) {
					count++;
				}
			}
			answer[i] +=count;
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv2_08 T = new Lv2_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr =  new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}

}
