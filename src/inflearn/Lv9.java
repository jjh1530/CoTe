package inflearn;

import java.util.Scanner;

public class Lv9 {
	public int solution(String str) {
		String answer ="";
		/*��Ǯ��
		String num = "";
		for(int i =0; i<str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num += String.valueOf(str.charAt(i));
			}
		}
		answer = Integer.parseInt(num);
		System.out.println(answer);
		
		}*/
		/*Ǯ�� 1
		for(char x : str.toCharArray()) {
			if (x >=48 && x <= 57) {
				answer = answer *10 + (x-48);
			}
		}
		System.out.println(answer);*/
		for(char x : str.toCharArray()) {
			if (Character.isDigit(x)) { // x�� ��������Ȯ��
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		Lv9 T = new Lv9();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
