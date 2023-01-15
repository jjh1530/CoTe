package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lv4_02 {
	public String solution(String a, String b) {
		String answer ="YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for( char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(0, 1)+1);
		}
		for( char x : b.toCharArray()) {
			if (!map.containsKey(x)|| map.get(x) ==0) { // 키 값이 다 포함되어있지 않거나 0이면
				return "NO";
			}
			map.put(x, map.get(x)-1);
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv4_02 T = new Lv4_02();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
	}
}

