package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lv3_01 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 =0;
		int p2 = 0;
		while(p1 <n && p2 <m) {
			if (a[p1] < b[p2]) {
				answer.add(a[p1]);
				p1++;
			}else {
				answer.add(b[p2]);
				p2++;
			}
			
		}
		/*
		while(p1<n) {
			answer.add(a[p1]);
			p1++;
		}
		while(p2<m) {
			answer.add(b[p2]);
			p2++;
		}
		
		int[] arr = new int[n+m];
		
		for(int i =0; i<n; i++) {
			answer.add(a[i]);
		}
		for(int i =0; i<m; i++) {
			answer.add(b[i]);
		}
		
		for(int i=0; i<answer.size(); i++) {
			arr[i] = answer.get(i);
		}
		Arrays.sort(arr);*/
		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_01 T = new Lv3_01();
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
