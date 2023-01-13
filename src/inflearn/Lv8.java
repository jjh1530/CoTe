package inflearn;

import java.util.Scanner;

public class Lv8 {
	public String solution(String str) {
		String answer ="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // ^부정 A~Z가 아니면
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp)) {
			answer ="YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv8 T = new Lv8();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.println(T.solution(str));
	}

}
