package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;


public class Lv6_4 {
	public int[] solution(int n, int k,int[] arr) {
		int[] answer = new int[n];

		
		for(int x : arr) {
			int pos = -1;  // ���� ���� ���°��
			for(int i = 0; i<n; i++) {   
				if (x == answer[i]) { // ���� �� 2�� ������
					pos = i; // i�� 3
				}
			}
			//ó������ �ٷ� �����
			if (pos == -1) { 
				for(int i=n-1; i>=1; i--){  //  4���� 1����
					answer[i]=answer[i-1];  // �ڷ� �з���
				}
			}else {
				for(int i=pos; i>=1; i--){   //pos�� 3�̴� 3���� 1���� �ڷ� �з����� 0�� x
					answer[i]=answer[i-1];
				}
			}
			answer[0] = x;  // 0�� ���ε��� x
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv6_4 T = new Lv6_4();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
	}
}

