package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv2_05 {
	public int solution(int n) {
		int answer =0;
		int[] ch = new int[n+1]; //���� 0�� �迭
		for(int i =2; i<=n; i++) {
			if (ch[i] ==0) { //ó�� 2 �� 0
				answer ++;
				System.out.println(i);
				for(int j =i; j<=n; j=j+i) { // 2���� n ���� j+i(���)
					ch[j] =1; // 0�� 1�� �ٲٰ� 1�̸� ����� �ƴ�
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
