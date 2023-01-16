package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Lv5_1 {
	public String solution(String str) {
		String answer= "YES";
		Stack<Character> stack = new Stack<>();
		
		if (str.charAt(0) == ')') {
			return "NO";
		}
		
		for(int i =0; i< str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}else {
				if (stack.isEmpty()) {  // ( < 없는 경우
					return "NO";
				}else {
					stack.pop();
				}
			}
			
		}
		
		if (!stack.isEmpty()) {  // ( 괄호가 더 많아서 남은경우
			return "NO";
		}
		

		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_1 T = new Lv5_1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

