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
			sum=i; // i�� �ʱ�ȭ
			if (sum < n) { // sum�� n���� ������
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
			
			// sum�� 15�� ���� ������ rt ��� ���� 15�� �Ǹ� if��
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
