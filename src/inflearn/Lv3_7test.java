package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_7test {
	public int solution(int n, int k, int[] arr) {
		//14 2
		//1 1 0 0 1 1 0 1 1 0 1 1 0 1
 		int answer = 0;
 		int count = 0;
 		int lt =0;
 		
 		for(int rt =0; rt<n; rt++) {
 			if (arr[rt] ==0) {
				count ++;
			}
 			while(count >k) {
 				if (arr[lt] ==0) {
					count --;
				}
 				lt++;
 			}
 			answer = Math.max(answer, rt -lt +1);
 			System.out.println(rt +" " +lt);
 		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3_7test T = new Lv3_7test();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k= kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
	
		System.out.println(T.solution(n,k,arr));
	}

}
