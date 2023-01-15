package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_05 {
	public int solution(int n) {
 		int answer = 0;
 		/*
		int limit = n/2+1;
 		int sum = 0;
		int lt =1;
		int rt =lt+1;
		for(int i =lt; i<=limit; i++) {
			rt = i+1;
			sum=i; // i로 초기화
			if (sum < n) { // sum이 n보다 작으면
				while(sum<n) {
					sum+=rt; // 1 + 2 +3 + 4 +5
					rt++;
					if (sum ==n) {
						answer++;
					}
				}
			}
		}*/
		int sum =0;
		int lt =0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i =0; i<m; i++) {
			arr[i] = i+1;
		}
		
		for(int rt =0; rt<m; rt++) {
			
			// sum이 15를 넘지 않으면 rt 계쏙 증가 15가 되면 if문
			sum+=arr[rt];  // 1 3 6 10 15 20 18 21
			if (sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum-=arr[lt];  
				lt++;
				if (sum == n) {
					answer ++;
				}
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3_05 T = new Lv3_05();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
	
		System.out.println(T.solution(n));
	}

}
