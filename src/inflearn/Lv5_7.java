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

public class Lv5_7 {
	public String solution(String s, String str) {
		String answer= "NO";
		Queue<Character> q = new LinkedList<>();
		/*
		for(char x : s.toCharArray()) {
			q.offer(x);  //c b a
		}
		for(int i =0; i<str.length(); i++) {
			try {
				if (q.peek() == str.charAt(i)) {
					q.poll();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		if (q.size() ==0) {
			answer ="YES";
		}
		*/
		for(char x : s.toCharArray()) {
			q.offer(x);  //c b a
		}
		for( char x : str.toCharArray()) { // C B D A G E
			if (q.contains(x)) { // q는  C B A 인데 x가 있는지
				if (x!= q.poll()) { // 만약 B가 먼저있고 q의 순서와 다르면
					return "NO";
				}
			}
		}
		if (!q.isEmpty()) {
			answer ="NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_7 T = new Lv5_7();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String str = kb.next();
		System.out.println(T.solution(s,str));
	}
}

