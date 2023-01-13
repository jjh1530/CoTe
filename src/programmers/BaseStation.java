package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BaseStation {

	public static void main(String[] args) {
		int n = 11;
		int[] stations = {4,11};
		int w = 1;
		int answer = 0;
		int position = 1;
		/*Queue<Integer> sq = new LinkedList<>();
		for(int s : stations) {
			sq.offer(s); // 큐에 값 넣어주기
		}
		
		int position = 1;
		while(position <=N) { // 포지션이 동 전체를 돌때까지
			//sq(현재 설치 기지국)이 비어있지 않고 11 <= 6 11<=12
			if(!sq.isEmpty() &&sq.peek() - w <=position) {  //기지국의 왼쪽 전파 범위 
				position = sq.poll() +w +1; // position 은 4의 값 빼고 4 +1 +1 6
				System.out.println(position +"@@");
			}else {
				//1일 때 설치
				answer += 1;  // 기지국 설치 개수 증가 
				
				position += w *2 +1 ; //전파 범위 증가  position은 1+3으로 6 + 3 position 9 + 3 12
				System.out.println(position +"!!");
			}
		}*/
		
		int si = 0; // 스테이션 인덱스
		while(position <= n) {
			// 0 < 2  4 <= 1 ele로  0<2 4<=4 si ++  position 6   1<2 11<6 else로 position 9  1<2 11<9 
			if (si <stations.length && stations[si] -w <=position)  {  // si가 스테이션의 길이보다 작고 4-1 이 position보다 작거나 같을 때
				position = stations[si]+w +1; // position 은 4의 값 빼고 4 +1 +1 6
				System.out.println(position+"@");
				si+=1;
			}else {
				//1일 때 설치
				answer += 1;  // 기지국 설치 개수 증가 
				
				position += w *2 +1 ; //전파 범위 증가  position은 1+3으로 6 + 3 position 9 + 3 12
				System.out.println(position+"!");
			}
		}
		System.out.println(answer);
	}
}
