package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_04 {
	public int solution(int n, int m, int[] a) {
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++){
			sum+=a[rt];
			if(sum==m) answer++;
			while(sum>=m){
				sum-=a[lt++];
				if(sum==m) answer++; 
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3_04 T = new Lv3_04();
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
