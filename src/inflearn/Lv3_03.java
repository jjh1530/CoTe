package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_03 {
	public int solution(int n, int m, int[] a) {
		int answer, sum=0;
		for(int i=0; i<m; i++) sum+=a[i];
		answer=sum;
		for(int i=m; i<n; i++){
			sum+=(a[i]-a[i-m]);
			answer=Math.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3_03 T = new Lv3_03();
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
