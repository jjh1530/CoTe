package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv2_05 {
	public int solution(int n) {
		int answer =0;
		int[] ch = new int[n+1]; //전부 0값 배열
		for(int i =2; i<=n; i++) {
			if (ch[i] ==0) { //처음 2 는 0
				answer ++;
				System.out.println(i);
				for(int j =i; j<=n; j=j+i) { // 2부터 n 까지 j+i(약수)
					ch[j] =1; // 0을 1로 바꾸고 1이면 약수가 아님
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv2_05 T = new Lv2_05();
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		System.out.println(T.solution(n));
	}
}
