package inflearn;

import java.util.Scanner;

public class Lv7 {
	public String solution(String str) {
		String answer ="";
		str = str.toLowerCase();
		/*
		String sb = new StringBuilder(str).reverse().toString();
		//equalsIgnoreCase -> 대소문자 구분 x
		if (str.equals(sb)) {
			answer = "YES";
		}else {
			answer ="NO";
		}*/
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if (str.charAt(i)!= str.charAt(len-i-1)) {
				answer = "NO";
			}else {
				answer = "YES";
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Lv7 T = new Lv7();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}

}
