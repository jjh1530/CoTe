package inflearn;

import java.util.Scanner;

public class Lv1 {
	public int soulution(String str, char t) {
		int count = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		/*for(int i =0; i<str.length(); i++) {
			if (str.charAt(i)== t) {
				count ++;
			}
		}*/
		for(char s : str.toCharArray()) {
			if (s == t) {
				count++;
			}
		}
		System.out.println(count);
		int answer =count;
		return answer;
	}
	public static void main(String[] args) {
		
		Lv1 T = new Lv1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.soulution(str, c));		
	}

}
