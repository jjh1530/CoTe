package inflearn;

import java.util.Scanner;

public class Lv5 {
	public String solution(String str) {
		String answer ="";

		char[] s = str.toCharArray();
		int lt =0;
		int rt = s.length-1;
		while(lt <rt) {
			if (!Character.isAlphabetic(s[lt])) { // s�� lt�� ���ĺ��̾ƴϸ�
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) { // s[rt]�� ���ĺ��� �ƴϸ�
				rt--;
			}else {
				char tmp =s[lt]; // �ڷ� �� ���� s[lt]
				s[lt] = s[rt]; //lt = rt
				s[rt] =tmp; // rt �� �ٲ��
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
	public static void main(String[] args) {
		Lv5 T = new Lv5();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
