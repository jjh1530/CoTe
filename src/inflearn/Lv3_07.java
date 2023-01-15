package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_07 {
	public int solution(int n, int k, int[] arr) {
		//14 2
		//1 1 0 0 1 1 0 1 1 0 1 1 0 1
 		int answer = 0;
 		int count = 0; // 0을 1로 바꾼 횟수
 		int lt = 0;
 		for(int rt =0; rt<n; rt++) {
 			if(arr[rt] == 0) {  // 5번까지 0을 1로
 				count ++;
 			}
 			while(count > k) { // rt 5번까지는 하지않음
 				if (arr[lt] == 0) {  // 5번 넘으면 arr[lt]가 0이면 count -- 
					count--;
				}
 				lt++; //3 4번 넘기면서 lt 증가
 			}
 			answer = Math.max(answer, rt-lt+1);
   		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_07 T = new Lv3_07();
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
