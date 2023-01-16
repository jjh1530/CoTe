package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Lv5_3 {
	public String solution(String str) {
		String answer= "";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if (x == ')') {
				while(stack.pop() != '(') { //pop은 꺼내고 리턴 받음
				}
			}else {
				stack.push(x);
			}
		}
		
		for(int i =0; i<stack.size(); i++) {
			answer +=stack.get(i);
		}
		
		

		return answer;
	}
	
	public static void main(String[] args) {
		Lv5_3 T = new Lv5_3();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

