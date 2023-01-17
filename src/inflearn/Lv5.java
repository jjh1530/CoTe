package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lv5 {
	public int solution(int n , int k) {
		int answer =0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i<n; i++) {
			q.offer(i+1);
		}
		while(!q.isEmpty()) {
			for(int i = 1; i<k; i++) { // 1 2 »©°í
				q.offer(q.poll()); // ¾Õ¿¡ µÎ°³¸¦ »©°í ´Ù½Ã ³Ö¾îÁÜ
			}
			q.poll(); // ÀÙ¿¡´Â »­
			if (q.size() == 1) {
				answer += q.poll();
			}
		}
		

		return answer;
	}
	public static void main(String[] args) {
		Lv5 T = new Lv5();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n,k));
	}

}
