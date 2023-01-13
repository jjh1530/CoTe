package codingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RD {

	public static void main(String[] args) {

		int[] progresses = {93,30,55};
		int[] speed = {1,30,5};
		Queue<Integer> queue = new LinkedList<>();
		for(int i =0; i<progresses.length; i++) {
			queue.add((int) (Math.ceil((100.0- progresses[i])/speed[i]))); // 남은 일수 구하기
		}
		System.out.println(queue);
		System.out.println(70/30);
		List<Integer> answer = new ArrayList<>();
		while(!queue.isEmpty()) {
			int day = queue.poll(); //  큐의 제일 앞에서 부터 뺌
			int cnt = 1;
			while(!queue.isEmpty() && day >= queue.peek()) { // 큐가 비어있거나 day(7)가 뺀 숫자가 다음 숫자보다(2) 높을경우 9보단 낮아서 cnt 2
				
				cnt++;
				queue.poll();  // 2 제거
			}
			answer.add(cnt);
		}
		System.out.println(answer);
		
	}

}
