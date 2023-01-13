package inflearn;

import java.util.Scanner;

public class Lv6 {
	public String solution(String str) {
		String answer ="";
		for(int i =0; i<str.length(); i++) {
			System.out.println(str.charAt(i) +" " + i + " " + str.indexOf(str.charAt(i)) + " " + str.lastIndexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) ==i) { //처음 나온 문자의 인덱스와 i가 같으면 출력
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
