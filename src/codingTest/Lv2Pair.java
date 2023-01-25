package codingTest;

import java.util.Stack;

public class Lv2Pair {

	public static void main(String[] args) {

		String s = "baabaa";
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(char x: s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == x) {  // 비어있지 않고 최상단 데이터가 x와 같으면
				stack.pop();   // 최상단 제거
			}else {
				stack.push(x);  //그냥 데이터 넣음
			}
		}
		if (stack.isEmpty()) {
			answer =1;
		}
		System.out.println(answer);
	}

}
