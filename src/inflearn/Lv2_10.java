package inflearn;

import java.util.Scanner;

public class Lv2_10 {
	public int solution(int n, int[][] arr) {
		int answer =0;
		int max = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {	// 0행부터 5행
			int count =0;
			for(int j=1; j<=n; j++) {  // 0열부터 5열
				for(int k =1; k<=5; k++) {   //각 열의 학년의 값이 같은게 있으면
					if (arr[i][k] == arr[j][k]) {
						count ++;
						break;
					}
				}
			}
			if (count > max) {
				max =count;
				answer= i;
			}
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv2_10 T = new Lv2_10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr =  new int[n+1][6];
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
