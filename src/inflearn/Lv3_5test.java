package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lv3_5test {
	public int solution(int n) {
 		int answer = 0;
 		int sum = 0;
 		int limit = n/2+1;
 		int lt =1;
 		for(int rt =1; rt<=limit; rt++) { //15.일 때 1~8  20 15 + 7 13+8 
 			sum+= rt;
 			if (sum == n) {
 				answer++;
			}
 			while(sum>=n) { // 15일 때 while
 				System.out.println(sum);
 				sum-=lt; // 15-1 14 니까 다시 위로 20 -2 18 20-3 15  22 -4 18-5 13 21-6 15
 				lt++;
 				if (sum == n) {
					answer++;
				}
 			}
 		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3_5test T = new Lv3_5test();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
	
		System.out.println(T.solution(n));
	}

}
