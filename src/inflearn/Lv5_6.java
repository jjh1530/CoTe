package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Lv5_6 {
	public int solution(String str) {
		int answer= 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push('(');
			}else {
				stack.pop();
				if (str.charAt(i-1) == '(') {
					answer+=stack.size();
				}else {
					answer+=1;
				}
			}
		}
		

		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_6 T = new Lv5_6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

