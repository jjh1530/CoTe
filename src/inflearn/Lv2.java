package inflearn;

import java.util.Scanner;

public class Lv2 {
	public String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) {
			/*if (Character.isLowerCase(x)) { // x�� �ҹ�������
				answer+= Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}*/
			//�ƽ�Ű�ڵ�
			if (x >='a' && x<='z') { // 97 122
				answer+= Character.toUpperCase(x);
				// answer += (char) x-32
			}else if(x >='A' && x<='Z') {  // 65 90
				answer += Character.toLowerCase(x);  // x -32
				// answer += (char) x+32
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv2 T = new Lv2();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
