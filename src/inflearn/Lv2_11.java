package inflearn;

import java.util.Scanner;

public class Lv2_11 {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	public int solution(int n, int[][] arr) {
		int answer =0;
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				boolean flag = true;
				for(int k =0; k<dx.length; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					try {
						if (arr[nx][ny] >= arr[i][j] ) {
							flag = false;
							break;
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				if (flag) {
					answer ++;
				}
			}
		}
		//´ë°¢¼±
		
		return answer;
	}
	public static void main(String[] args) {
		Lv2_11 T = new Lv2_11();
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
