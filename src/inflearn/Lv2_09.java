package inflearn;

import java.util.Scanner;

public class Lv2_09 {
	public int solution(int n, int[][] arr) {
		int answer =Integer.MIN_VALUE;
		int sum1 =0;  //��
		int sum2 =0;  //��
		for(int i =0; i<n; i++) {
			sum1 = 0;
			sum2 = 0;
			for(int j =0; j<n; j++) {
				sum1 += arr[i][j];  // i �� j ��
				sum2 += arr[j][i]; 
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		//�밢��
		sum1 =0;
		sum2 =0;
		for(int i =0; i<n; i++) {
			sum1+= arr[i][i];
			sum2+= arr[i][n-i-1];
		}
		answer =Math.max(answer, sum1);
		answer =Math.max(answer, sum2);
		
		return answer;
	}
	public static void main(String[] args) {
		Lv2_09 T = new Lv2_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr =  new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}