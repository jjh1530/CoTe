package codingTest;

import java.util.Stack;

public class Lv2Pair {

	public static void main(String[] args) {

		String s = "baabaa";
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(char x: s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == x) {  // ������� �ʰ� �ֻ�� �����Ͱ� x�� ������
				stack.pop();   // �ֻ�� ����
			}else {
				stack.push(x);  //�׳� ������ ����
			}
		}
		if (stack.isEmpty()) {
			answer =1;
		}
		System.out.println(answer);
	}

}
