package codingTest;

import java.util.HashSet;
import java.util.Stack;

public class GoodCase {

	public static void main(String[] args) {

		String s ="()())";
		boolean answer =true;

		if (s.charAt(0) == ')') {  // )�� �����ϸ� false
			answer = false;
		}
		
		Stack<Character> stack = new Stack<>(); // ���� ���� LIFO
		
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i); // c�� ( ) ( )
			if (c=='(') {      // ó�� c �� ( �̸�
				stack.push(c);  //(�� ���ÿ� �ֱ�
			}else {  // ) �̸�  
				//������ ��������� 
				if (!stack.isEmpty()) {  // ������ ������� ������
					stack.pop();  // �� ���� �ִ� ������ ����
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
