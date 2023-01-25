package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Lv6_8 {
	public int solution(int n, int k, int[] arr) {
		int answer= 0;
		/*
		for(int i =0; i<n-1; i++) {
			for(int j = i+1;j<n; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i =0; i<n; i++) {
			if (arr[i] == k) {
				answer= i+1;
			}
		}*/
		
		Arrays.sort(arr);
		int lt = 0;
		int rt = n-1;
		while(lt<=rt) {
			int mid = (lt+rt) /2;
			if (arr[mid] == k) {
				answer=mid+1;
				break;
			}
			if (arr[mid] >k) {
				rt = mid -1;
			}else {
				lt = mid+1;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv6_8 T = new Lv6_8();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}

