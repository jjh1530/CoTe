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
			int pos = -1;  // 같은 값이 없는경우
			for(int i = 0; i<n; i++) {   
				if (x == answer[i]) { // 같은 값 2가 들어오면
					pos = i; // i는 3
				}
			}
			//처음에는 바로 여기로
			if (pos == -1) { 
				for(int i=n-1; i>=1; i--){  //  4부터 1까지
					answer[i]=answer[i-1];  // 뒤로 밀려남
				}
			}else {
				for(int i=pos; i>=1; i--){   //pos가 3이니 3부터 1까지 뒤로 밀려나고 0은 x
					answer[i]=answer[i-1];
				}
			}
			answer[0] = x;  // 0은 새로들어온 x
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

