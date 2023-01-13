package inflearn;

import java.util.Scanner;

public class Lv2_07 {
	public int solution(int n, int[] arr) {
		int answer =0;
		int count = 0;
		/*³»Ç®ÀÌ
		if (arr[0] == 1) {
			answer+=1;
			count =1;
		}
		for(int i =0; i<n-1; i++) {
			if (arr[i+1] ==1) {
				count++;
			}else {
				count = 0;
			}
			answer+=count;
		}*/
		for(int i =0; i<n; i++) {
			if (arr[i] == 1) {
				count++;
				answer+=count;
			}else {
				count =0;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv2_07 T = new Lv2_07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr =  new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}

}
