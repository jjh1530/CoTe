package inflearn;

import java.util.Scanner;

public class Lv6 {
	public String solution(String str) {
		String answer ="";
		for(int i =0; i<str.length(); i++) {
			System.out.println(str.charAt(i) +" " + i + " " + str.indexOf(str.charAt(i)) + " " + str.lastIndexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) ==i) { //ó�� ���� ������ �ε����� i�� ������ ���
				answer += str.charAt(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv6 T = new Lv6();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
