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

public class Lv5_6 {
	public int solution(int n, int k) {
		int answer= 0;
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i =1; i<=n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 1; i<k; i++) {
				q.offer(q.poll()); // 앞의 두명을 뒤로 뺌
			}
			q.poll();// k번째 사람 아웃
			if (q.size()== 1) {
				answer = q.poll();
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_6 T = new Lv5_6();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}

