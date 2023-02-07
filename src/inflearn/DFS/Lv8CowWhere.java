package inflearn.DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Lv8CowWhere {
	
		int answer = 0;
		int[] dis = {1, -1, 5};
		int[] ch;
		Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s); // 시작지점
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i =0; i<len; i++) {
				int x = Q.poll();
				if (x == e) {
					answer = L;
				}
				for(int j = 0; j<3; j++) { // 1 -1 5 하기위해
					int nx = x+dis[j]; // 6 4 10
					if (nx >= 1&& nx <=10000 && ch[nx] == 0) {
						ch[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Lv8CowWhere T = new Lv8CowWhere();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		System.out.println(T.BFS(s,e));
	}

}