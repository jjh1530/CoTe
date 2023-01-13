package inflearn;

import java.util.Scanner;

public class Lv3 {
	public String solution(String str) {
		String answer ="";
		int m = Integer.MIN_VALUE;
		int pos;
		/*
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if (len>m) {
				m = len;
				answer = x;
			}
		}*/
		while((pos = str.indexOf(' '))!= -1) {  //발견되면 띄어쓰기의 인덱스 없으면 -1
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if (len> m) {
				m= len;
				answer =tmp;
			}
			str=str.substring(pos+1);
		}
		if (str.length() > m) {
			answer = str;
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv3 T = new Lv3();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine(); // 문장
		System.out.println("sdskl sd dsjkks".indexOf(' ') );
	}

}

