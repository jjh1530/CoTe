package inflearn;

import java.util.Scanner;

public class Lv5 {
	public String solution(String str) {
		String answer ="";

		char[] s = str.toCharArray();
		int lt =0;
		int rt = s.length-1;
		while(lt <rt) {
			if (!Character.isAlphabetic(s[lt])) { // s의 lt가 알파벳이아니면
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) { // s[rt]가 알파벳이 아니면
				rt--;
			}else {
				char tmp =s[lt]; // 뒤로 갈 수는 s[lt]
				s[lt] = s[rt]; //lt = rt
				s[rt] =tmp; // rt 는 바뀐수
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
