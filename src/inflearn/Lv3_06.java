package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_06 {
	public int solution(int n) {
 		int answer = 0;
 		int cnt = 1;
 		n--;
 		while(n>0) {
 			cnt ++; // 2 3 4 5
 			n= n-cnt;  // 12 9 5 0
 			if (n%cnt ==0) {
				answer ++;
			}
 		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv3_06 T = new Lv3_06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
	
		System.out.println(T.solution(n));
	}

}
