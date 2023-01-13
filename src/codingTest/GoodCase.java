package codingTest;

import java.util.HashSet;
import java.util.Stack;

public class GoodCase {

	public static void main(String[] args) {

		String s ="()())";
		boolean answer =true;

		if (s.charAt(0) == ')') {  // )로 시작하면 false
			answer = false;
		}
		
		Stack<Character> stack = new Stack<>(); // 스택 생성 LIFO
		
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i); // c는 ( ) ( )
			if (c=='(') {      // 처음 c 가 ( 이면
				stack.push(c);  //(를 스택에 넣기
			}else {  // ) 이면  
				//스택이 비어있으면 
				if (!stack.isEmpty()) {  // 스택이 비어있지 않으면
					stack.pop();  // 맨 위에 있는 데이터 꺼냄
				}else {
					stack.push(c);
				}
			}
		}
		
		System.out.println(stack.size());
		if (stack.size() > 0 ) {
			answer = false;
		}
		System.out.println(answer);
		
		
	}

}
