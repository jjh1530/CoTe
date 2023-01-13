package inflearn;

import java.util.Scanner;

public class Lv10 {
	public String solution(String s, String t) {
		String answer ="";
		//teachermode e
		int[] a = new int[s.length()];
		int[] b = new int[s.length()];
		int p = 1000;
		for(int i =0; i<s.length(); i++) {
			
			if (String.valueOf(s.charAt(i)).equals(t)) { //t의 값과 같으면
				p =0;
				a[i] = p;
				p++;
			}else {
				a[i] = p;
				p++;
			}
		}
		
		p=1000;
		for(int i =s.length()-1; i>=0; i--) {
			
			if (String.valueOf(s.charAt(i)).equals(t)) { //t의 값과 같으면
				p =0;
				b[i] = p;
				p++;
			}else {
				b[i] = p;
				p++;
			}
		}
		for(int i =0; i<a.length; i++) {
			
			System.out.println(a[i] +"!");
			System.out.println(b[i] +"!");
			if (a[i] > b[i]) {
				answer+= b[i] +" ";
			}else if(a[i] == b[i]){
				answer += a[i] +" ";
			} else{
				answer += a[i] +" ";
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		Lv10 T = new Lv10();
		Scanner kb = new Scanner(System.in);
		String s=kb.next();
		String t=kb.next();
		System.out.println(T.solution(s,t));
	}

}
