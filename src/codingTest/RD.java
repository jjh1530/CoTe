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
			queue.add((int) (Math.ceil((100.0- progresses[i])/speed[i]))); // ���� �ϼ� ���ϱ�
		}
		System.out.println(queue);
		System.out.println(70/30);
		List<Integer> answer = new ArrayList<>();
		while(!queue.isEmpty()) {
			int day = queue.poll(); //  ť�� ���� �տ��� ���� ��
			int cnt = 1;
			while(!queue.isEmpty() && day >= queue.peek()) { // ť�� ����ְų� day(7)�� �� ���ڰ� ���� ���ں���(2) ������� 9���� ���Ƽ� cnt 2
				
				cnt++;
				queue.poll();  // 2 ����
			}
			answer.add(cnt);
		}
		System.out.println(answer);
		
	}

}
