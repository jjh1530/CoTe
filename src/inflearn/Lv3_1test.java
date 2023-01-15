package inflearn;

import java.util.Scanner;

public class Lv3_1test {
	public int solution(int n, int m, int[] a) {
		int answer = 0;
		int sum =0;
		for(int i =0; i<m; i++) {
			sum+=a[i];
		}
		answer = sum;
		for(int i =m; i<n; i++) {
			sum+= a[i];
			sum-= a[i-m];
			answer = Math.max(answer, sum);
		}

		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_1test T = new Lv3_1test();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		int m=kb.nextInt();
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, m, a));
	}

}
