package inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class Lv4_05 {
	public int solution(String a, String b) {
		int answer =0;
		
		HashMap<Character, Integer> amap = new HashMap<>();
		HashMap<Character, Integer> bmap = new HashMap<>();
		int bl = b.length()-1;
		for(int i =0; i< b.length(); i++) {
			bmap.put(b.charAt(i), bmap.getOrDefault(b.charAt(i), 0) +1); // bmap 넣기
		}
		
		for(int i =0; i<bl; i++) {
			amap.put(a.charAt(i), amap.getOrDefault(a.charAt(i), 0) +1) ; //b.len -1만큼
		}
		int lt = 0;
		for(int rt = bl; rt <a.length(); rt++) {
			amap.put(a.charAt(rt), amap.getOrDefault(a.charAt(rt),0) +1) ;
			if (amap.equals(bmap)) {
				answer++;
			}
			amap.put(a.charAt(lt), amap.get(a.charAt(lt))-1);
			if (amap.get(a.charAt(lt))==0) {
				amap.remove(a.charAt(lt));
			}
			lt++;
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Lv4_05 T = new Lv4_05();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
	}
}

