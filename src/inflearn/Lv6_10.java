package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Lv6_10 {
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for(int i =1; i<arr.length; i++) {
			if (arr[i]-ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int k, int[] arr) {
		int answer= 0;
		Arrays.sort(arr);
		int lt =1;		//1
		int rt = arr[n-1]; // 9
		while(lt <= rt) {
			int mid= (lt+rt)/2;  // 5
			if (count(arr,mid)>=k) {
				answer = mid;
				lt = mid+1;
			}else {
				rt = mid-1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv6_10 T = new Lv6_10();
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

