package inflearn;

import java.util.Scanner;

public class Lv2_12 {
	public int solution(int n, int m,int[][] arr) {
		int answer =0;
		for(int i =1 ; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				int cnt=0;
				for(int k =0; k<m; j++) {  // ½ÃÇè È½¼ö
					int positioni = 0; 
					int positionj = 0;
					for(int s = 0; s<m; s++) { 
						if (arr[k][s] ==i) {
							positioni =s;
						}
						if (arr[k][s] == j) {
							positionj = s;
						}
					}
					if (positioni < positionj ) {
						cnt++;
					}
				}
				if (cnt ==m) {
					answer++;{
				}
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv2_12 T = new Lv2_12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr =  new int[m][n];
		for(int i =0; i<m; i++) {
			for(int j =0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n,m, arr));
	}

}
