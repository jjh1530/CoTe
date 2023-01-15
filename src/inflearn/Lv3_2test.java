package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lv3_2test {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);
		Arrays.sort(b);
		int p1 =0;
		int p2 =0;
		while( p1 < n&& p2 < m) { // p1이나 p2가 6미만이면
			if (a[p1] == b[p2]) {
				answer.add(a[p1]);
				p1++;
				p2++;
			}else if (a[p1]>b[p2]) {
				p2++;
			}else {
				p1++;
			}
		}
		

		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_2test T = new Lv3_2test();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
		}
		for(int x : T.solution(n, m, a, b)) {
			System.out.print(x+" ");
		}
	}

}
