package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Lv4_06 {
	public int solution(int n, int k ,int[] arr) {
		int answer =-1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬
		for(int i =0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i]+ arr[j]+ arr[l]);
				}
			}
		}
		int cnt =0;
		System.out.println(Tset.first());
		System.out.println(Tset.last());
		for(int x : Tset) {
			cnt++;
			if (cnt == k) {
				answer = x;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Lv4_06 T = new Lv4_06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}
}

