package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class Lv4 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		/*for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString(); // 전체 뒤집기
			answer.add(tmp);
		}*/
		for(String x : str) {
			char[] s = x.toCharArray(); // 배열화시켜서 인덱스 이동 가능
			int lt = 0;
			int rt = x.length()-1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv4 T = new Lv4();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i =0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}

	}

}
